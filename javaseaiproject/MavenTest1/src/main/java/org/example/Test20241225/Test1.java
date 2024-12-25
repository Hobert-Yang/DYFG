package org.example.Test20241225;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 題目號 771 寶石與石頭
public class Test1 {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";

        char[] chars = jewels.toCharArray();
        String[] jewels2 = new String[chars.length];
        for (int i = 0; i < chars.length; i++) {
            jewels2[i] = String.valueOf(chars[i]);
        }

        char[] chars2 = stones.toCharArray();
        String[] stones2 = new String[chars2.length];
        for (int i = 0; i < chars2.length; i++) {
            stones2[i] = String.valueOf(chars2[i]);
        }

        ArrayList<String> finalJ = new ArrayList<>();

        for (int i = 0;i < stones2.length; i++) {
            Stream<String> streamStones = Stream.of(stones2[i]);

            Stream<String> streamJewels = streamStones.filter(s -> {
                boolean flag = false;
                for (int j = 0; j < jewels2.length; j++) {

                    if (s.equals(jewels2[j])) {
                        flag = true;
                    }
                }
                return flag;
            });
            finalJ.addAll(streamJewels.collect(Collectors.toList()));
        }

        for (int i = 0;i < finalJ.size(); i++) {
            System.out.println(finalJ.get(i));
        }

        System.out.println(finalJ.size());



//        streamStones.forEach(s -> {
//            System.out.println(s);
//        });

//        System.out.println(jewels2.length);



//        streamJewels.forEach(s -> {
//            System.out.println(s);
//        });



//
//        for (String jewelSample : jewels2) {
//            Stream<String> checkstone1 = stone2.filter((String checked)->{return checked.startsWith(jewelSample);});
//
//        }





//        ArrayList<Character> jewels1 = new ArrayList<>();
//
//        for (char c : chars) {
//            Stream<String> checkstone1 = stone2.filter((String check)->{return check.startsWith(c);});
//        }

    }
}

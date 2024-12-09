<<<<<<< HEAD
package org.example.Test20241208;

// 題目號14 最長公共前綴
public class Test1 {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        char[] ch = strs[0].toCharArray();

        int finalCount = 200;
        for (int i = 0; i < strs.length; i++) {
            int count = 0;
            char[] chChange = strs[i].toCharArray();
            for (int j = 0; j < chChange.length; j++) {
                if (ch[j]==chChange[j]){
                    count++;
                }else {
                    break;
                }
            }
            finalCount = Math.min(finalCount,count);
        }

        if (finalCount > 0){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < finalCount; i++) {
                sb.append(ch[i]);
            }

            String result = sb.toString();
            System.out.println(result);
        }else {
            System.out.println("");
        }


    }
}
=======
package org.example.Test20241208;

// 題目號14 最長公共前綴
public class Test1 {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        char[] ch = strs[0].toCharArray();

        int finalCount = 200;
        for (int i = 0; i < strs.length; i++) {
            int count = 0;
            char[] chChange = strs[i].toCharArray();
            for (int j = 0; j < chChange.length; j++) {
                if (ch[j]==chChange[j]){
                    count++;
                }else {
                    break;
                }
            }
            finalCount = Math.min(finalCount,count);
        }

        if (finalCount > 0){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < finalCount; i++) {
                sb.append(ch[i]);
            }

            String result = sb.toString();
            System.out.println(result);
        }else {
            System.out.println("");
        }


    }
}
>>>>>>> 0dc6ebe (“Java”)

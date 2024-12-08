package org.example.Test20241130;

// 題目號28 找出字符串中第一個匹配項的下標
public class Test2 {
    public static void main(String[] args) {

        String str1 = "sadbutsad";
        String str2 = "sad";
        boolean flag = true;
        boolean theFirstTime = true;
        int address = 0;

        // 使用toCharArray()方法将字符串转换为字符数组
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // 创建一个String数组，长度与字符数组相同
        String[] teamString1 = new String[charArray1.length];
        String[] teamString2 = new String[charArray2.length];

        // 遍历字符数组，将每个字符转换为String并存储到String数组中
        for (int i = 0; i < charArray1.length; i++) {
            teamString1[i] = String.valueOf(charArray1[i]);
        }

        for (int i = 0; i < charArray2.length; i++) {
            teamString2[i] = String.valueOf(charArray2[i]);
        }

        for (int i = 0; i < teamString1.length; i++) {

            // 碰上後，開始檢查
            if (teamString1[i].equals(teamString2[0])) {
                // 只取第一次匹配上的地址
                if (theFirstTime){
                    address = i;
                    theFirstTime = false;
                }
                for (int j = 0; j < teamString2.length; j++) {
                    if (teamString1[i].equals(teamString2[j])) {
                        i++;
                    }else{
                        flag = false;

                    }
                }
                if (flag == false){
                    theFirstTime = true;    // 若是匹配失敗，則重新取第一次匹配的地址
                }
            }

        }

        System.out.println(flag);
        if (flag) {
            System.out.println(address);
        }else {
            System.out.println(-1);
        }

    }
}

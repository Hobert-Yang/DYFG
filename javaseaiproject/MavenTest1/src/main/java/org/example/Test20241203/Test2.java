<<<<<<< HEAD
package org.example.Test20241203;

// 題目號67.二進制求和
 class Test2 {

    // 将字符串转换为int数组的方法
    public static int[] stringToIntArray(String str) {
        // 获取字符串的长度
        int length = str.length();
        // 创建一个int数组来存储结果
        int[] intArray = new int[length];

        // 遍历字符串的每个字符
        for (int i = 0; i < length; i++) {
            // 将字符转换为char，然后减去字符'0'的ASCII值来得到对应的整数
            intArray[i] = str.charAt(i) - '0';
        }

        return intArray;
    }

    public static void main(String[] args) {
        String a = "1010";  //10
        String b = "1011";  //11

        int num1 = 0;
        int num2 = 0;

        int sum = 0;

        int[] c = stringToIntArray(a);
        int[] d = stringToIntArray(b);

        // 獲得第一個數組的二進制的和
        for (int i = 0; i < c.length; i++) {
            int tool = 1;
            if(i != c.length - 1){
                for (int j = c.length - 1; j > i;j--) {
                    tool = c[i] * tool * 2;
                }
                System.out.println("cTool=" + tool);
                num1 = num1 + tool;

            }else {
                num1 = num1 + c[c.length - 1];

            }
        }

        // 獲得第二個數組的二進制的和
        for (int i = 0; i < d.length; i++) {
            int tool = 1;
            if(i != d.length - 1){
                for (int j = c.length-1; j > i; j--) {
                    tool = d[i] * tool * 2;
                }
                System.out.println("dTool=" + tool);
                num2 = num2 + tool;

            }else {
                num2 = num2 + d[d.length - 1];

            }
        }

        sum = num1 + num2;
        System.out.println("num1=" + num1 + ",num2=" + num2);
        System.out.println(sum);

        // 使用Integer类的toBinaryString方法将十进制数转换为二进制字符串
        String binaryString = Integer.toBinaryString(sum);

        System.out.println(binaryString);

    }



}
=======
package org.example.Test20241203;

// 題目號67.二進制求和
 class Test2 {

    // 将字符串转换为int数组的方法
    public static int[] stringToIntArray(String str) {
        // 获取字符串的长度
        int length = str.length();
        // 创建一个int数组来存储结果
        int[] intArray = new int[length];

        // 遍历字符串的每个字符
        for (int i = 0; i < length; i++) {
            // 将字符转换为char，然后减去字符'0'的ASCII值来得到对应的整数
            intArray[i] = str.charAt(i) - '0';
        }

        return intArray;
    }

    public static void main(String[] args) {
        String a = "1010";  //10
        String b = "1011";  //11

        int num1 = 0;
        int num2 = 0;

        int sum = 0;

        int[] c = stringToIntArray(a);
        int[] d = stringToIntArray(b);

        // 獲得第一個數組的二進制的和
        for (int i = 0; i < c.length; i++) {
            int tool = 1;
            if(i != c.length - 1){
                for (int j = c.length - 1; j > i;j--) {
                    tool = c[i] * tool * 2;
                }
                System.out.println("cTool=" + tool);
                num1 = num1 + tool;

            }else {
                num1 = num1 + c[c.length - 1];

            }
        }

        // 獲得第二個數組的二進制的和
        for (int i = 0; i < d.length; i++) {
            int tool = 1;
            if(i != d.length - 1){
                for (int j = c.length-1; j > i; j--) {
                    tool = d[i] * tool * 2;
                }
                System.out.println("dTool=" + tool);
                num2 = num2 + tool;

            }else {
                num2 = num2 + d[d.length - 1];

            }
        }

        sum = num1 + num2;
        System.out.println("num1=" + num1 + ",num2=" + num2);
        System.out.println(sum);

        // 使用Integer类的toBinaryString方法将十进制数转换为二进制字符串
        String binaryString = Integer.toBinaryString(sum);

        System.out.println(binaryString);

    }



}
>>>>>>> 0dc6ebe (“Java”)

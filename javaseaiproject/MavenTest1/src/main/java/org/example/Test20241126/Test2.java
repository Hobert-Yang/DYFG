<<<<<<< HEAD
package org.example.Test20241126;

public class Test2 {

    // 第二題，題目號2980.檢查安位或是否存在尾隨0
    public static void main(String[] args) {

        int[] N1 = {5, 1, 2, 3, 4, 6};

        int Wk2 = 0;
        boolean Check1 = false;

        // 檢查是奇數或偶數
        for (int i = 0; i < N1.length; i++){
            int Wk1 = N1[i] % 2;

            if(Wk1 == 0){
                Wk2 = Wk2 + 1;
            }

            // 若有兩個及以上偶數，則返回true
            if (Wk2 > 1){
                Check1 = true;
            }else {
                Check1 = false;
            }
        }
        System.out.println(Check1);

    }
}
=======
package org.example.Test20241126;

public class Test2 {

    // 第二題，題目號2980.檢查安位或是否存在尾隨0
    public static void main(String[] args) {

        int[] N1 = {5, 1, 2, 3, 4, 6};

        int Wk2 = 0;
        boolean Check1 = false;

        // 檢查是奇數或偶數
        for (int i = 0; i < N1.length; i++){
            int Wk1 = N1[i] % 2;

            if(Wk1 == 0){
                Wk2 = Wk2 + 1;
            }

            // 若有兩個及以上偶數，則返回true
            if (Wk2 > 1){
                Check1 = true;
            }else {
                Check1 = false;
            }
        }
        System.out.println(Check1);

    }
}
>>>>>>> 0dc6ebe (“Java”)

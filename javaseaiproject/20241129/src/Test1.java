
// 題目號20.有效的括號
public class Test1 {
    public static void main(String[] args) {
        String str1 = "()";
        String str2 = "()[]{}";
        String str3 = "({";

        boolean smallKuoHao = true;
        int smallNum = 0;
        boolean middleKuoHao = true;
        int middleNum = 0;
        boolean bigKuoHao = true;
        int bigNum = 0;

        boolean finalCheck = true;

        char[] check1 = str3.toCharArray();
        for (int i = 0; i < check1.length; i++) {
            if (check1[i] == '(') {
                smallKuoHao = false;
                smallNum++;
            }
            if (check1[i] == ')' & smallKuoHao == false) {
                // 左括號必須正確閉合
                if(smallNum != 1){
                    finalCheck = false;
                }
                smallKuoHao = true;
                smallNum--;
            }
            if (check1[i] == '[') {
                middleKuoHao = false;
                middleNum++;
            }
            if (check1[i] == ']' & middleKuoHao == false) {
                // 左括號必須正確閉合
                if(middleNum != 1){
                    finalCheck = false;
                }
                middleKuoHao = true;
                middleNum--;
            }
            if (check1[i] == '{') {
                bigKuoHao = false;
                bigNum++;
            }
            if (check1[i] == '}' & bigKuoHao == false) {
                // 左括號必須正確閉合
                if(bigNum != 1){
                    finalCheck = false;
                }
                bigKuoHao = true;
                bigNum--;
            }
        }

        // 如果上面有一項檢查不通過則返回false，數字是否為0是檢查是否成功配對左右
        if(smallKuoHao && middleKuoHao && bigKuoHao && smallNum == 0 | middleNum == 0 | bigNum == 0){
        }else {
            finalCheck = false;
        }
        System.out.println(smallKuoHao);
        System.out.println(middleKuoHao);
        System.out.println(bigKuoHao);
        System.out.println(smallNum);
        System.out.println(middleNum);
        System.out.println(bigNum);

        System.out.println(finalCheck);
    }
}
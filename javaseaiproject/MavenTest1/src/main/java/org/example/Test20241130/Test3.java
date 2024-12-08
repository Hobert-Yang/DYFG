package org.example.Test20241130;

// 題目號29 兩數相除
public class Test3 {

    public static void main(String[] args) {

        int dividend = 7;
        int divisor = -3;
        int count = 0;

        // 分四種情況討論除數與被除數符號
        if(dividend > 0){
            if(divisor < 0){
                while (dividend + divisor > 0) {
                    count--;
                    dividend += divisor;
                }
            }else{
                while (dividend - divisor > 0) {
                    count++;
                    dividend -= divisor;
                }
            }
        // 被除數為負數的情況
        }else{
            if(divisor < 0){
                while (dividend - divisor < 0) {
                    count++;
                    dividend -= divisor;
                }
            }else{
                while (dividend - divisor > 0) {
                    count--;
                    dividend += divisor;
                }
            }
        }

        System.out.println(count);
    }
}

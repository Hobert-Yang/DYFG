package org.example.Test20241220;

public class Test1 {

    // 題目號 1037 有效的回旋鏢
    public static void main(String[] args) {
        int[][] points = {{1,1},{2,3},{3,2}};

        boolean flag = true;

        if ((points[1][0] - points[0][0] == points[2][0] - points[1][0]) && (points[1][1] - points[0][1] == points[2][1] - points[1][1])) {
            flag = false;
//            System.out.println("points[1][0] - points[0][0]" + (points[1][0] - points[0][0]));
//            System.out.println("points[2][0] - points[1][0]" + (points[2][0] - points[1][0]));
//            System.out.println("points[1][1] - points[0][1]" + (points[1][1] - points[0][1]));
//            System.out.println("points[2][1] - points[1][1]" + (points[2][1] - points[1][1]));
        }

        if ((points[0][0] == points[1][0] && points[0][1] == points[0][1]) ||
            (points[1][0] == points[2][0] && points[1][1] == points[2][1]) ||
            (points[2][0] == points[0][0] && points[2][1] == points[0][1])) {
            flag = false;
        }

        System.out.println(flag);
    }
}

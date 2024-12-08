package org.example.Test20241206;

public class Test2ErWeiShuZu {
    public static void main(String[] args) {

        int count = 0;

        int[][] dominoes = {{1,2},{2,1},{3,4},{5,6}};
        int[][] copy = dominoes;
        int finalCount = 0;
        // 遍历二维数组并处理元素
        for (int i1 = 0; i1 < dominoes.length; i1++) {
            boolean flag = true;

                for (int i2 = 0; i2 < copy.length; i2++) {
//                    System.out.println("dominoes[i1][i2]" + dominoes[i1][0] + dominoes[i1][1]);
//                    System.out.println("copy[i1][i2]" + copy[i2][0] + copy[i2][1]);

                    if (dominoes[i1][0] == copy[i2][0] & dominoes[i1][1] == copy[i2][1] & (i1 != i2)) {
                        count++;
                        flag = false;
//                        System.out.println("11111111111");
//                        System.out.println("dominoes[i1][i2]" + dominoes[i1][0] + dominoes[i1][1]);
//                        System.out.println("copy[i1][i2]" + copy[i2][0] + copy[i2][1]);
//                        System.out.println("i1=" + i1 + " i2=" + i2);
                    }
                    if (dominoes[i1][0] == copy[i2][1] & dominoes[i1][1] == copy[i2][0] & (i1 != i2)) {
                        count++;
                        flag = false;
//                        System.out.println("22222222222222");
//                        System.out.println("dominoes[i1][i2]" + dominoes[i1][0] + dominoes[i1][1]);
//                        System.out.println("copy[i1][i2]" + copy[i2][0] + copy[i2][1]);
//                        System.out.println("i1=" + i1 + " i2=" + i2);
                    }
                }
//            if (flag == false) {
//                count++;
//            }
        }

        finalCount = count / 2;
        System.out.println(finalCount);

    }
}

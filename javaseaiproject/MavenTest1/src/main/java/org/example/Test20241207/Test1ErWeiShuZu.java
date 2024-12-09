<<<<<<< HEAD
package org.example.Test20241207;

public class Test1ErWeiShuZu {

    // 題目號 1103 分糖果
    public static void main(String[] args) {
        int candies = 11;
        int num_people = 3;

        int changeCandies = candies;
        int wk1Candies = candies;

        int toChildCandies = 1;

        int[][] list = new int[candies][num_people];
        int[] kidList = new int[num_people];

        for (int i = 0; i < candies & changeCandies > toChildCandies; i++) {

            // wk1Candies非大於0則手上沒糖果了，出循環
            for (int j = 0; j < num_people && wk1Candies > 0; j++) {
                list[i][j] = toChildCandies;

                // 如果糖果不夠分了，則把剩餘的都給這個孩子
                if(wk1Candies - toChildCandies > 0){
                    kidList[j] = kidList[j] + toChildCandies;
                }else {
                    kidList[j] = kidList[j] + wk1Candies;
                }

                wk1Candies = wk1Candies - toChildCandies;
                toChildCandies++;

//                System.out.println(list[i][j]);   // 測試用，正規代碼會刪
//                System.out.println("wk1Candies=" + wk1Candies);
            }
        }
        for (int i = 0; i < kidList.length ; i++){
            System.out.println(kidList[i]);
        }
    }
}
=======
package org.example.Test20241207;

public class Test1ErWeiShuZu {

    // 題目號 1103 分糖果
    public static void main(String[] args) {
        int candies = 11;
        int num_people = 3;

        int changeCandies = candies;
        int wk1Candies = candies;

        int toChildCandies = 1;

        int[][] list = new int[candies][num_people];
        int[] kidList = new int[num_people];

        for (int i = 0; i < candies & changeCandies > toChildCandies; i++) {

            // wk1Candies非大於0則手上沒糖果了，出循環
            for (int j = 0; j < num_people && wk1Candies > 0; j++) {
                list[i][j] = toChildCandies;

                // 如果糖果不夠分了，則把剩餘的都給這個孩子
                if(wk1Candies - toChildCandies > 0){
                    kidList[j] = kidList[j] + toChildCandies;
                }else {
                    kidList[j] = kidList[j] + wk1Candies;
                }

                wk1Candies = wk1Candies - toChildCandies;
                toChildCandies++;

//                System.out.println(list[i][j]);   // 測試用，正規代碼會刪
//                System.out.println("wk1Candies=" + wk1Candies);
            }
        }
        for (int i = 0; i < kidList.length ; i++){
            System.out.println(kidList[i]);
        }
    }
}
>>>>>>> 0dc6ebe (“Java”)

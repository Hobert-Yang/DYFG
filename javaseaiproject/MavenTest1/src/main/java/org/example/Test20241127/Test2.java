<<<<<<< HEAD
package org.example.Test20241127;

public class Test2 {
    public static void main(String[] args) {

        String sentence = "this problem is an easy problem";
        String searchWord = "pro";

        System.out.println(isPrefixOfWord(sentence,searchWord));

    }

    // 題目號：1455 检查单词是否为句中其他单词的前缀
    public static int isPrefixOfWord(String sentence, String searchWord) {
        char sentenceCharArray[] = sentence.toCharArray();
        char searchWordCharArray[] = searchWord.toCharArray();

        boolean flag = false;
        int count = 1;
        int countFinal = 1;
        for (int i = 0; i < sentenceCharArray.length; i++) {

            // 記錄是第多少個單詞
            if(sentenceCharArray[i] != ' '){
                if(i > 0 && sentenceCharArray[i - 1] == ' '){
                    count++;
                }
            }

            if (sentenceCharArray[i] == searchWordCharArray[0]) {
                // 找到目標單詞後，確認是否整個單詞都被包含其中
                for (int j = 0; j < searchWordCharArray.length; j++) {
                    if ((sentenceCharArray[i + j] == searchWordCharArray[j]) & (j < searchWordCharArray.length)) {
                        // 保存第一次碰上的數據信息
                        if(flag == false){
                            countFinal = count;
                        }
                        flag = true;
                    }
                }
            }
        }
        if (flag == true) {
            return countFinal;
        }else {
            return -1;
        }

    }
}
=======
package org.example.Test20241127;

public class Test2 {
    public static void main(String[] args) {

        String sentence = "this problem is an easy problem";
        String searchWord = "pro";

        System.out.println(isPrefixOfWord(sentence,searchWord));

    }

    // 題目號：1455 检查单词是否为句中其他单词的前缀
    public static int isPrefixOfWord(String sentence, String searchWord) {
        char sentenceCharArray[] = sentence.toCharArray();
        char searchWordCharArray[] = searchWord.toCharArray();

        boolean flag = false;
        int count = 1;
        int countFinal = 1;
        for (int i = 0; i < sentenceCharArray.length; i++) {

            // 記錄是第多少個單詞
            if(sentenceCharArray[i] != ' '){
                if(i > 0 && sentenceCharArray[i - 1] == ' '){
                    count++;
                }
            }

            if (sentenceCharArray[i] == searchWordCharArray[0]) {
                // 找到目標單詞後，確認是否整個單詞都被包含其中
                for (int j = 0; j < searchWordCharArray.length; j++) {
                    if ((sentenceCharArray[i + j] == searchWordCharArray[j]) & (j < searchWordCharArray.length)) {
                        // 保存第一次碰上的數據信息
                        if(flag == false){
                            countFinal = count;
                        }
                        flag = true;
                    }
                }
            }
        }
        if (flag == true) {
            return countFinal;
        }else {
            return -1;
        }

    }
}
>>>>>>> 0dc6ebe (“Java”)

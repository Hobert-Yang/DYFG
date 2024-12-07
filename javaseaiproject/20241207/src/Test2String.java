import java.util.ArrayList;

// 題目號1021 刪除最外層的括號
public class Test2String {
    public static void main(String[] args) {

        String s = "(()())(())(()(()))";

        // 記錄是否左右匹配
        int zuo = 0;


        char[] ch = s.toCharArray();
        ArrayList<String> list = new ArrayList();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '(') {
                // 最外層的左括號不寫
                if (zuo >= 1){
                    list.add(String.valueOf(ch[i]));
                }
                zuo++;
            }
            if (ch[i] == ')') {
                zuo--;

                // 最外層的右括號不寫
                if (zuo >= 1){
                    list.add(String.valueOf(ch[i]));
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }

        String result = sb.toString();

        System.out.println(result);
    }
}

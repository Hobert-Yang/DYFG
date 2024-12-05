import java.util.ArrayList;


// Module '20241205' production: java.lang.IllegalStateException: @NotNull method org/jetbrains/jps/dependency/impl/GraphDataInputImpl$2.readUTF must not return null

// 題目號1108 IP地址無效化
public class Test3 {
    public static void main(String[] args) {

        String address1 = "1.1.1.1";
        char[] chars = address1.toCharArray();
        ArrayList<String> a = new ArrayList();

        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '.') {
                a.add("[");
                a.add(String.valueOf(chars[i]));
                a.add("]");
            }else {
                a.add(String.valueOf(chars[i]));
            }
        }

        // 放到String中儲存
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.size(); i++) {
            sb.append(a.get(i));
        }

        System.out.println(sb.toString());

//        return sb.toString();

    }

}

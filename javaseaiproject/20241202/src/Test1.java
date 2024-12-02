// 題目號32.最長有效括號
public class Test1 {
    public static void main(String[] args) {

        String s = ")()())";
        boolean readyForRight = false;
        boolean hadLeft = false;
        boolean error = false;
        int count = 0;
        int finalCount = 0;

        char[] list = s.toCharArray();
        for (int i = 0; i < list.length; i++) {

            if(list[i] == '('){
                hadLeft = true;
                if (readyForRight == false){
                    readyForRight = true;
                // 判斷是否有格式錯誤，如果有格式錯誤，則count重新算
                }else{

                    readyForRight = true;
                    error = true;
                }
            }
            if(list[i] == ')' && readyForRight == true && hadLeft == true){
                // 對應格式錯誤檢查
                if (error == false){
                    count = count + 2;
                    readyForRight = false;
                }else {
                    count = 2;
                    readyForRight = false;
                }
                // 取最大count數
                if(count > finalCount){
                    finalCount = count;
                }
            }
        }
        System.out.println(finalCount);
    }
}
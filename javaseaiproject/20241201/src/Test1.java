// 題目號31.下一個排列
public class Test1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int count = 0;
        int n = arr.length;

        // 從數組的最後一個元素開始向前遍歷
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = arr.length - 1; j > n - 1 - i; j--) {
                // 控制count，只取"下一個排列"，若之後需求改變，還可將count數增加，便於之後更新
                if (arr[j] > arr[j - 1] && count == 0) {
                    // 交换 array[j] 和 array[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    count++;

                }
            }
        }

        // 如果前後無變化，則冒泡將最小的放到最前
        if(count == 0){
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // 交换 array[j] 和 array[j + 1]
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        count++;
                    }
                }
            }
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
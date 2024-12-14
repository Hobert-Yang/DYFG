// 題目168 Excel列表名稱
public class Test1{


    // 将整数转换为Excel列名称
    public static String convertToExcelColumnName(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; // Excel列从1开始，而我们的计算从0开始，所以需要减1
            int remainder = columnNumber % 26;
            result.insert(0, (char)('A' + remainder));
            columnNumber /= 26;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        int columnNumber = 28; // 示例
        String columnName = convertToExcelColumnName(columnNumber);
        System.out.println("Excel列名称: " + columnName); // 输出: AB
    }
}
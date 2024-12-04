public class Test2split {
    public static void main(String[] args) {

        String path = "/home/user/Documents/../Pictures";

        // 找到第一個斜杠
        String[] dirs = path.split("/");
        int index = 0;
        for (String dir : dirs) {
            if (dir.equals(".") || dir.isEmpty()) {
                continue;
            }

            // 縮小多餘的'.'
            if (dir.equals("..")) {
                index = Math.max(0, index - 1);
            } else {
                dirs[index++] = dir;
                System.out.println("dir=" + dir);
                System.out.println("index=" + index);
            }
        }
        if (index == 0) {
//            return "/";
            System.out.println("/");
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < index; i++) {
            sb.append("/").append(dirs[i]);
        }
//        return sb.toString();
        System.out.println(sb.toString());

    }
}

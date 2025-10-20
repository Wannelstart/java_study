package 字符串;

public class 字符串反转_forr {
    public static void main(String[] args) {
        String str= reserver("asddfg");
        System.out.println(str);
    }

    public static String reserver(String str) {
        String result = "";
        for (int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

}

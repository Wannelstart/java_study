package 字符串;

public class 手机号屏蔽_substring {
    public static void main(String[] args) {
        //String substring(int start,int end)截取字符串，从start开始，到end结束，左闭右开
        //String substring(int start)截取字符串，从start开始，一直到字符串末尾
        //注：字符串本身不发生变化，需要重新设定一个值去接收返回值

         String phoneNumber = "13112349468";
         //截取前三位
        String start = phoneNumber.substring(0,3);
         //截取后四位
        String end = phoneNumber.substring(7);
        //拼接
        String result = start + "****" + end;

        System.out.println(result);

    }
}

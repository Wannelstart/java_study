package 字符串;

public class 初见_split_toCharArray {
    public static void main(String[] args) {


        //直接赋值
        String str1 = "Hello,World,Java,Programming";

        //字符串分割
        String[] array1 = str1.split(",");
        System.out.println("按逗号分割: " + java.util.Arrays.toString(array1));
        System.out.println();

        // 直接转换为字符数组
        char[] charArray = str1.toCharArray();
        System.out.println("原字符串: " + str1);
        System.out.println("字符数组: " + java.util.Arrays.toString(charArray));
        System.out.println();

        //使用new的方式来获取一个字符串对象
        //空参构造，可以获取一个空白的字符串对象
        String str2 = new String();
        System.out.println("@"+str2+"@");
        System.out.println();

        //传递一个字符串数组，根据字符数组的内容再创建一个新的字符串对象
        char[] chs = {'a', 'b', 'c'};
        String str3 = new String(chs);
        System.out.println(str3);
        System.out.println();

        //传递一个字节数组，根据字节数组的内容再创建一个新的字符串对象
        //以后在网络中传输的数据其实都是字节信息，我们一般要把字节信息进行转换转成字符串，此时就要用到这个构造
        byte[] bytes = {97, 98, 99};
        String str4 = new String(bytes);
        System.out.println(str4);//按照ASCLL码表进行转换






    }
}

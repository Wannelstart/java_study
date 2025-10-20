package 字符串高级用法;

public class 学习StringBuilder {
    //StringBuilder可以看成一个容器，创建之后里面的内容是可变的（字符串不可变）

    //构造方法：StringBuilder(String str)根据字符串的内容，创建可变字符串对象，
    // 若不填写str，则创建一个空的可变字符串对象

    //append()方法：在字符串末尾添加数据
    //insert()方法：在指定位置插入数据
    //reverse()方法：反转字符串
    //length()方法：获取字符串的长度
    //toString()方法：将可变字符串转换为字符串

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("asd");
        System.out.println(sb);
        //StringBuilder是java已经写好的类
        //java对其做过处理，打印对象不是地址值而是属性值




        sb.append("123");//整数
        sb.append("1.2");//浮点
        sb.append(true);//布尔
        //链式编程：sb.append().append().append()
        System.out.println(sb);




        sb.reverse();
        System.out.println(sb);




        int len = sb.length();
        System.out.println(len);


        String str = sb.toString();
        System.out.println(str);
        //反过来只需StringBuilder(str)


    }





}

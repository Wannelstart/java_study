package 字符串高级用法;

import java.util.StringJoiner;

public class 学习StringJoiner {
    public static void main(String[] args) {
        //StringJoiner也可以看成是一个容器，创建后里面的内容可变

        //构造方法：StringJoiner(间隔符号)
        //StringJoiner(间隔符号，开始符号，结束符号)
        //没有空参构造

        //add()方法：添加数据，并返回对象本身
        //length()方法：获取长度，包含间隔符号、开始和结尾符号
        //tostring()方法：将StringJoiner转换为字符串

        StringJoiner sj = new StringJoiner("---");
        sj.add("a").add("b").add("c");
        System.out.println(sj);

        StringJoiner sj2 = new StringJoiner("---","[","]");
        sj2.add("a").add("b").add("c");
        System.out.println(sj2);

        String str =sj.toString();
        System.out.println(str);



    }
}

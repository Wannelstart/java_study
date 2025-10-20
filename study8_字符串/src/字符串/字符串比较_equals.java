package 字符串;

import java.util.Scanner;

public class 字符串比较_equals {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";

        String s3 = new String("s");
        String s4 = new String("s");

        System.out.println(s1 == s2);
        System.out.println(s3 == s4);
        //对于基本数据类型，比较数据值
        //对于引用数据类型，比较地址值
        System.out.println();




        String s5 = "qwq";
        String s6 = new String("QWQ");

        //比较字符串对象中的内容是否完全相等（考虑大小写）
        boolean result1 = s5.equals(s6);
        System.out.println(result1);

        //比较字符串对象中的内容是否完全相等（不考虑大小写）
        boolean result2 = s5.equalsIgnoreCase(s6);
        System.out.println(result2);




        //键盘输入的和直接定义的比较
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s7 = sc.next();//写qwq，还是不等(因为键盘输入的还是new出来的)
        System.out.println(s7==s5);

        


    }

}

package wannel;

import java.util.Scanner;

//nextInt()方法读取一个整数
//next()方法读取字符串
//nextDouble()方法读取一个浮点数
//遇到空格、制表符、回车就停止接受。后面的数据当前不会接受，留给下一个接受

//printf("%",a)方法输出格式转化


//nextLine()方法读取一行字符串
//可以接受空格、制表符，遇到回车才停止接受数据

//两套体系不要混用，先用nextInt()再用nextLine()，nextLine()会把终止nextInt()的回车吸收掉

public class output_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字");
        int b = sc.nextInt();
        System.out.println("a+b="+(a+b));

    }
}

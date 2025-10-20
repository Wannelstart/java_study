package 字符串高级用法;

import java.util.Scanner;

public class 判断对称字符串_reverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入一个字符串：");
            String str = sc.next();

            StringBuilder sb = new StringBuilder(str);
            String reverseStr = sb.reverse().toString();

            if (str.equals(reverseStr)) {
                System.out.println("是对称字符串");
            } else {
                System.out.println("不是对称字符串");
            }

        }
    }
}

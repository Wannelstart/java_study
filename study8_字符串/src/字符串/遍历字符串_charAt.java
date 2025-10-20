package 字符串;

import java.util.Scanner;

public class 遍历字符串_charAt {
    public static void main(String[] args) {
        //public char charAt(int index):返回指定索引处的字符
        //public int length():返回此字符串的长度


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        //进行遍历
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println(c);
        }
    }
}

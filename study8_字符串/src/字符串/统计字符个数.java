package 字符串;

import java.util.Scanner;

public class 统计字符个数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        int bigCount=0, smallCount=0, numberCount=0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                bigCount++;
            }
            else if (c >= 'a' && c <= 'z') {
                smallCount++;
            }
            else if (c >= '0' && c <= '9') {
                numberCount++;
            }
        }
        System.out.println("大写字母有" + bigCount + "个");
        System.out.println("小写字母有" + smallCount + "个");
        System.out.println("数字字符有" + numberCount + "个");
    }
}

package studyagain;

import java.util.Scanner;

public class threeyuan {
    public static void main(String[] args) {
        //关系表达式？表达式1：表达式2     表达式为真，返回1的值，表达式为假，返回2的值
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个整数");
        int a = sc.nextInt();
        int b = sc.nextInt();
        String max = a > b ? "a大" : "b大";
        System.out.println(max);

    }
}

package studyagain;

import java.util.Scanner;

public class _switch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期几");
        int week = sc.nextInt();

        switch (week) {
            case 1, 2, 3, 4, 5:
                System.out.println("工作日");
                break;
            case 6, 7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("日期非法");
                break;
        }
    }
}

package 练习题;

import java.util.Scanner;

public class 调整字符串_字符数组解法_toCharArray {
    public static void main(String[] args) {
        //给定字符串A、B，若是A经过若干次旋转后(最左边字符移动到最右边)可以成为B，
        //则返回True，否则返回False
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串A：");
        String A = sc.next();
        System.out.println("请输入字符串B：");
        String B = sc.next();

        System.out.println(check(A, B));

    }

    public static boolean check(String A, String B) {
        for (int i = 0; i < A.length(); i++) {
            A = rotate(A);
            if (A.equals(B)) {
                return true;
            }
        }
        return false;

    }
    public static String rotate(String str) {
        //如果看见要修改字符串内容，两个办法
        //1.使用StringBuilder，把左边的字符截取出来拼接到右边
        //2.使用字符数组，然后调整字符数组里面的数据，最后把字符数组变成字符串


        char[] arr = str.toCharArray();

        char first = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=first;
        return new String(arr);

    }
}


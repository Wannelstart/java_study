package fangfa;

import java.util.Scanner;

public class 初见 {
    public static void main(String[] args) {
        //方法类似函数，要写在main方法外,类的里面
        //格式：public static void 方法名(){方法体}
        //调用：方法名()
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数：");
        int num2 = sc.nextInt();
        exercise(num1,num2);


    }
    public static void exercise(int num1,int num2){
        int result = num1+num2;
        System.out.println(result);
    }
}

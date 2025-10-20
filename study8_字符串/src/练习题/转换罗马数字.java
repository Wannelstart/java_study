package 练习题;

import java.util.Scanner;

public class 转换罗马数字 {
    public static void main(String[] args) {
        //键盘录入一个字符串，长度小于9，只能是数字
        //将这个数字转换为罗马数字，0变成""

        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("请输入一个数字：");
            str = sc.next();

            boolean flag  = check(str);
            if(flag){
                break;
            }else{
                System.out.println("输入有误，请重新输入");
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
//            System.out.print(change(c - '0')+" ");
            sb.append(change(c - '0')+" ");

        }System.out.println(sb);

    }



    //校验字符串是否满足规则
    public static boolean check(String str){
        if(str.length() > 9){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) < '0' || str.charAt(i) > '9'){
                return false;
            }

        }
        return true;
    }

    //将字符串转换为罗马数字
    public static String change(int number){
        String[] arr = {"","I", "II", "III", "IV", "V", "VI", "VII", "VIII","IX"};
        return arr[number];

    }
}


package 字符串;

import java.util.Scanner;

public class 登陆 {
    public static void main(String[] args) {
        String username = "admin";
        String password = "123456";


        int count = 3;
        while (count > 0) {

            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名");
            String inputUsername = sc.nextLine();
            System.out.println("请输入密码");
            String inputPassword = sc.nextLine();

            count--;

            if (inputUsername.equals(username) && inputPassword.equals(password)) {
                System.out.println("登陆成功");
                break;
            } else {
                if (count <= 0) {
                    System.out.println("登陆错误次数超限");
                } else {
                    System.out.println("登陆失败，用户名或密码有误，您还剩下" + count + "次机会");

                }
            }


        }

    }
}


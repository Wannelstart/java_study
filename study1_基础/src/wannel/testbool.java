package wannel;

import java.util.Scanner;

public class testbool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的时髦度：");
        int myfation = sc.nextInt();
        System.out.println("请输入相亲对象的时髦度：");
        int girlfation = sc.nextInt();

        boolean result = myfation > girlfation;
        System.out.println(result);

    }
}

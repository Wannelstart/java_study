package studyagain;

import java.util.Random;
import java.util.Scanner;

public class caishuzi_random {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(1, 100);
        Scanner sc = new Scanner(System.in);
        System.out.println("猜数字小程序已启动，请输入一个1-100的数字,请注意只有五次机会哦");
        int count = 0;
        while (true) {
            int guess = sc.nextInt();
            count++;
            if (count == 5) {
                System.out.println("你输了，正确答案是" + number);
                break;
            }
            if (number == guess) {
                System.out.println("恭喜你猜对了");
                break;
            } else if (number > guess) {
                System.out.println("猜小了");
            } else {
                System.out.println("猜大了");
            }
        }
    }
}

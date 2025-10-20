package test;


import java.util.Random;
import java.util.Scanner;

//投注号码为6个红球号码一个蓝球号码，红球号码从1-33中选，蓝球号码从1-16中选
public class 双色球 {


    public static void main(String[] args) {
        //生成中奖号码
        int[] arr = createNumber(args);


        //测试展示
        System.out.println("----------------------------");
        System.out.print("中奖号码为");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();//换行
        System.out.println("----------------------------");


        //用户输入自己的彩票号码
        System.out.println("请输入你的彩票号码：");
        int[] userNumber = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.println("请输入第" + (i + 1) + "个红球号码(1-33之间)");
            userNumber[i] = sc.nextInt();
        }

        System.out.println("请输入蓝球号码(1-16之间)");
        userNumber[6] = sc.nextInt();

        int redcount = 0, bluecount = 0;
        for (int i = 0; i < 6; i++) {
           int redNumber = userNumber[i];
            for (int j = 0; j < arr.length-1; j++) {
                if(redNumber == arr[j]){
                    redcount++;
                    break;
                }
            }

        }
        if (userNumber[6] == arr[6]) {
            bluecount++;
        }
        System.out.println("红球号码匹配个数：" + redcount + "个");
        System.out.println("蓝球号码匹配个数：" + bluecount + "个");

        switch (redcount) {
            case 0, 1:
                if (bluecount == 0) {
                    System.out.println("谢谢惠顾");
                }
                if (bluecount == 1) {
                    System.out.println("5r");
                }
                break;
            case 2, 3:
                if (bluecount == 0) {
                    System.out.println("谢谢惠顾");
                }
                if (bluecount == 1) {
                    System.out.println("10r");
                }
                break;
            case 4:
                if (bluecount == 0) {
                    System.out.println("10r");
                }
                if (bluecount == 1) {
                    System.out.println("200r");
                }
                break;
            case 5:
                if (bluecount == 0) {
                    System.out.println("200r");
                }
                if (bluecount == 1) {
                    System.out.println("3000r");
                }
                break;
            case 6:
                if (bluecount == 0) {
                    System.out.println("500wan");
                }
                if (bluecount == 1) {
                    System.out.println("1000wan");
                }
                break;
        }
    }

    public static int[] createNumber(String[] args) {
        int arr[] = new int[7];//放号码
        Random r = new Random();
        for (int i = 0; i < 6; ) {//循环6次，生成6个红球号码
            int readNumber = r.nextInt(1, 33);
            if (!contains(arr, readNumber)) {//去重添加
                arr[i] = readNumber;
                i++;
            }
        }
        int blueNumber = r.nextInt(1, 16);//生成蓝球号码
        arr[arr.length - 1] = blueNumber;
        return arr;
    }

    public static boolean contains(int[] arr, int number) {//判断是否重复
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }
}

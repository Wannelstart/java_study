package test;

import java.util.Scanner;

public class 买飞机票 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票月份");
        int month = sc.nextInt();
        System.out.println("请输入机票原价");
        double price = sc.nextDouble();
        System.out.println("请输入是头等舱还是经济舱");
        String type = sc.next();
        price(month,price,type);
    }

    public static void price(int month, double price, String type) {
        if (month >= 5 && month <= 10) {
            System.out.println("当前为旺季");
            if (type.equals("头等舱")) {
                System.out.println("头等舱票价为"+price*0.9);
            }
            else if (type.equals("经济舱")) {
                System.out.println("经济舱票价为"+price*0.85);
            }
            else{
                System.out.println("舱位输入有误");
            }
        }else if((month >=1 && month <=4) ||( month >=11 && month <=12)){
            System.out.println("当前为淡季");
            if (type.equals("头等舱")) {
                System.out.println("头等舱票价为"+price*0.7);
            }
            else if (type.equals("经济舱")) {
                System.out.println("经济舱票价为"+price*0.65);
            }
            else{
                System.out.println("舱位输入有误");
            }
        }else{
            System.out.println("月份输入有误");
        }

    }
}

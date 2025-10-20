package studyagain;

import java.util.Scanner;
//没有break会出现case穿透，case相当于一次性入口，会从入口处一直执行到break
public class _switch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想要的面");
        String noodles = sc.next();

        switch (noodles) {
            case "牛肉面" :
                System.out.println("有牛肉面");
                break;

            case "羊肉面":
                System.out.println("有羊肉面");
                break;

            case "牛肉拉面":
                System.out.println("有牛肉拉面");
                break;

            default:
                System.out.println("没有你这个东西");
                break;
        }

        /*特殊写法：
        switch (noodles) {
            case "牛肉面" -> {
                System.out.println("有牛肉面");
            }

            case "羊肉面"->{
                System.out.println("有羊肉面");
            }

            case "牛肉拉面"->{
                System.out.println("有牛肉拉面");
            }

            default->{
                System.out.println("没有你这个东西");
            }

        }
        */

    }
}

package studyagain;

import java.util.Scanner;

public class luoji_if {
    public static void main(String[] args) {
         //& | ! ^       与或非 异或

        /*  短路运算符     &&与&的区别在于，&&判断第一个假后不会去看第二个直接报假，若第二个包含运算，则该运算不会进行
                          ||或|的区别在于，||判断第一个真后不会去看第二个直接报真
        */

        Scanner     sc = new Scanner(System.in);
        System.out.println("请输入两个整数：");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a==6||b==6||(a+b)%6==0){
            System.out.println("true");
        }
        else if(a==7){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}

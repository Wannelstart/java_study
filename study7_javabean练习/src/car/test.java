package car;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        car[] arr = new car[3];

        Scanner sc=new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            car c = new car();//创建车对象不能写在外面，不然会被一直替换

            System.out.println("请输入汽车的品牌");
            String brand = sc.next();
            c.setBrand(brand);
            System.out.println("请输入汽车的价格");
            int price = sc.nextInt();
            c.setPrice(price);
            System.out.println("请输入汽车的颜色");
            String color = sc.next();
            c.setColor(color);

            //把汽车对象添加到数组当中
            arr[i]=c;
        }
        for (int i = 0; i < arr.length; i++) {
            car ca = arr[i];
            System.out.println(ca.getBrand()+" "+ca.getPrice()+" "+ca.getColor());
        }
    }
}

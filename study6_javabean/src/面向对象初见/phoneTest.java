package 面向对象初见;

public class phoneTest {
    public static void main(String[] args) {
        //创建手机的对象
        phone p = new phone();

        //给手机赋值
        p.brand = "小米";
        p.price = 1999;

        //获取手机对象中的值
        System.out.println(p.brand);
        System.out.println(p.price);

        //调用手机中的方法
        p.call();
        p.PlayGame();


        //再建一个新手机
        phone p2 = new phone();
        p2.brand = "小米";
        p2.price = 1999;
        p2.call();
        p2.PlayGame();
    }
}

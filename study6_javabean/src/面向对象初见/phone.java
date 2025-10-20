package 面向对象初见;

//类是共同特征的描述（设计图），对象是真实存在的具体实例
//类中包括成员变量和成员方法


//javabean类是用来描述一类事物的类，在其中不写main方法
//编写main方法的类，叫做测试类，可以在测试类中创建javabean类的对象并进行赋值调用


//类名首字母建议大写
public class phone {

    //成员变量
    String brand;
    double price;

    //成员方法
    public void call() {//加了static相当于静态方法，静态方法属于类本身而不属于对象，不能因为调用的不同而改变
        System.out.println("手机在打电话");
    }

    public void PlayGame() {
        System.out.println("手机在玩游戏");
    }



}

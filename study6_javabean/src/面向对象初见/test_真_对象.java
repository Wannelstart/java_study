package 面向对象初见;
//javabean类是用来描述一类事物的类，在其中不写main方法
//编写main方法的类，叫做测试类，可以在测试类中创建javabean类的对象并进行赋值调用

public class test_真_对象 {
    String name;
    int age;
    String habit;

    public void eat() {
        System.out.println(name + "在吃饭");
    }

    public void sleep() {
        System.out.println(name + "在睡觉");
    }


}

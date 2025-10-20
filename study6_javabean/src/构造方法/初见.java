package 构造方法;


//构造方法类似于设置默认值，在创建对象的时候就给成员变量赋值，虚拟机自动调用
//构造方法名必须和类名一致，
//构造方法没有返回值类型，不能写void，也不能写return
public class 初见 {
    private String name;
    private int age;
//若是没写任何的构造方法，虚拟机会自动给我们生成一个空参构造
//若是我们写了构造方法(有参)，那么虚拟机就不会再给我们生成空参构造了
//实际开发要把空参和带参的构造方法全写了
    public 初见() {//空参构造
        System.out.println("执行空参构造");
    }
    public 初见(String name,int age) {//带参构造
        this.name = name;
        this.age = age;
    }
//可以重载



    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}

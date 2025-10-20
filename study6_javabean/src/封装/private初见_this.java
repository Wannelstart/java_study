package 封装;


//对象代表什么，就得封装对应的数据，并提供数据对应的行为
//例如，人画圆，那么draw应在圆里而不是人里，因为需要调用圆的半径，而且是人调用的


//private是一个权限修饰符，被其修饰的成员只能在本类中才能访问,在其他类中无法被调用
public class private初见_this {
    private String name;
    private int age;
    private String habit;


    //给name赋值
    public void setName(String name) {
        //局部变量表示测试类中调用方法传递过来的数据
        //等号的左边，就表示成员位置的name
        //方法内的变量叫局部变量；方法外，类的里面叫成员变量


        //若存在局部变量和成员变量重名，在一个方法里面，会采取就近原则
        //this关键字：将方法里的变量直接引用成员变量
        this.name = name;

    }

    //对外提供name属性
    public String getName() {
        return name;
    }


    //给age赋值
    public void setAge(int age) {
        if (age >= 18 && age <= 30) {
            this.age = age;
        } else {
            System.out.println("非法参数");
        }
    }

    //对外提供age属性
    public int getAge() {
        return age;
    }

    //给habit赋值
    public void setHabit(String habit) {
        this.habit = habit;
    }

    //对外提供habit属性
    public String getHabit() {
        return habit;
    }

    public void eat() {
        System.out.println(name + "在吃饭");
    }

    public void sleep() {
        System.out.println(name + "在睡觉");
    }

}

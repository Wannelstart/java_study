package 面向对象初见;

public class test {

    public static void main(String[] args) {
        test_真_对象 g = new test_真_对象();
        g.name = "aaa";
        g.age = 18;
        g.habit = "玩游戏";

        System.out.println(g.name);
        System.out.println(g.age);
        System.out.println(g.habit);
        g.eat();
        g.sleep();
    }
}

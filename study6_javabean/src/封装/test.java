package 封装;

public class test {
    public static void main(String[] args) {
        private初见_this g = new private初见_this();
        g.setName("aaa");
        g.setAge(18);
        g.setHabit("玩游戏");

        System.out.println(g.getName());
        System.out.println(g.getAge());
        System.out.println(g.getHabit());

        g.eat();
        g.sleep();

    }



}

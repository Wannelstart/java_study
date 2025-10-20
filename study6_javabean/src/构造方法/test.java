package 构造方法;

public class test {
    public static void main(String[] args) {
        初见 r= new 初见();
        初见 s= new 初见("张三",20);
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}

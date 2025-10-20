package 练习;

import java.util.ArrayList;
import java.util.Scanner;

public class 遍历对象_student {
    public static void main(String[] args) {
        ArrayList<student> list = new ArrayList<>();
        //刚开始长度为0

        student s1 = new student("张三", 18);

        list.add(s1);

        //再键盘输入两个
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 3; i++) {
            student s = new student();
            System.out.println("请输入第" + (i+1) + "个学生的姓名");
            s.setName(sc.next());
            System.out.println("请输入第" + (i+1) + "个学生的年龄");
            s.setAge(sc.nextInt());

            list.add(s);
        }



        for (int i = 0; i < list.size(); i++) {
            System.out.print("[");
            System.out.print(list.get(i).getName() + list.get(i).getAge());

            System.out.println("]");
        }





    }
}
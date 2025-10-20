package 练习;

import java.util.ArrayList;
import java.util.Scanner;

public class 添加并查找_id_user {
    public static void main(String[] args) {
        //在main方法中定义一个集合，存入三个用户对象，id，username，password
        //要求定义一个方法，根据id查找对应用户信息

        ArrayList<user> list = new ArrayList<>();

        user u1 = new user("001", "张三", "123");
        user u2 = new user("002", "李四", "456");
        user u3 = new user("003", "王五", "789");

        list.add(u1);
        list.add(u2);
        list.add(u3);

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的id：");
        String id = sc.next();
        if (getIndex(list, id) != -1) {
            System.out.println("找到了，id索引为" + getIndex(list, id));
        } else {
            System.out.println("该id不存在");
        }


    }

    public static int getIndex(ArrayList<user> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean contains(ArrayList<user> list, String id) {
        return getIndex(list, id) >= 0;

    }
}
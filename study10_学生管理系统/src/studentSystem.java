import java.util.ArrayList;
import java.util.Scanner;

public class studentSystem {
    public static void main(String[] args) {

        ArrayList<student> list = new ArrayList<>();

        student s1 = new student("001", "张三", 18, "北京");
        student s2 = new student("002", "李四", 19, "上海");
        list.add(s1);
        list.add(s2);

        loop:
        while (true) {
            System.out.println("-----------欢迎来到学生管理系统-----------");

            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出系统");
            System.out.println("请选择你想执行的操作");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) {
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("退出系统");
                    break loop;//控指定跳出哪个循环
                    //退出方法2：System.exit(0)，表示直接停止虚拟机运行
                }
                default -> System.out.println("没有这个选项");
            }


        }
    }

    //添加学生
    public static void addStudent(ArrayList<student> list) {
        System.out.println("添加学生");
        Scanner sc = new Scanner(System.in);
        student s = new student();

        while (true) {
            System.out.println("请输入学生id");
            String id = sc.next();
            boolean flag = check(list, id);
            if (flag) {//判断id是否存在
                System.out.println("id已存在，请重新输入\n");
            }else{
                s.setId(id);
                break;
            }
        }

        System.out.println("请输入学生姓名");
        String name = sc.next();
        s.setName(name);

        System.out.println("请输入学生年龄");
        int age = sc.nextInt();
        s.setAge(age);

        System.out.println("请输入学生家庭住址");
        String address = sc.next();
        s.setAddress(address);

        list.add(s);

        System.out.println("添加成功");
    }

    //删除学生
    public static void deleteStudent(ArrayList<student> list) {
        System.out.println("删除学生");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生的id");
        String id = sc.next();
        int index = getIndex(list, id);
        if (index >= 0) {
            list.remove(index);
            System.out.println("id为"+id+"的学生删除成功");
        }else{
            System.out.println("id为"+id+"的学生不存在，删除失败");
        }
    }

    //修改学生
    public static void updateStudent(ArrayList<student> list) {
        System.out.println("修改学生");
        System.out.println("请输入要修改的学生的id");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();

        int index = getIndex(list, id);

        if(index == -1){
            System.out.println("id为"+id+"的学生不存在，修改失败\n");
            return;
        }

        student stu = list.get(index);

        System.out.println("请输入新的学生姓名");
        String newName = sc.next();
        stu.setName(newName);

        System.out.println("请输入新的学生年龄");
        int newAge = sc.nextInt();
        stu.setAge(newAge);

        System.out.println("请输入新的学生家庭住址");
        String newAddress = sc.next();
        stu.setAddress(newAddress);

        System.out.println("id为"+id+"的学生信息修改成功");
    }

    //查询学生
    public static void queryStudent(ArrayList<student> list) {
        System.out.println("查询学生");
        if (list.size() == 0) {
            System.out.println("当前没有学生信息，请添加后查询\n");
            return;
        } else {
            System.out.println("id\t\t姓名\t年龄\t家庭住址");
            for (int i = 0; i < list.size(); i++) {
                student stu = list.get(i);
                System.out.println(stu.getId() + "\t\t" + stu.getName() + "\t\t" + stu.getAge() + "\t\t" + stu.getAddress());
            }
        }

    }

    //判断id是否存在
    public static boolean check(ArrayList<student> list, String id) {
        return getIndex(list, id) >= 0;//复用代码
    }

    //根据id获取索引
    public static int getIndex(ArrayList<student> list, String id) {
        if (list.size() == 0) {
                return -1;
        }
        for (int i = 0; i < list.size(); i++) {
            student stu =list.get(i);
            String sid = stu.getId();
            if (sid.equals(id)) {
                return i;
            }
        }
        return -1;
    }


}
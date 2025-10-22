import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class app {

//主函数
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<user> user_list = new ArrayList<>();

        //测试
        user u = new user("admin1", "123456", "123456789012345678", "12345678901");
        user_list.add(u);

        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作：1、登陆 2、注册 3、忘记密码");
            String choose = sc.next();
            switch (choose) {
                case "1" -> Login(user_list);
                case "2" -> Register(user_list);
                case "3" -> ForgetPassword(user_list);
                case "4" -> {
                    System.out.println("谢谢使用，再见");
                    System.exit(0);
                }
                default -> System.out.println("没有这个选项");
            }
        }


    }

//登录
    private static void Login(ArrayList<user> list) {
        System.out.println("登陆");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {


            System.out.println("请输入用户名");

            String username = sc.next();
            boolean flag = contains(username, list);
            if(!flag){
                System.out.println("用户名不存在，请先注册");
                return;
            }

            System.out.println("请输入密码");
            String password = sc.next();

            while (true) {
                String rightCode = getCode();
                System.out.println("请输入验证码" + rightCode);
                String code = sc.next();
                if (!code.equals(rightCode)) {
                    System.out.println("验证码错误");
                    continue;
                } else {
                    System.out.println("验证码正确");
                    break;
                }
            }


            //验证用户名和密码是否对得上

            //可以将零散的数据再封装成一个对象
            //这样传递参数的时候，只需要传递一个整体

            user userInfo = new user(username, password,null,null);
            boolean flag1 = checkUser(userInfo, list);

            if(flag1){
                System.out.println("登陆成功，可以开始使用学生管理系统了");
                studentSystem ss = new studentSystem();
                ss.startStudentSystem();
                break;
            }else{
                if(i == 2){
                    System.out.println("当前用户已被锁定，请重新注册");
                    return;
                }else{
                    System.out.println("登陆失败，用户名或密码错误");
                    System.out.println("当前用户还剩"+(2-i)+"次机会");
                }
            }
        }
    }

//判断用户名和密码是否正确
    private static boolean checkUser(user userInfo, ArrayList<user> list) {
        for (int i = 0; i < list.size(); i++) {
            user u = list.get(i);
            if(u.getUsername().equals(userInfo.getUsername()) && u.getPassword().equals(userInfo.getPassword())){
                return true;
            }
        }
        return false;
    }

//注册
    private static void Register(ArrayList<user> list) {
        System.out.println("注册");
        //将用户名、密码、身份证号、手机号存在用户对象里


        //用户名,用户名长度在3-15之间，且只能是字母加数字的组合，但不能是纯数字
        //用户名唯一
        Scanner sc = new Scanner(System.in);
        String username;
        String password1;
        String personID;
        String phoneNumber;

        while (true) {
            System.out.println("请输入用户名");
            username = sc.next();
            boolean flag1 = checkuserName(username, list);

            if(!flag1){
                System.out.println("用户名不合法，请重新输入");
                continue;
            }

            //校验唯一
            boolean flag2 = contains(username, list);
            if (flag2) {
                System.out.println("用户名"+username+"已存在，请重新输入");
            }else{
                System.out.println("用户名"+username+"可以使用");
                break;
            }
        }

        //密码,键盘输入两次，两次要一致才可以进行注册
        while (true) {
            System.out.println("请输入要注册的密码");
            password1 = sc.next();
            System.out.println("请再次输入要注册的密码");
            String password2 = sc.next();
            if(!password1.equals(password2)){
                System.out.println("两次密码不一致，请重新输入");
            }else{
                System.out.println("两次密码一致，输入成功");
                break;
            }
        }

        //身份证号,18位，不能以0开头，前17位是数字，最后一位是数字或字母x/X
        while (true) {
            System.out.println("请输入身份证号");
            personID = sc.next();
            boolean flag = checkPersonID(personID);
            if(flag){
                System.out.println("身份证号"+personID+"可以使用");
                break;
            }else{
                System.out.println("身份证号"+personID+"不合法，请重新输入");

            }
            
        }

        //手机号,11位，不能以0开头，必须为数字
        while(true){
            System.out.println("请输入手机号");
            phoneNumber = sc.next();
            boolean flag = checkPhoneNumber(phoneNumber);
            if(flag){
                System.out.println("手机号"+phoneNumber+"可以使用");
                break;
            }else{
                System.out.println("手机号"+phoneNumber+"不合法，请重新输入");
            }
        }

        //将用户名、密码、身份证号、手机号存在用户对象里
        user u = new user(username,password1,personID,phoneNumber);
        list.add(u);
        System.out.println("注册成功");
        printList(list);

    }

//打印已有用户信息
    private static void printList(ArrayList<user> list) {
        for (int i = 0; i < list.size(); i++) {
            user user = list.get(i);
            System.out.println(user.getUsername()+" "+user.getPassword()+" "+user.getPersonID()+" "+user.getPhoneNumber());
        }
    }

//生成验证码
    public static String getCode() {
        ArrayList<Character> list = new ArrayList<>();

        //创建一个集合加入字母
        for (int i = 0; i < 26; i++) {
            list.add((char) ('a' + i));
            list.add((char) ('a' + i));
        }
        StringBuilder sb = new StringBuilder();

        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(list.size());
            sb.append(list.get(index));
        }

        //在最后加入一个数字
        int number = r.nextInt(10);
        sb.append(number);

        //转为字符数组
        char[] arr = sb.toString().toCharArray();
        //打乱数组
        int randomIndex = r.nextInt(arr.length);
        char temp = arr[randomIndex];
        arr[randomIndex] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        return new String(arr);
    }

//校验手机号
    private static boolean checkPhoneNumber(String phoneNumber) {
        //手机号,11位，不能以0开头，必须为数字
        if(phoneNumber.length()!=11){
            return false;
        }
        if(phoneNumber.startsWith("0")){
            return false;
        }
        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            if(!(c>='0'&&c<='9')){
                return false;
            }
        }
        return true;
    }

//校验身份证号
    private static boolean checkPersonID(String personID) {
        //身份证号,18位，不能以0开头，前17位是数字，最后一位是数字或字母x/X
        if(personID.length()!=18){
            return false;
        }
        if(personID.startsWith("0")){//startWith()方法判断字符串是否以指定字符开头
            return false;
        }
        for (int i = 0; i < personID.length()-1; i++) {
            char c = personID.charAt(i);
            if(!(c>='0'&&c<='9')){
                return false;
            }
        }
        char endchar = personID.charAt(personID.length()-1);
        if(!((endchar >='0'&& endchar <='9')||(endchar =='x')|| (endchar =='X'))){
            return false;
        }
        return true;

    }

//校验用户名是否存在
    private static boolean contains(String username, ArrayList<user> list) {
        if(list.size()==0){
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

//校验用户名是否合规
    private static boolean checkuserName(String username, ArrayList<user> list) {
        //用户名长度在3-15之间，且只能是字母加数字的组合，但不能是纯数字


        int namelength = username.length();
        int numbercount = 0;
        if (namelength < 3 || namelength > 15) {
            return false;
        }

        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if (c >= '0' && c <= '9') {
                numbercount++;
                continue;
            }
            if (!((c >= '0' && c <= '9') || !(c >= 'a' && c <= 'z') || !(c >= 'A' && c <= 'Z'))) {
                return false;
            }
        }
        if (numbercount == namelength) {
            return false;
        }
        return true;
    }

//忘记密码
    private static void ForgetPassword(ArrayList<user> list) {
        System.out.println("忘记密码");
        Scanner sc = new Scanner(System.in);
        //先判断用户名是否存在，然后根据身份照和手机号判断是否可进行修改
        System.out.println("请输入用户名");
        String username = sc.next();
        boolean flag = contains(username,list);
        if(!flag){
            System.out.println("用户名不存在，请先注册");
            return;
        }
        System.out.println("请输入身份证号");
        String personID = sc.next();
        System.out.println("请输入手机号");
        String phoneNumber = sc.next();

        //比较用户对象中的手机号码和身份证号码是否相同
        int index = findIndex(username,list);
        user u = list.get(index);
        if(!(u.getPersonID().equals(personID)&&u.getPhoneNumber().equals(phoneNumber))){
            System.out.println("身份证号或手机号错误，无权修改");
            return;
        }
        String password1;
        while (true) {
            System.out.println("请输入新的密码");
            password1 = sc.next();
            System.out.println("请再次输入密码");
            String password2 = sc.next();
            if(!password1.equals(password2)){
                System.out.println("两次密码不一致，请重新输入");
            }else{
                System.out.println("两次密码一致，输入成功");
                break;
            }
        }
        u.setPassword(password1);
        System.out.println("密码修改成功");

    }

//找用户名对应的索引
    private static int findIndex(String username, ArrayList<user> list) {
        for (int i = 0; i < list.size(); i++) {
            user u = list.get(i);
            if(u.getUsername().equals(username)){
                return i;
            }
        }
        return -1;
    }


}
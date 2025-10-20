package 练习;

import java.util.ArrayList;

public class 搜寻多次返回_phone {
    public static void main(String[] args) {

        //将价格低于3000的全部返回
        ArrayList<phone> list = new ArrayList<>();
        list.add(new phone("小米", 1999));
        list.add(new phone("华为", 2999));
        list.add(new phone("苹果", 3999));

        ArrayList<phone> list1 = getPhoneInfo(list);
        for (int i = 0; i < list1.size(); i++) {
            phone p = list1.get(i);
            System.out.println("价格低于3000的手机有"+p.getBrand() + "---" + p.getPrice());
        }


    }
//要返回多个数据，可以设置一个新的数组或者集合
    public static ArrayList<phone> getPhoneInfo(ArrayList<phone> list) {
        ArrayList<phone> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            phone p = list.get(i);
            if (p.getPrice() < 3000) {
                list1.add(p);
            }

        }
        return list1;
    }
}

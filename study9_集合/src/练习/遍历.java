package 练习;

import java.util.ArrayList;

public class 遍历 {
    public static void main(String[] args) {
        //在集合中添加字符串，并进行遍历

        //基本数据类型对应的包装类
        //byte Byte
        //short Short
        //int Integer
        //long Long
        //float Float
        //double Double
        //char Character
        //boolean Boolean

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if( i == list.size()-1){
                System.out.print(list.get(i));
            }
            else{
                System.out.print(list.get(i)+",");
            }
        }
        System.out.print("]");

    }
}

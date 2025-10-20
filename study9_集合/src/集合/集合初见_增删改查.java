package 集合;

import java.util.ArrayList;

public class 集合初见_增删改查 {
    public static void main(String[] args) {
        //集合长度自动可变，可以存引用数据类型，存基本数据类型需要转变为包装类

        ArrayList<String> list = new ArrayList<>();//泛型，指定集合中只能存String类型
        System.out.println(list);

        //add(E e) 添加，返回true
        //remove(E e) 删除指定元素，返回true（成功）和false(删除的元素不存在)
        //remove(int index) 删除指定索引的元素，返回被删除的元素
        //set(int index, E e) 修改指定索引的元素，返回被修改的元素
        //get(int index) 获取指定索引的元素，返回查询的元素
        //int size() 获取集合长度


        //添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list);

        //删除元素
        list.remove("aaa");
        System.out.println(list);


        //根据索引删除元素
        String str = list.remove(0);
        System.out.println(str);
        System.out.println(list);

        //根据索引修改元素
        String str2= list.set(0,"ddd");
        System.out.println(str2);
        System.out.println(list);

        //根据索引查询元素
        String str3 = list.get(0);
        System.out.println(str3);

        //获取集合长度
        int size = list.size();
        System.out.println(size);



    }
}

package 数组;

import java.util.Arrays;
import java.util.Random;

public class 初见 {
    public static void main(String[] args) {
        //定义数组 完整版:int [] arr = new int[]{1,2,3};
        int[] arr1 = {5, 6, 7};
        String[] arr2 = {"张三", "李四", "王五"};
        String[] arr3 = {"zhangsan", "lisi", "wangwu"};
        double[] arr4 = {1.1, 2.2, 3.3};

//        拿数组元素
//        int number =arr1[0];
//        System.out.println(number);

//        //数组遍历
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println(arr1[i]);
//        }

        //动态数组
        int[] arr5 = new int[10];
        //默认值：整数类型为0，小数类型为0.0，字符类型为空格，布尔类型为false，引用数据类型为null
        Random r = new Random();
        for(int i =0;i <arr5.length;i++){
            arr5[i]= r.nextInt(1,100);
        }

        //****打印格式为数组****
        System.out.println(Arrays.toString(arr5));

        //****整行打印(删去ln即可)****
        for (int i = 0; i < arr5.length; i++) {
            System.out.print(arr5[i]+" ");
        }
        System.out.println('\n');


        int sum=0;
        for (int i = 0; i < arr5.length; i++) {
            sum+=arr5[i];
        }
        System.out.println("数组随机数和为"+sum);
        double avg=(double)sum/arr5.length;
        System.out.println("数组随机数平均数为"+avg);
        int count = 0;
        for (int i = 0; i < arr5.length; i++) {
            if(arr5[i]<avg){
                count++;
            }
        }
        System.out.println("数组随机数小于平均数的个数有"+count+"个");






    }
}

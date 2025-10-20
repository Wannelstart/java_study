package fangfa;

import java.util.Arrays;

public class 数组复制 {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        int[] arr1=copy(arr,1,3);
        System.out.println(Arrays.toString(arr1));
    }

    public static int[] copy(int arr[],int start,int end){
        int[] arr1=new int[end-start+1];
        for(int i=start;i<=end;i++){
            arr1[i-start]=arr[i];
        }
        return arr1;
    }
}
//数据分为基本数据类型和引用数据类型，
//在进行方法的调用的时候，基本数据类型传递数值，不会影响原实际参数的值，
//而引用数据类型传递的是地址值，形参的改变，会影响实际参数的值
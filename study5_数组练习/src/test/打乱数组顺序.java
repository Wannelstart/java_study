package test;

import java.util.Random;

public class 打乱数组顺序 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

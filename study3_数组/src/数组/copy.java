package 数组;

public class copy {
    public static void main(String[] args) {
        int[] arr1 = {11, 22};
        int[] arr2 = arr1;//复制数组地址，现二者指向同一块空间
        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
        arr2[0] = 33;
        System.out.println(arr1[0]);
        System.out.println(arr2[0]);


    }
}

package 数组;

public class 二维数组_动态 {
    public static void main(String[] args) {
        int[][] arr = new int[3][5];
        arr[0][0] = 1;

        //遍历二维数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();


        //二维数组内部可以替换，改掉原来的默认值
        int[] arr1 = {11, 22};
        int[] arr2 = {33, 44, 55};
        int[] arr3 = {66, 77, 88, 99};
        arr[0] = arr1;
        arr[1] = arr2;
        arr[2] = arr3;


        //遍历二维数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

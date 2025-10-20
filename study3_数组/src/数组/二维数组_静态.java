package 数组;

public class 二维数组_静态 {
    public static void main(String[] args) {

        //静态初始化
        int[][] arr1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9, 10}};

        //获取元素

        System.out.println(arr1[0][0]);

        //************遍历*************
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }


    }
}

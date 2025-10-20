package 数组;

public class 二维数组计数 {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int yearsum=0;

        for (int i = 0; i < arr.length; i++) {
            int[] quarterarr=arr[i];
            int quartersum=getsum(quarterarr);
            System.out.println("第"+(i+1)+"季度总成绩为"+quartersum);
            yearsum+=quartersum;
        }
        System.out.println("年度总成绩为"+yearsum);
    }

    public static int getsum(int[] arr) {
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
}

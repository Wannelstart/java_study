package fangfa;


//public static 返回值类型 方法名(){方法体；return 返回值}


public class return_fangfa {
    public static void main(String[] args) {
    int sum =getsSum(10,12,12);
        System.out.println(sum);
    }

    public static int getsSum(int num1, int num2, int num3) {
        int result = num1 + num2 + num3;
        return result;
    }

}

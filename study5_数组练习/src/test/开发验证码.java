package test;

//长度为5，前四位是大写字母或者小写字母，最后一位是数字

import java.util.Random;

public class 开发验证码 {
    public static void main(String[] args) {

        //创建一个52长度的数组，用于存放大小写字母，可以用数组下标当做随机索引值
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i < 26) {
                chs[i] = (char) (65 + i);
            } else {
                chs[i] = (char) (97 + i -26);
            }
        }
        //随机生成4个字母，随机生成一个数字
        String result = "";//用于存放验证码
        Random number = new Random();
        for(int i =0; i<4;i++){
            int index = number.nextInt(chs.length);
            result +=chs[index];

        }
        int index = number.nextInt(10);
        result +=index;

        System.out.println(result);

    }
}


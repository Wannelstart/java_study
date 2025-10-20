package 字符串;

public class 敏感词替换_replace {
    public static void main(String[] args) {
        //String replace(char oldChar,char newChar)用newChar替换oldChar

        String talk = "你玩的不错，下次别玩了，cnm，sb";

        //定义一个敏感词库
        String[] arr={"cnm","sb","tmd","mlgb"};

        for(int i = 0;i<arr.length;i++){
            talk = talk.replace(arr[i],"***");
        }

        System.out.println(talk);

    }
}

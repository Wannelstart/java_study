package phone;

public class test {
    public static void main(String[] args) {
        phone[] arr = new phone[3];

        phone p1 = new phone("苹果", 9999, "黑色");
        phone p2 = new phone("华为", 8888, "白色");
        phone p3 = new phone("小米", 7788, "红色");

        arr[0]=p1;
        arr[1]=p2;
        arr[2]=p3;

        int sum=0;

        for (int i = 0; i < arr.length; i++) {
            phone p=arr[i];
            sum= sum+p.getPrice();
        }


        int avg=sum/arr.length;
        double avg2=sum*1.0/arr.length;
        System.out.println(avg);
        System.out.println(avg2);
    }

}

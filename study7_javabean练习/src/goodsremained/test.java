package goodsremained;

public class test {
    public static void main(String[] args) {
        goods[] arr= new goods[3];
        goods g1=new goods("001","huawei",6000,100);
        goods g2=new goods("002","xiaomi",5000,100);
        goods g3=new goods("003","apple",8000,100);


        arr[0]=g1;
        arr[1]=g2;
        arr[2]=g3;

        for (int i = 0; i < arr.length; i++) {
            goods g=arr[i];
            System.out.println(g.getId()+","+g.getName()+","+g.getPrice()+","+g.getRemaining());
        }
    }
}

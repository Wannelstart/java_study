package goodsremained;

public class goods {
    private String id;
    private String name;
    private double price;
    private int remaining;


   public goods(){}
   public goods(String id,String name,double price,int remaining){
       this.id=id;
       this.name=name;
       this.price=price;
       this.remaining=remaining;
   }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRemaining() {
        return remaining;
    }

    public void setRemaining(int remaining) {
        this.remaining = remaining;
    }
}

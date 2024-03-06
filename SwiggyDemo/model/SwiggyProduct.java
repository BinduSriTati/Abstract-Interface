package SwiggyDemo.model;

public abstract class SwiggyProduct {
    private String type;
    private int price;

    public SwiggyProduct(String type, int price) {
        this.type = type;
        this.price = price;
    }


    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }
}

package SwiggyDemo.model;

public class OrderItem {
    SwiggyProduct product;
    private int qty;
    private int price;

    public OrderItem(SwiggyProduct product, int qty, int price) {
        this.product = product;
        this.qty = qty;
        this.price = price;
    }

    public SwiggyProduct getProduct() {
        return product;
    }

    public int getQty() {
        return qty;
    }

    public int getPrice() {
        return price=qty*product.getPrice();
    }
}


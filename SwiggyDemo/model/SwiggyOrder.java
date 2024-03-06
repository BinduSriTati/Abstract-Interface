package SwiggyDemo.model;

public abstract class SwiggyOrder {
    private int orderId;
    private String foodItem;
    private int quantity;
    private int totalAMount;
    public abstract void calculateTotalAmount();
    public abstract void displayOrderDetails();

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(String foodItem) {
        this.foodItem = foodItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotalAMount() {
        return totalAMount;
    }

    public void setTotalAMount(int totalAMount) {
        this.totalAMount = totalAMount;
    }
}

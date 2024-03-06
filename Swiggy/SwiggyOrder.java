package Swiggy;

public abstract class SwiggyOrder implements SwiggyPaymentService{
    private int orderId;
    private String foodItem;

    private int quantity;
    public int totalAmount;
    public String restaurantName;
    public String deliveryAddress;


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

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }
}

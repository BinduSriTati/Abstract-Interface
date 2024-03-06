package SwiggyDemo.model;

import Swiggy.SwiggyOrder;

public abstract class PhonePay extends SwiggyOrder {
    private int balance;
    private int pin;
    private int price;

    public PhonePay(int balance, int pin, int price) {
        this.balance = balance;
        this.pin = pin;
        this.price = price;
    }

    @Override
    public void calculateTotalAmount() {
        setTotalAmount(getQuantity()*price);
    }

    @Override
    public void displayOrderDetails() {
        System.out.println("order ID:"+getOrderId());
        System.out.println("food item:"+getFoodItem());
        System.out.println("quantity:"+getQuantity());
        System.out.println("total amount:"+totalAmount);


    }
}

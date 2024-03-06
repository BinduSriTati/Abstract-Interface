package SwiggyDemo.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    public List<OrderItem> orderItemList=new ArrayList<>();
    public double price;
    public double serviceCharges;
    public int tipAmt;
    private String status;

    public Order(double price, double serviceCharges, int tipAmt) {
        this.price = price;
        this.serviceCharges = serviceCharges;
        this.tipAmt = tipAmt;
    }
    public Order(){

    }

    public void addItem(OrderItem item){
        orderItemList.add(item);
        price=price+item.getPrice();


    }
    public void removeItem(OrderItem item1){
        orderItemList.remove(item1);
    }
    public List<OrderItem> getOrderItemList(){
        return orderItemList;
    }
    public double getServiceCharges(){
        return serviceCharges;
    }
    public int getTipAmt(){
        return tipAmt;
    }

    public double getPrice() {
        return price;
    }

    public void setOrderItemList(List<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }
    public String getstatus(){
        return status;

    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setServiceCharges(int serviceCharges) {
        this.serviceCharges = serviceCharges;
    }

    public void setTipAmt(int tipAmt) {
        this.tipAmt = tipAmt;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

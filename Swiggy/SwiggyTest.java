package Swiggy;

public class SwiggyTest {
    public static void main(String[] args) {
        PhonePayService phonePayService=new PhonePayService(23,"crabs fry",2,"Shah Gouse",
                "KPHB 5 phase","Order Confirm");
        phonePayService.calculateTotalAmount();
        phonePayService.displayOrderDetails();
        phonePayService.phonePay();
    }
    }


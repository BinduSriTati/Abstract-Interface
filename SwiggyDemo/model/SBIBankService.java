package SwiggyDemo.model;

import SwiggyDemo.model.PaymentRequest;
import SwiggyDemo.model.PaymentResponse;

import java.util.Date;
import java.util.UUID;

public class SBIBankService {
    public String accountNumber="1234";
    private double amt=500;
    private String merchantAcountNumber="5678";
    private double merchantAmt=200;
    public PaymentResponse transfer(PaymentRequest request) {
        System.out.println(request.getTransId());
        if (request.isMerchantDebit()) {
            merchantAmt = merchantAmt - request.getAmt();
            amt = amt + request.getAmt();
        } else {
            amt = amt - request.getAmt();
            merchantAmt=merchantAmt+ request.getAmt();

        }
        PaymentResponse response=new PaymentResponse(UUID.randomUUID().toString(),new Date(),"status");
        return response;
    }
}

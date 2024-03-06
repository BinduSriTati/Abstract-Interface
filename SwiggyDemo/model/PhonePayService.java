package SwiggyDemo.model;

import java.util.UUID;

public class PhonePayService implements SwiggyPaymentService {
    @Override
    public PaymentResponse payment(PaymentRequest request) {
        PaymentRequest paymentInitiationRequest=new PaymentRequest("Swiggy"+UUID.randomUUID().toString(),
                request.getAmt(), request.getTxDate(), "5546",false);
        SBIBankService sbiBankService=new SBIBankService();
        return sbiBankService.transfer(paymentInitiationRequest);
    }
}

package SwiggyDemo.model;

import SwiggyDemo.model.PaymentRequest;
import SwiggyDemo.model.PaymentResponse;

public interface SwiggyPaymentService {
    PaymentResponse payment(PaymentRequest request);
}

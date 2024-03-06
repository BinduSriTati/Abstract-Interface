package SwiggyDemo.model;

import java.util.Date;

public class PaymentRequest {
    private String transId;
    private double amt;
    private Date txDate;
    private String merchantId;
    private boolean merchantDebit;


    public PaymentRequest( double amt, Date txDate) {
        this.amt = amt;
        this.txDate = txDate;

    }

    public PaymentRequest(String transId, double amt, Date txDate, String merchantId, boolean merchantDebit) {
        this.transId = transId;
        this.amt = amt;
        this.txDate = txDate;
        this.merchantId = merchantId;
        this.merchantDebit = merchantDebit;
    }

    public String getTransId() {
        return transId;
    }

    public double getAmt() {
        return amt;
    }

    public Date getTxDate() {
        return txDate;
    }

    public boolean isMerchantDebit() {
        return merchantDebit;
    }

    public String getMerchantId() {
        return merchantId;
    }
}

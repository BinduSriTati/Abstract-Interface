package SwiggyDemo.model;

import java.util.Date;

public class PaymentResponse {
    private String coRelationId;
    private Date responseDate;
    private String status;

    public PaymentResponse(String coRelationId, Date responseDate, String status) {
        this.coRelationId = coRelationId;
        this.responseDate = responseDate;
        this.status = status;
    }

    public String getCoRelationId() {
        return coRelationId;
    }

    public Date getResponseDate() {
        return responseDate;
    }

    public String getStatus() {
        return status;
    }
}

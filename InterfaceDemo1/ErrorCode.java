package InterfaceDemo1;

public enum ErrorCode {
    NEOTERIC_ERROR_OTP_1000("NEOTERIC ERROR 1000","Invalid OTP"),
    NEOTERIC_EXPIRY_OTP_1001("NEOTERIC.EX_OTP","Expired OTP");
    String code;
    String message;

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
    ErrorCode(String code,String message){
        this.code=code;
        this.message=message;
    }
}

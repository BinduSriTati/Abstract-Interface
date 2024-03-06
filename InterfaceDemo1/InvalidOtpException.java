package InterfaceDemo1;

public class InvalidOtpException extends Exception {
    private String code;

    public InvalidOtpException(String errorcode, String message) {
        super(message);
        this.code = errorcode;
    }

    public String getCode() {
        return code;
    }
}

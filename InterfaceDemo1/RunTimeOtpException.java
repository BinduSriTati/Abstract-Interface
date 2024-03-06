package InterfaceDemo1;

public class RunTimeOtpException extends RuntimeException{
    private String code;
    public RunTimeOtpException(String code,String message) {
        super(message);
        this.code = code;
    }


    public String getCode() {
        return code;
    }
}

package InterfaceDemo1;

public class InvalidRunTimeException extends Exception{
    private String code;
    public InvalidRunTimeException(String code,String message) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

}

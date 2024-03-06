package Exception;

public class ExceptionDemoClient {
    public static void main(String[] args) {
        ExceptionService exceptionService=new ExceptionService();
        exceptionService.greet(null);
    }
}

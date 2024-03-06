package InterfaceDemo1;

public class  SBILoginTest {
    public static void main(String[] args) {
        BankLoginService loginService=new SBILoginProcess();
        try {
            boolean Loginstatus = loginService.login("bindu", "222");
            if (Loginstatus) {
                System.out.println("login successful");
            } else {
                System.out.println("login unsuccessful");
            }
        }catch ( RunTimeOtpException e){
            System.out.println(e.getCode()+" "+e.getMessage());
        }
    }

}

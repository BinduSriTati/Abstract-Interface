package InterfaceDemo1;

import java.util.UUID;

public class SBILoginProcess implements BankLoginService{
    SBILoginService sbiLoginService;
    public SBILoginProcess(){
        this.sbiLoginService=new SBILoginService();
    }
    //public SBILoginProcess(SBILoginService sbiLoginService){
        //this.sbiLoginService=new SBILoginService();

    //}

    @Override
    public boolean login(String username, String password) {
        if(sbiLoginService.login(username, password)){
            String otp= sbiLoginService.generateOtp(username);
            boolean validateOtp=false;
            try {
                validateOtp= sbiLoginService.validateOtp(UUID.randomUUID().toString());
            }catch (InvalidOtpException exp){
                System.out.println("Error occured"+exp);
                throw new RuntimeException();
            }catch (Exception e){

            }
            //boolean val= sbiLoginService.validateOtp(otp);
            if(validateOtp){
                System.out.println("valid otp & login is successful");
            }else{
                System.out.println("login failed");
            }
            return validateOtp;
        }else{
            System.out.println("invalid credentials");
            return false;
        }

    }
}

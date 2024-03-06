package InterfaceDemo1;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class SBILoginService implements BankOtpValidation {
    String AccountNumber = "1233";
    String password = "555";
    String otp;
    Date otpExpireTime;

    public SBILoginService() {

    }

    @Override
    public boolean login(String username, String password) {
        if (username.equals(AccountNumber) && this.password.equals(password)) {
            return true;
        }
        return false;
    }


    @Override
    public String generateOtp(String accountNumber) {
        if (this.AccountNumber.equals(accountNumber)) {
             otp = UUID.randomUUID().toString();
             Calendar otpExpiryCalendar=Calendar.getInstance();
             otpExpiryCalendar.add(Calendar.SECOND,67);
            System.out.println("otpExpiryCalendar"+otpExpiryCalendar.getTime());
            otpExpireTime = otpExpiryCalendar.getTime();
            return otp;


        }
        return null;
    }

    @Override
    public boolean validateOtp(String otp) throws InvalidOtpException{
        if (this.otp.equals(otp)) {
            return true;
        } else {
            System.out.println("Invalid otp");
            throw new InvalidOtpException(ErrorCode.NEOTERIC_ERROR_OTP_1000.getCode(), ErrorCode.NEOTERIC_ERROR_OTP_1000.getCode());

        }
    }
}


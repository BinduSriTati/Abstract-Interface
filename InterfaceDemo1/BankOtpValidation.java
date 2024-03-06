package InterfaceDemo1;

public interface BankOtpValidation extends BankLoginService
{
    String generateOtp(String accountNumber);
    boolean validateOtp(String otp) throws Exception;
}

package InterfaceDemo1;

public class HDFCLoginService implements BankLoginService {
    String AccountNumber = "1567";
    String password = "555";


    @Override
    public boolean login(String username, String password) {
        if (username.equals(AccountNumber) && this.password.equals(password)) {
            return true;
        }
        return false;

    }
}

package SwiggyDemo.model;

public class PhoneNumber {
    public static void main(String[] args) {
        String phoneNumber="1234567890";
        int sum=0;
        for(int i=0;i<phoneNumber.length();i++) {
            char c = phoneNumber.charAt(i);
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);

            }
        }
        System.out.println("Sum of digits in the phone number: " + sum);
    }
}

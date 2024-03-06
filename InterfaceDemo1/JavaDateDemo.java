package InterfaceDemo1;

import java.util.Calendar;
import java.util.Date;

public class JavaDateDemo {
    public static void main(String[] args) {
        Date otpExpireTime=new Date();
        System.out.println(otpExpireTime);
        long currentTime=System.currentTimeMillis();
        Date currentTimeDate=new Date(currentTime);
        System.out.println(currentTimeDate);
        Calendar currentcalendar= Calendar.getInstance();
        System.out.println("calendar" +currentcalendar);
        Calendar otpExpiryCalendar=Calendar.getInstance();
        otpExpiryCalendar.add(Calendar.SECOND,60);
        System.out.println("otpExpiryCalendar"+otpExpiryCalendar.getTime());
    }
}

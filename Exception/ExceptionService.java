package Exception;

public class ExceptionService {
    public String greet(String input ){
        String uppercase=null;
        try{
           uppercase=input.toUpperCase();

        }finally {
            {
                System.out.println("from finally block ");
            }
            return uppercase;
        }

    }
}

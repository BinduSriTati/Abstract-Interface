package Exception;

import java.io.FileInputStream;

public class CustomExceptionService {
    public String checkedException() {
        try {
            throw new Exception("throw checkedException");

        } catch (Exception e) {
            throw new RuntimeException(e);

        } finally {
            System.out.println("from checkedexception ");
        }
        // throw new Exception("throw checkedException");

    }

    public String checkedException2() throws Exception {
       // FileInputStream inputStream = new FileInputStream("abc");
        //try {
            throw new Exception("throw checkedException");

        } //catch (Exception e) {
           // throw new RuntimeException(e);

        //} finally {
           // System.out.println("from checkedexception ");
        //
        // }
        public String unCheckedException () {
            throw new RuntimeException(" throw unchecked exception");

        }

    }


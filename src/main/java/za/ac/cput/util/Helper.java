package za.ac.cput.util;
/*Helper .java
 Author: Bavuyise Mpila(216061067)
 Date 07 April 2023
*/
import org.apache.commons.validator.routines.EmailValidator;

import java.util.UUID;

public class Helper {
    public static boolean isNullorEmpty(String s){
        return (s==null||s.isEmpty()||s.equalsIgnoreCase("null"));

    }
    public static  boolean isValidEmail(String email){
        EmailValidator ev = EmailValidator.getInstance();
        return ev.isValid(email);
    }
    public static String generatedId(){
        return UUID.randomUUID().toString();
    }











}


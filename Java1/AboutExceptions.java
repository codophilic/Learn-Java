import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class InvalidAgeException extends RuntimeException {

    public InvalidAgeException(String exceptionMsg){

        super(exceptionMsg);

        /**
         * Or using System.out.println or System.out.print if not to use super
         */
    }
}

class CompileTimeAgeCheckerException extends Exception{

    public CompileTimeAgeCheckerException(String msg){
        super(msg);
    }
}


public class AboutExceptions{
    public static void main(String[] args) throws IOException {

        int a[] = new int[5];
        try{
            int i=19;
            int j=19;
            System.out.println(j/i);
            System.out.println("Accessing element "+a[10]);
        }
        catch(ArithmeticException ae){
            System.out.println("Cannot divided number by 0");
        }
        catch(ArrayIndexOutOfBoundsException aiobe){
            System.out.println("You are trying to access and element which is greater than the actual size of array");
        }
        catch(Exception e){ // Don't know if any other exception occurs.
            System.out.println("Got an exception "+e);
        }


        int num=10;
        int den=0;
        try{
            if(den==0)
                throw new ArithmeticException("Cannot Divided number by 0");
            else
                System.out.println(num/den);
        }catch(ArithmeticException eden){
            System.out.println(eden);
        }

        String myBirthDate="01-11-1999";
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); 
        try {
            Date parsedDate = dateFormat.parse(myBirthDate);
        } catch (ParseException e) {
        
            System.out.println("Date is not in proper format");
        }

        try{
            System.out.println("Division - "+division(5,0)); // Ducking occurs
        }catch(ArithmeticException de){
            System.out.println("Division method failed");
        }

        try{
            throw new OutOfMemoryError();
        }catch(Throwable var){
            System.out.println("Out of memory occurred");
        }

        try{
            throw new ArithmeticException();
        }catch(Throwable var){
            System.out.println("Arithmetic Exception occurred");
        }

        int age=-5;
        try{
            if(age<0)
            throw new InvalidAgeException("Age is negative");
        }
        catch(InvalidAgeException iae){
            System.out.println(iae);
        }

        int Age=1000;
        try {
            System.out.println(display(Age));
        } catch (CompileTimeAgeCheckerException eage) {
            System.out.println(eage);
        }

        try{
            // Statements
        }
        finally{
            //Statements
        }

        try{
            throw new IOException();
        }catch(Exception e){
            System.out.println("Inside catch block");
        }

    }

        // Method ducks the ArithmeticException,NullPointerException by declaring it with 'throws'
    public static int division(int num,int den) throws ArithmeticException,NullPointerException{
        return num/den;
    }

    public static String display(int age) throws CompileTimeAgeCheckerException{
        if(age>100)
            throw new CompileTimeAgeCheckerException("Age is greater than 100");
        return "Age is valid";
    }
}
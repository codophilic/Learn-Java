import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AboutExceptions{
    public static void main(String[] args) {

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
            System.out.println("Division - "+division(5,0));
        }catch(ArithmeticException de){
            System.out.println("Division method failed");
        }
    }

    public static int division(int num,int den) throws ArithmeticException("Custom Exception Message"),NullPointerException{
        return num/den;
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class CustomResource implements AutoCloseable {
    private boolean isClosed = false;

    public void doSomething() {
        if (isClosed) {
            throw new IllegalStateException("Resource is already closed!");
        }
        System.out.println("Doing something with the resource");
    }

    @Override
    public void close() {
        isClosed = true;
        System.out.println("Resource closed");
    }

    public boolean isClosed() {
        return isClosed;
    }
}


public class AboutResources {
    public static void main(String[] args) throws IOException {
        
        
        try(
            // Mention your resources related statements over here
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Scanner sc = new Scanner(new InputStreamReader(System.in))
        ){
            System.out.println("Enter a input for Buffer Reader: ");
            int n1=Integer.parseInt(br.readLine());
            System.out.println("Enter a input for Scanner: ");
            int n2=sc.nextInt();
            System.out.println(n1+n2);
            throw new ArithmeticException();
        }catch(ArithmeticException e){
            System.out.println("Catch block");
        }

        try (CustomResource custResource = new CustomResource();
            ) {
                custResource.doSomething();
                // custResource=null;
                // custResource=new CustomResource();
        }catch(Exception e){
            System.out.println("Business Logic Exception");
        }

        try (CustomResource custResource = null
        ) {
        }
        System.out.println("Code Executed");
    }
}

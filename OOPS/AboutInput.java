import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class AboutInput {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number");
        int num1=System.in.read(); // Checked Exception
        System.out.println(num1);

        /**
         * BufferReader
         */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    }
}

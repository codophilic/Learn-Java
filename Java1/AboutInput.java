import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class AboutInput {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number");
        int num1=System.in.read(); // Checked Exception
        System.out.println(num1);
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;

        // Wrap the streams with buffered streams
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);

        try {
            int byteData;
            // Read bytes from the console and write them to the console
            while (true) {
                byteData=bufferedInputStream.read();
                if(byteData==49)  // Press 1 to exit program
                    break;
                bufferedOutputStream.write(byteData);
                bufferedOutputStream.flush(); // Ensure the byte is immediately displayed
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedInputStream.close();
                bufferedOutputStream.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        Reader reader = new InputStreamReader(System.in);
        Writer writer = new OutputStreamWriter(System.out);

        // Wrap the streams with buffered streams
        BufferedReader bufferedReader = new BufferedReader(reader);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        try {
            String line;

            // Read lines from the console and write them to the console
            while (true) {
                line = bufferedReader.readLine();
                if(line.equals("1")) //Exit when press 1
                    break;
                bufferedWriter.write(line);
                bufferedWriter.newLine(); // Add a newline after each line
                bufferedWriter.flush();   // Ensure the line is immediately displayed
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                bufferedWriter.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int num = scanner.nextInt();
        System.out.println("You entered: " + num);
        scanner.close();
    }
}

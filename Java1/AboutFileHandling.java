import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class AboutFileHandling {
    public static void main(String[] args) {
        String filePath = "characterStreamExample.txt";

        /**
         * Here we are using try-with-resource block to close resources
         */

        // Step 1: Create and Write initial content to the file
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("Hello, world!\n");
            writer.write("This is the first content.\n");
            System.out.println("File created and initial content written.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Step 2: Update the content of the file (append new content)
        try (FileWriter writer = new FileWriter(filePath, true)) { // 'true' enables appending
            writer.write("This is the updated content.\n");
            System.out.println("File updated with new content.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Step 3: Read the content of the file
        try (FileReader reader = new FileReader(filePath)) {
            int data;
            System.out.println("Reading file content:");

            /**
             * When you read data using FileReader, the stream decodes the bytes from the file 
             * and converts them into their corresponding Unicode values (integers). 
             * This is why the FileReader.read() method returns an int — 
             * because it's returning the Unicode code point of the character, not the raw byte data.
             * 
             * Example: The byte sequence representing "A" in UTF-8 might be 0x41. 
             * When you read it using FileReader, it converts this byte into the Unicode value 65 
             * (which is the Unicode value for the character 'A').
             * 
             * Casting this int to a char gives you the actual character that corresponds to the Unicode code point
             * -1 is used in the read() method in Java is to signal the end of the file (EOF).
             * 
             * Why -1? 
             *  - Valid character/byte values (usually between 0 and 65535 for char values, or 0 to 255 for byte values).
             * -1 is used as a sentinel value to signal that there is no more data to read (i.e., you've reached the end of the file).
             */

            while ((data = reader.read()) != -1) {
                System.out.print((char) data);  // Output file content character by character
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Step 4: Delete the file
        File file = new File(filePath);
        if (file.delete()) {
            System.out.println("\nFile deleted successfully.");
        } else {
            System.out.println("\nFailed to delete the file.");
        }




        String BytefilePath = "byteStreamExample.txt";
        
        // Step 1: Create and write initial content to the file using FileOutputStream
        try (FileOutputStream outputStream = new FileOutputStream(BytefilePath)) {
            String initialContent = "Hello, world..!\nThis is the first content.\n";
            outputStream.write(initialContent.getBytes(StandardCharsets.UTF_8));
            System.out.println("File created and initial content written.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Step 2: Update the file (append new content)
        try (FileOutputStream outputStream = new FileOutputStream(BytefilePath, true)) { // 'true' enables appending
            String updatedContent = "This is the updated content.\n";
            outputStream.write(updatedContent.getBytes(StandardCharsets.UTF_8));
            System.out.println("File updated with new content.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Step 3: Read the content of the file using FileInputStream
        try (FileInputStream inputStream = new FileInputStream(BytefilePath)) {
            byte[] data = new byte[inputStream.available()];
            int bytesRead = inputStream.read(data);
            if (bytesRead != -1) {
                String fileContent = new String(data, StandardCharsets.UTF_8);
                System.out.println("Reading file content:");
                System.out.println(fileContent);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Step 4: Delete the file
        File bytefile = new File(BytefilePath);
        if (bytefile.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }

}

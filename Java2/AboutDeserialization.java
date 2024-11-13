import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class AboutDeserialization {
    public static void main(String[] args) {
        try (FileInputStream fileIn = new FileInputStream("person.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
             
            Person person = (Person) in.readObject();  // Deserialize the object
            System.out.println("Deserialized Person: " + person);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

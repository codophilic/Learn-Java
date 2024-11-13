import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    static String name="ABC";
    int age;
    transient String password;  // This field will not be serialized
    
    public Person(int age, String password) {
        this.age = age;
        this.password = password;
    }
    
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", password='" + password + "'}";
    }
}



public class AboutSerialization {
    public static void main(String[] args) {
        Person person = new Person( 30, "secretPassword");
        
        try (FileOutputStream fileOut = new FileOutputStream("person.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
             
            out.writeObject(person);  // Serialize the object
            System.out.println("Person object serialized to person.ser file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

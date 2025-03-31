
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;

public class AboutSingleton {
    public static void main(String[] args) throws Exception{
        // Singleton obj1 = Singleton.getInstance();
        // Singleton obj2 = Singleton.getInstance();
        // System.out.println(obj1 == obj2); // True, both references point to the same object
        // Singleton obj3=null;
        // Constructor[] constructors
        //         = Singleton.class.getDeclaredConstructors();
        //     for (Constructor constructor : constructors) {
        //         // Below code will destroy the singleton
        //         // pattern
        //         constructor.setAccessible(true);
        //         obj3
        //             = (Singleton)constructor.newInstance();
        //         break;
        //     }
        //     System.out.println(obj1 == obj3); // False, both references point to the different object

        //     PreventBreakingSingleton p1 = PreventBreakingSingleton.SingleInstance;
        //     PreventBreakingSingleton p2 = PreventBreakingSingleton.SingleInstance;

        //     System.out.println(p1 == p2); // True, both references point to the same object

        //     try {
        //     Singleton instance1 = Singleton.getInstance();
        //     ObjectOutput out = new ObjectOutputStream(
        //         new FileOutputStream("file.text"));
        //     out.writeObject(instance1);
        //     out.close();
 
        //     // deserialize from file to object
        //     ObjectInput in = new ObjectInputStream(
        //         new FileInputStream("file.text"));
 
        //     Singleton instance2
        //         = (Singleton)in.readObject();
        //     in.close();
 
        //     System.out.println(instance1==instance2);

        // }
 
        // catch (Exception e) {
        //     e.printStackTrace();
        // }

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = (Singleton) obj1.clone();
     
        System.out.println(obj1 == obj2); // False, both references point to the different object

    }
}

class Singleton implements Serializable, Cloneable{
    private static Singleton instance;

    private Singleton() {
        // // Private constructor to prevent external instantiation
        // if(instance!=null){
        //     throw new RuntimeException("Exception msg: You are trying to change the visibility of constructor");
        // }
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("Singleton doing something...");
    }

    @Override
    public Object clone()
        throws CloneNotSupportedException
    {
        return super.clone();
    }
        // // implement readResolve method
        // protected Object readResolve() { return instance; }

}

enum PreventBreakingSingleton{
    SingleInstance;
}
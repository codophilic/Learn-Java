import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


class UserDefinedClass{
    public String name;
    private int Salary;
    public static String companyName="GOOGLE";

    UserDefinedClass(){
        System.out.println("UserDefinedClass default constructor");
    }

    protected UserDefinedClass(int Salary){
        this.name="NOT PROVIDED";
        this.Salary=Salary;
    }

    private UserDefinedClass(String name){
        this.name=name;
        this.Salary=0;
    }

    public UserDefinedClass(String name,int Salary){
        this.name=name;
        this.Salary=Salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

}

class PrivateMethods{
    private void display(int i){
        System.out.println("Private Method display() , integer value - "+i);
    }
}

public class AboutReflectionApi {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException,Exception {

        Class checkClass = Class.forName("UserDefinedClass");
        System.out.println(checkClass);

        System.out.println("All Constructors");
        Constructor[] getAllConstructors=checkClass.getDeclaredConstructors();
        for(Constructor i: getAllConstructors){
            System.out.println(i); // Prints out fully qualified name of Constructor
        }

        System.out.println("All Fields");
        Field[] getAllFields=checkClass.getDeclaredFields();
        for(Field i: getAllFields){
            System.out.println(i); // Prints out fully qualified field name
        }

        System.out.println("All Methods");
        Method[] getAllMethods=checkClass.getDeclaredMethods();
        for(Method i:getAllMethods){
            System.out.println(i); // Prints out fully qualified method name
        }
        
        // Loading the Class
        Class privateMethodClass = Class.forName("PrivateMethods");

        // Creating a new instance of the class
        PrivateMethods pm=(PrivateMethods)privateMethodClass.getDeclaredConstructor().newInstance();

        // Getting the private method by passing method name
        Method displayM=privateMethodClass.getDeclaredMethod("display",int.class); // Another parameter is variable arguments which representing the types of the method's argument required for the method.

        // Making private method accessible
        displayM.setAccessible(true);

        // Calling method based on the instance created.
        displayM.invoke(pm,30); // Passing value
    }
}

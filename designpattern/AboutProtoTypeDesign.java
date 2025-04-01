class Address implements Cloneable{
    String city;
    Address(String city) {
        this.city = city;
    }

    // Clone method to duplicate object without calling constructor
    @Override
    protected Object clone() throws CloneNotSupportedException {
            return super.clone();
    }
}

class Employee implements Cloneable{
    private String name;
    private String department;
    Address address;  // Nested object

    public Employee(String name, String department, Address address) {
        this.name = name;
        this.department = department;
        this.address=address;
        System.out.println("Expensive object creation process...perform API calls, network calls and DB calls");
    }

    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', department='" + department + "', lives in " + address.city+";}";
    }

    // Clone method to duplicate object without calling constructor
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Employee cloned = (Employee) super.clone();
        cloned.address = (Address) this.address.clone(); // Deep copy of nested object
        return cloned;
    }
    
}

public class AboutProtoTypeDesign {
    public static void main(String[] args) throws Exception {
        Address address = new Address("New York");
        Employee emp1 = new Employee("Alice", "IT",address);

        // Cloning emp1 instead of creating a new object
        Employee emp2 = (Employee) emp1.clone(); //Deep Copy
        emp2.setName("Bob"); // Change only the name


        // Two Different Objects of Employee
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp1.hashCode());
        System.out.println(emp2.hashCode());
        // Two Different Object of Employee pointing to same object memory address for Address Class
        System.out.println(emp1.address.hashCode());
        System.out.println(emp2.address.hashCode());

        // Changing in One will affect other employee objects
        emp1.address.city="Mumbai";
        System.out.println(emp1);
        System.out.println(emp2);
    }
}

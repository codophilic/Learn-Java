import java.util.HashSet;
import java.util.Set;
import java.util.Objects;



class Employee{
    String name;
    int salary;

    public Employee(String name, int salary){
        this.name=name;
        this.salary=salary;
    }

    @Override
    public boolean equals(Object o){
        /**
         * Comparing two object, e1.equals(e2)
         * e1-> refers 'this' or current object
         * e2-> refers 'o' the second object
         */
        if (this == o) return true; //e1==e1
        if (o == null || getClass() != o.getClass()) return false;
        Employee e2 = (Employee) o;
        /** Deep Comparison */
        /** the below return can be also re-written as (salary==e2.salary && name.equals(e2.name)) */
        return (this.salary==e2.salary && this.name.equals(e2.name));
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }
}


public class AboutEqualsHashCodeContract {
    public static void main(String[] args) {
        Employee e1=new Employee("ABC", 1000);
        Employee e2=new Employee("ABC", 1000);

        /** Shallow Comparison */
        System.out.println(e1==e2); // false

        /** Deep Comparison by overriding default equals method */
        System.out.println(e1.equals(e2)); // true

        Set<Employee> empSet= new HashSet<>();

        empSet.add(e1);
        empSet.add(e2);
        System.out.println(empSet);

        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());

    }
}

record Person(int age,String name){
    Person() {
        this(2,"ABC");
    }

    static int count=0;

    public void display(){
        System.out.println(count);
    }
}

public class AboutRecordClass {
    public static void main(String[] args) {
        
        Person p = new Person(20, "ABC");
        System.out.println("Name: "+p.name());
        Person p1=new Person(20,"ABC");

        // Equals Contract
        if(p.equals(p1)) {
            System.out.println("Objects are equal");
        }

        // Hashed Contract
        System.out.println(p.hashCode());
        System.out.println(p1.hashCode());
    }
}

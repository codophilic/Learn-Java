
class ABC{

    int age;
    String name;

    ABC(){ //constructor or No-Args Constructor
        System.out.println("Constructor of ABC");
        age=10;
        name="Harsh";
        System.out.println("Name: "+name+", age:"+age);
    }

    ABC(int age,String name){ // Constructor overloading
        this.age=age;
        this.name=name;
        System.out.println("Constructor with arguments of ABC");
        System.out.println("Name: "+name+", age:"+age);
    }
}

public class AboutConstructor {
    public static void main(String[] args) {

        /**
         * Object initialized and reference is assigned to abc 
         */
        ABC abc=new ABC();
        ABC abc1=new ABC(24,"Meet");
    }
}

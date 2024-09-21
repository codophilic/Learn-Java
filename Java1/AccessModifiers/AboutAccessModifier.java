package AccessModifiers;

class A{
    private int i;

    public int fetchPrivateVariable(){
        display();
        return i;
    }

    private void display(){
        System.out.println("Private method");
    }
}

class B{
    protected int i;

    protected void show(){
        System.out.println("Protected method show of B");
    }
}

class MyClass { // Accessible only within the same package
    int packagePrivateNumber; // Default access modifier

    void displayPackagePrivate() {
        System.out.println("Default (package-private) method");
    }
}


public class AboutAccessModifier {
    public static void main(String[] args) {
        
        A a=new A();
        System.out.println("Accessing private variable via method - "+a.fetchPrivateVariable());

        B b= new B();
        b.show();

    }
}

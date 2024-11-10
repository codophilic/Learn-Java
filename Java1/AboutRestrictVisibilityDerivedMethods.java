class Dog{

    // Default Method
    void bark(){
        System.out.println("Dog Barks");
    }
}

class Corgis extends Dog{

    // Protected Method
    @Override
    protected void bark(){
        System.out.println("Corgi Barks");
    }
}


public class AboutRestrictVisibilityDerivedMethods {
    public static void main(String[] args) {
        
        Dog d = new Corgis();
        d.bark();

    }
}

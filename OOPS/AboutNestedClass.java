class N1{ // Non-Static class
    int i;

    public void display(){
        System.out.println("In N1 class");
    }

    class N2{
        public void display(){
            System.out.println("In N2 class");
        }
    }

    static class N3Static{
        public void display(){
            System.out.println("In N3Static");
        }
    }
}




public class AboutNestedClass {
    public static void main(String[] args) {
        
        N1 n1 = new N1();
        n1.display();

        /**
         * Create reference variable for non-static nested class using outer class object
         */
        N1.N2 n2 = n1. new N2();
        n2.display();

        /**
         * Create reference variable for static nested class using outer class object
         */
        N1.N3Static n3 = new N1.N3Static();
        n3.display();
    }
}

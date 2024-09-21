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


class OnceTobeUsed{

    public void show(){
        System.out.println("In OnceTobeUsed");
    }
}

abstract class AbstractOnceTobeUsed{
    abstract public void display();
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

        /**
         * Anonymous Inner class
         */
        OnceTobeUsed utb = new OnceTobeUsed(){
            public void show(){
                System.out.println("Anonymous Class");
            }
        };

        //utb is reference variable of anonymous {...} inner class and not OnceTobeUsed
        utb.show();

        /**
         * Here AbstractOnceTobeUsed is abstract class we cannot create object of it
         * but in the below code `new AbstractOnceTobeUsed(){...}` here we are creating object of anonymous inner class
         */
        AbstractOnceTobeUsed abc= new AbstractOnceTobeUsed() {
            public void display(){
                System.out.println("Abstract Anonymous Inner class");
            }
        };
        abc.display();
    }
}

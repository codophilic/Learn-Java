class X{
    X(){
        System.out.println("Default Constructor of X");
    }

    X(int i){
        System.out.println("Parameterized constructor of X");
    }
    public void show(){
        System.out.println("Class X show method");
    }

    public void test(){
        System.out.println("Class X test method");
    }
}

class Y extends X{
    Y(){
        super();
        System.out.println("Default Constructor of Y");
    }
    Y(int i){
        super(i);
        System.out.println("Parameterized constructor of Y");
    }
    Y(double d){
        this();
        System.out.println("Parameterized double constructor of Y");
    }
    public void display(){
        super.show();
        System.out.println("Class Y Display method");
    }

    public void test(){ // Method Overriding
        System.out.println("Class Y test method");
    }
}

public class AboutSuperAndThis {
    public static void main(String[] args) {
        Y y= new Y();
        y.display();
        y.test();

        /**
         * Calling Y parameterized constructor
         */
        Y y1=new Y(5);

        /**
         * Calling Y parameterized double constructor
         */
        Y y2=new Y(5.1);

    }
}

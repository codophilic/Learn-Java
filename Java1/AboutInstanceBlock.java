class Object1A{

    int speed;
    //Instance block
    {
        System.out.println("Instance block executed");
        speed=50;
        System.out.println("Given Default speed value "+speed);
    }

    Object1A(){
        System.out.println("Default Constructor");
        System.out.println("Speed value "+speed);
    }

    Object1A(int updatedSpeed){
        System.out.println("Parameterize Constructor or Constructor Overloading");
        speed+=updatedSpeed;
        System.out.println("Speed value "+speed);
    }
}


public class AboutInstanceBlock{
    public static void main(String[] args) {
        Object1A a = new Object1A();
        Object1A a1 = new Object1A(100);
    }
}
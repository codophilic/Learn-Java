
interface A{
 void show();
}

interface B{
    void show();
}

class C implements A,B{
    public void display(){
        System.out.println("Display C");
    }
    
    @Override
    public void show(){
        System.out.println("SHOW C");
    }
    

}

public class Main {
    public static void main(String[] args) {
        
        C c = new C();
        c.show();
        System.out.println("Try programiz.pro");
    }
}
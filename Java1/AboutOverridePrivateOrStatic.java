// class Aprivate{
//     private void method1(){
//         System.out.println("In Aprivate");
//     }
// }

// class Bprivate extends Aprivate{

//     @Override
//     private void method1(){

//     }
// }

// class AStatic{
//     public static void method1(){
//         System.out.println("In AStatic");
//     }
// }

// class BStatic{
//     @Override
//     public static void method1(){
//         System.out.println("In AStatic");
//     }
// }

class AParentClass{
    public static void display(){
        System.out.println("In Class AParentClass");
    }
}

class BChildClass extends AParentClass{

    public static void display(){
        System.out.println("In Class BChildClass");
    }
}



public class AboutOverridePrivateOrStatic {
    public static void main(String[] args) {
        
        AParentClass apc= new BChildClass();
        apc.display();

        AParentClass apc1 = new AParentClass();
        apc1.display();
    }
}

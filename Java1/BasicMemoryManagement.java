
class Calculator{

    int instanceVar; // Instance variable
    public int add(int n1,int n2){
        return n1+n2; // Local Variables
    }
}

public class BasicMemoryManagement{
    public static void main(String[] args) {

        int localVar=10;
        Calculator calc=new Calculator();
        int sum=calc.add(5, 4);
        System.out.println(sum);
        calc.instanceVar=6;
        System.out.println(calc.instanceVar);

        Calculator calc1=new Calculator();
        calc1.instanceVar=16;
        System.out.println(calc1.instanceVar);
    }
}
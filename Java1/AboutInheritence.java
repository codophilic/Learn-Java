class BasicCalculator{ // Parent Class or Super Class
    public int add(int n1, int n2){
        return n1+n2;
    }

    public int subtract(int n1,int n2){
        return n1-n2;
    }

    public void reset(){
        System.out.println("Reset value to 0");
    }
}


class CompleteCalculator extends BasicCalculator{ // Child Class or Sub Class 
    public int multiply(int n1,int n2){
        return n1*n2;
    }

    public double division(int n1,int n2){
        return (double)n1/n2;
    }

    public void reset(){ // Preference given to child class
        System.out.println("Reset value to 1");
    }
}

class AdvanceCalculator extends  BasicCalculator{

    public void scifyCalculations(){
        System.out.println("Scientific calculations");
    }
}

public class AboutInheritence{
    public static void main(String[] args) {
        BasicCalculator bc=new BasicCalculator();
        System.out.println("Addition of 5 and 4 - "+bc.add(5,4));
        System.out.println("Subtraction of 5 and 4 - "+bc.subtract(5,4));
        bc.reset();

        CompleteCalculator cc=new CompleteCalculator();
        System.out.println("Multiply 5 and 4 - "+cc.multiply(5,4));
        System.out.println("Divide 5 and 4 - "+cc.division(5,4));
        System.out.println("Addition of 5 and 4 - "+cc.add(5,4));
        System.out.println("Subtraction of 5 and 4 - "+cc.subtract(5,4));
        cc.reset();


        AdvanceCalculator ac= new AdvanceCalculator();
        ac.reset();
    }
}
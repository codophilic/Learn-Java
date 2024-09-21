class AssignedNumbers{

    int num1;

    public void assigned(int num1){
        this.num1=num1;
    }
    public void display(){
        System.out.println("Number value is - "+num1);
    }
}

public class AboutThis {
    
    public static void main(String[] args) {
        
        AssignedNumbers a = new AssignedNumbers();
        a.assigned(5);
        a.display();
    }
}

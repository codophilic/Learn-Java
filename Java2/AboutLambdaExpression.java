package Java2;

@FunctionalInterface
interface A{
    void show();
}

@FunctionalInterface
interface B{
    void doubleTheValue(int i);
}

@FunctionalInterface
interface Addition{
    int add(int n1,int n2);
}

public class AboutLambdaExpression{
    public static void main(String[] args) {
        
        /**
         * Anonymous class
         */
        // A a = new A() {
        //     public void show(){
        //         System.out.println("In A show");
        //     }
        // };

        A a = () ->System.out.println("In A show");
        a.show();

        // B b = (int val)->{
        //     System.out.println("Number entered : "+val);
        //     System.out.println("Doubled value is " +val*val);
        // };
        B b = val->{
            System.out.println("Number entered : "+val);
            System.out.println("Doubled value is " +val*val);
        };
        b.doubleTheValue(5);

        // Addition addvalues = (int i,int j) -> {
        //     return i+j;
        // };

        Addition addvalues = (int i,int j) ->  i+j;
        System.out.println(addvalues.add(6, 5));
        
    }
}
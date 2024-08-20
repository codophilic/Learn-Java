public class SwitchStatements{
    public static void main(String args[]){

        int x=10;

        /**
         * Based on the case value the statement under the case will be executed
         * Here wherever the case gets matched , below that all statement will be include, because we have not specified `break` key word
         * thats why all statements will get executed
         */
        switch(x){
            case 0:
                System.out.println("Zero");
            case 10:
                System.out.println("Equal"); 
            case 30:
                System.out.println("Not Equal");           
            default: // if no cases matches, then print a default statement
                System.out.println("Undefined");
             
        }

        int y=10;

        /**
         * Only executes the require case statement is printed out.
         */

        switch(y){
            case 0:
                System.out.println("Zero");
            case 10:
                System.out.println("Equal"); 
                break; // break out the block
            case 30:
                System.out.println("Not Equal");
                break;      
            default:
                System.out.println("Undefined");
             
        }

    }
}
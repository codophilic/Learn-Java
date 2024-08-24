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

        /**
         * Week days scheduler
         */
        String currentWeekday="Monday";
        switch (currentWeekday) {
            case "Monday": System.out.println("I Would wake up at 6 am");
                break;
            case "Tuesday": System.out.println("I Would wake up at 6 am");
                break;        
            default:
                System.out.println("I Would wake up at 6 am");
        };

        /**
         * Alternative way to write the above switch case using ->
         */
        switch(currentWeekday){
            case "Monday" -> System.out.println("I Would wake up at 6 am");
            case "Tuesday" -> System.out.println("I Would wake up at 6 am");
            default -> System.out.println("I Would wake up at 6 am");        
        }

        /**
         * Alternative way to write the above switch case using -> and also returing
         */
        String timeans=switch(currentWeekday){
            case "Monday" -> "I Would wake up at 6 am";
            case "Tuesday" -> "I Would wake up at 6 am";
            default -> "I Would wake up at 6 am";        
        };
        System.out.println(timeans);

        /**
         * Using yield
         */
        /**
         * Alternative way to write the above switch case using yield
         */
        String ans = switch(currentWeekday){
            case "Monday": yield "I Would wake up at 6 am";
            case "Tuesday": yield "I Would wake up at 6 am";
            default: yield "I Would wake up at 6 am";        
        };
        System.out.println(ans);

        /**
         * Alternative way to write the above switch case using yield
         */
        String ans1 = switch(currentWeekday){
            case "Monday"-> {
                yield "I Would wake up at 6 am";
            }
            case "Tuesday" -> {
                yield "I Would wake up at 6 am";
            }
            
            default -> {
                yield  "I Would wake up at 6 am";
            }   
        };
        System.out.println(ans1);

    }
}
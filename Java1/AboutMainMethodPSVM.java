public class AboutMainMethodPSVM {
    static public void main(String... args) {
        System.out.println("Main String method");
        for(String i:args){
            System.out.println(i);
        }

        // Explicitly calling the overloaded main method with an int array
        int[] intArgs = {1, 2, 3};
        main(intArgs);  // Call to overloaded main method    
    }

    public static void main(int[] args) {
        System.out.println("Main Int method");
        for(int i:args){
            System.out.println(i);
        }
    }


}

class childClass extends AboutMainMethodPSVM{
    public static void main(String[] args) {
        System.out.println("Child main");
    }
}

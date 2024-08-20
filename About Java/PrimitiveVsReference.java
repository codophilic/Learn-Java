public class PrimitiveVsReference {
    public static void main(String[] args) {
        // Primitive data type (int)
        int num1 = 10;
        int num2 = num1;

        // Changing num2 doesn't affect num1
        num2 = 20;

        System.out.println("num1: " + num1); // Output: 10
        System.out.println("num2: " + num2); // Output: 20

        // Reference data type (String)
        String str1 = "Hello";
        String str2 = str1;
        
        /**
         * Here str1 and str2 referece the same object
         * thats why we get same hash code
         */

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        /**
         * The moment a new object is assigned it changes the reference
         */
        str2 = "World";

        System.out.println("str1: " + str1); // Output: Hello
        System.out.println("str2: " + str2); // Output: World

        /**
         * New References
         */
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

    }
}
public class Operators {
    public static void main(String[] args) {
        int a=61;
        int b=30;

        /**
         * Basic operators
         */
        System.out.println("Addition - " +a+b);
        System.out.println("Substraction - " +(a-b));
        System.out.println("Multiplication - " +a*b);
        System.out.println("Quotient - " +a/b);
        System.out.println("Modulo - " +a%b);
        System.out.println("Division in point decimal - " +(float)a/b);

        /**
         * Shorthand operators
         */
        a+=10;
        System.out.println("Compound Operation1 - "+a);
        b-=10;
        System.out.println("Compound Operation2 - "+a);


        /**
         * Increment/Decrement operators
         */
        /**
         * Pre-increment - first increment itself then it gives the output.
         * Post-increment - first gives output then does the increment
         */
        System.out.println("Pre-increment operator - "+(++a));
        System.out.println("Post-increment operator - "+(b++));

        System.out.println("Pre-decrement operator - "+(--a));
        System.out.println("Post-decrement operator - "+(b--));

        /**
         * Relational Operators
         * - Always returns a boolean value
         */
        System.out.println(10>20); // Greater than
        System.out.println(10<20); // Less than
        System.out.println(10==20); // Equals
        System.out.println(10!=20); // Not Equals
        System.out.println(20>=10); // Greater than Equals
        System.out.println(10<=20); // Less than Equals

        /**
         * Logical Operators
         * - Logical operators are used to perform logical “AND”, “OR” and “NOT” operations, i.e. the function
         *   similar to AND gate and OR gate in digital electronics. They are used to combine two or more conditions/constraints or
         *   to complement the evaluation of the original condition under particular consideration.
         */

         System.out.println(true & false); // AND of (true AND false) -> false similarly to (1 AND 0) -> 0
         System.out.println(true | false); // OR of (true OR false) -> true similarly to (1 OR 0) -> 1
         System.out.println(!true); // NOT of (NOT of true) -> false similarly to NOT of 1 -> 0

         /**
          * short-circuit evaluation
            - This means that if the value of an expression can be determined based on the left operand alone, 
              the right operand is not evaluated at all. While this can be useful for optimizing code and preventing unnecessary computations
          * - Example, 
            Short circuit AND (false && true && true)
              The && operator is a short-circuiting logical AND. It means that if the first operand is false, 
              Java does not evaluate the second operand because the entire expression cannot possibly be true.
            Short circuit OR (true || false || true)
             The || operator is a short-circuiting logical OR. If the first operand is true, Java does not evaluate 
             the second operand because the entire expression is already true.
          */
          System.out.println(false && true && true); 
          System.out.println(true || false || true);

          /**
           * Bitwise Operator
           */
          // Initial values
        int a1 = 5;
        int b1 = 7;

        // bitwise and
        // 0101 & 0111=0101 = 5
        System.out.println("a1&b1 = " + (a1 & b1));

        // bitwise or
        // 0101 | 0111=0111 = 7
        System.out.println("a1|b1 = " + (a1 | b1));

        // bitwise xor
        // 0101 ^ 0111=0010 = 2
        System.out.println("a1^b1 = " + (a1 ^ b1));

        // bitwise not
        // ~00000000 00000000 00000000 00000101=11111111 11111111 11111111 11111010
        // will give 2's complement (32 bit) of 5 = -6
        System.out.println("~a1 = " + ~a1);

        // can also be combined with
        // assignment operator to provide shorthand
        // assignment
        // a=a&b
        a1 &= b1;
        System.out.println("a1= " + a1);
        System.out.println("Bitwise Left Shift: " + (a1 << 2));
        System.out.println("Bitwise Right Shift: " + (a1 >> 2));
        System.out.println("Bitwise Unsigned Right Shift: " + (a1 >>> 2));
        }
}

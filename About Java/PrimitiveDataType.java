public class PrimitiveDataType {

    public static void main(String[] args) {

        /**
         * Declaring and Initializating variables
         */
         int a=1;
         float b=2;
         double c=3;

        short sh=12345;
        long l=1234567890;

        System.out.println(a+b+c);

        /**
         * Literals are the values assigned to the varibles like 1,2,3 are literals.
         */

        /**
         * Floating Point Numbers
         * - In Java, the default type for floating-point numbers is double, not float
         * - float has about 7 decimal digits of precision, double has about 15 decimal digits of precision.
         */
        float abc=3.678f;
        System.out.println(abc);

        /**
         * Character Literals is represented using Single quotes to store single character
         */
        char ch='a';
        System.out.println(ch);

        /**
         * Character Literals can be used to store unicode values.
         *  - Unicode is a standardized system for encoding and representing text in most of the world's writing systems. 
         *  - It assigns a unique number, called a code point, to every character, no matter the platform, program, or language. 
         *  - These code points are written in the format U+XXXX, where XXXX is a hexadecimal number.
         * Example:
         * - The character 'A' has the Unicode code point U+0041.
         * - The character 'B' has the Unicode code point U+0042.
         */
        char un='\u0041'; // Unicode escape sequence for 'A'
        System.out.println(un);

        /**
         * Byte Literals
         */
        byte by=127;
        System.out.println(by);

        /**
         * Boolean Literals
         */
        boolean bTrue=true;
        System.out.println(bTrue);

        /**
         * Apart from stroing decimal valeues ,int can store hexadecimal, Octal and even binary representing values
         */

         int x = 100; //Decimal
         int y = 0b1010; //Binary
         int z = 0123; //Octal
         int w = 0xA1;//Hexadecimal
         System.err.println("Binary: "+y);
         System.err.println("Octal: "+z);
         System.err.println("Hexadecimal: "+w);

         /**
          * Working with huge integers like 10^10 and how to read those in human mathematical wordings?
          */
          long oneway=1000000;
          long secondway=10_00_00_000;
          System.out.println(secondway);

          /**
           * Work with scientific notation
           */
          double scify=10e12;
          System.out.println(scify);

          /**
           * You can increment the character literals
           */
          char a_value='a';
          a_value++; // Post increment operator
          System.out.println(a_value);
     }
}

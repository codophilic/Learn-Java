public class WrapperClasses {
    public static void main(String[] args) {
        
        // Primitive Data type
        int i=1;

        // Wrapper class for data type int
        /**
         * j is a reference variable of new object Integer
         */
        Integer j= new Integer(10);

        System.out.println(i+j);

        Integer wi=10;


        float pf=1.5f;
        Float wf= 1.5f;
        System.out.println(pf+wf);

        long pl=10l;
        Long wl=20l;

        System.out.println(pl+wl);

        double pd= 10.20;
        Double wd=20.10;
        System.out.println(pd+wd);


        /**
         * Autoboxing
         */

         int pAuto=10;
         Integer wAuto=pAuto;
         System.out.println(wAuto);


         /**
          * Unboxing
          */
          Integer a=3;
          int var1=a.intValue(); // Unboxing // Explicit specify the conversion or unboxing.
          int var2=a; // Auto-unboxing // Compiler automatically unbox from Wrapper to primitive

          System.out.println(a+var1+var2);

    }
}

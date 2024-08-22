public class Arrays{
    public static void main(String[] args) {
        
        /**
         * Arrays
         */
        int declaringDefaultValues[] = {1,2,3,4}; // Initializes an array with values

        int fixedSizeArray[] = new int[3]; // Initially all values are 0
        fixedSizeArray[0]=10;
        fixedSizeArray[1]=20;
        fixedSizeArray[2]=30;

        System.out.println(fixedSizeArray);

        int firstElement = fixedSizeArray[0]; // Accesses the first element

        System.out.println(firstElement);

        fixedSizeArray[2] = 10; // Updates the third element to 10

        System.out.println(fixedSizeArray[2]);

        /**
         * Printing all values in an array
         */

         for(int i=0;i<3;i++){
            System.out.println(fixedSizeArray[i]);
         }

         /**
          * 2D Array initialized with default value 0
          */
          int[][] defaultMatrix= new int[3][3];

         /**
          * 2D Array initialized with values
          */
          int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        /**
         * Since its a 2D array we require 2 iterators, one iteration on rows and second iteration on columns
         */
        System.out.println("2D Matrix");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        /**
         * Enhanced for loop
         */
        for(int i: fixedSizeArray){
            System.out.println(i);
        }


        /**
         * Jagged Arrays
         */
        int arr[][] = { {0, 1, 2},
            {6, 4},
            {1, 7, 6, 8, 9},
            {5} 
          };

          int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[2]; // First row has 2 elements
        jaggedArray[1] = new int[3]; // Second row has 3 elements
        jaggedArray[2] = new int[1]; // Third row has 1 element

        for(int i[]: jaggedArray){
            for(int j:i){
                System.err.print(j+" ");
            }
            System.out.println();
        }

        for(int i[]: arr){
            for(int j:i){
                System.err.print(j+" ");
            }
            System.out.println();
        }


        /**
         * Object Type Array
         */
        Object[] obj=new Object[3];
        obj[0]=1;
        obj[1]="Value";
        obj[2]=1.2;

        for(Object o : obj){
            System.out.println(o);
        }


    }
}
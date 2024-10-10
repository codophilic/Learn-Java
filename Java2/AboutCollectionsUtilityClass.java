import java.util.*;
import java.util.Arrays;

public class AboutCollectionsUtilityClass{
    public static void main(String[] args) {
        
        //Without Collections class Sorting
        List<Integer> ArraysOfIntegers = new ArrayList<>(Arrays.asList(1000,34,55,77,88, 23,11));
        for(int i=0;i<ArraysOfIntegers.size();i++){
            for(int j=i+1;j<ArraysOfIntegers.size();j++){
                if(ArraysOfIntegers.get(i)>ArraysOfIntegers.get(j)){
                    int temp =ArraysOfIntegers.get(i);
                    ArraysOfIntegers.set(i, ArraysOfIntegers.get(j));
                    ArraysOfIntegers.set(j,temp);
                }
            }
        } 
       for (int i = 0; i < ArraysOfIntegers.size(); i++)
        System.out.println(ArraysOfIntegers.get(i));  

        //With Collections
        Collections.sort(ArraysOfIntegers);
        for(int i: ArraysOfIntegers){
            System.out.println(i);
        }
    }
}
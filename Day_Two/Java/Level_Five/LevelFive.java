import java.util.ArrayList;
import java.util.Arrays;
public class LevelFive{

    public static void main(String[] args){

        int[] array = {5, -9, 3, -6, 2, -11};
        removeNegative(array);
        System.out.println(Arrays.toString(array));
    }

    public static int[] removeNumber(int[] array){
        ArrayList<Integer> integerArray = new ArrayList<Integer>();
        int number = 0;
        
        for (int element : array) {
            if (element != number) {
                integerArray.add(element);
            }
        }
        
        int middle = number;

        if(integerArray.contains(number)) integerArray.remove(middle);

        int[] newArray = new int[integerArray.size()];

        int count = 0;
        for(int atoms : integerArray){
            newArray[count++] = atoms;
        }
        return newArray;
    }

    public static int[] removeDuplicate(int[] array){

        ArrayList<Integer> integerArray = new ArrayList<Integer>();
        
        int count = 0;

        for(int number : array){
            if(!integerArray.contains(number))
            integerArray.add(number);
        }

        int[] newArray = new int[integerArray.size()];

        for(int number : integerArray){
            newArray[count++] = number;
        }
        return newArray;
    }

    
    public static int[] removeNegative(int[] array){
        
       int count = 0;
       for(int number : array){
            if(number % 2 != 0) count += 1;
        }

        int[] newArray = new int[count];

        int index = 0;
        for(int number : array){
            if(number <  0) newArray[index++] = 0;
        }

        return newArray;
    }

    
}

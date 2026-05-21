import java.util.ArrayList;
import java.util.Arrays;
public class findSum{

    public static void main(String... args){

        int[] array = {9, 5, 1, 9, 4, 5, 1, 7};
        System.out.println(Arrays.toString(countLowestToLargest(array)));
    }


    public static int[] getTwoSum(int[] array,int sum){
        ArrayList<Integer> integerArray = new ArrayList<Integer>();

    for(int count = 1; count < array.length; count++){
        for(int number : array){
            if(number + array[count] == sum )
                integerArray.add(number);
                break;
        }
    }


    
    for(int count = 1; count < array.length; count++){
        for(int number : array){
            if(number + array[count] == sum )
                integerArray.add(array[count]);
                break;
        }
    }

    
    

        int[] newArray = new int[integerArray.size()];

        int index = 0;
        for(int number : integerArray){
            newArray[index++] = number;
        }
        return newArray;
    }



    public static int[] duplicateElimination(int[] array){
        ArrayList<Integer> duplicateArray = new ArrayList<Integer>();

            int count = 0;
        for(int number : array){
        
            if(!duplicateArray.contains(number)) duplicateArray.add(number);

            count++;
        }

        int[] newArray = new int[duplicateArray.size()];

        int index = 0;
        for(int number : duplicateArray){
            
            newArray[index++] = number;
        }

        return newArray;
    }

    public static int getSmallest(int[] array){
        int smallest = 0;
        int count = 0;
        for(int number : array){
            if(array[count] < smallest){
                smallest = array[count];
            }
        }
        return smallest;

    }

    public static int[] countLowestToLargest(int[] array){
        ArrayList<Integer> integerArray = new ArrayList<Integer>();

        int count = 0;
        int largest = array[0];

        for(int number = 1; number < array.length; number++){

            if(array[count] > largest){
                largest = array[count];
            }
        
            
        }

        int smallest = getSmallest(array);


        for(int number : integerArray){
            for(int index = smallest; index <= largest; index++){
                integerArray.add(index);
            }

        }

        int[] newArray = new int [integerArray.size()];

        int index = 0;
        for(int number : integerArray){
            newArray[index] = number;
        }
       
        return newArray;
    }

    





//End of class file
}

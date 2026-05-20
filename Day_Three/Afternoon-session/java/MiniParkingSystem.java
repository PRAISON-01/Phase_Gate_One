import java.util.Arrays;

public class MiniParkingSystem{

    public static int[] getSlot(int[] slots, int spaced){
        int space = spaced - 1;
        
         int[] array = new int[slots.length];
        
        

            if(slots[space] == 0){
                array[space] = 1;
            }
        
        return array;
    }

    public static int[] removeSlot(int[] slots, int spaced){
        int space = spaced - 1;
        
         int[] array = new int[slots.length];
        
        

            if(slots[space] == 0){
                array[space] -= slots[space];
            }
        
        return array;
    }

    

    

    

    

}

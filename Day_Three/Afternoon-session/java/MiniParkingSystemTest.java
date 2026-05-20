import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class MiniParkingSystemTest{

    @Test
    public void testThatCarFillsEmptySpace(){

        int[] array = new int[20];
        int space = 7;
        int[] expected = {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] actual = MiniParkingSystem.getSlot(array, space);
        assertArrayEquals(actual, expected);
    }

    @Test
    public void testThatCarremovesvehicleSpace(){

        int[] array = new int[20];
        int space = 7;
        int[] expected = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] actual = MiniParkingSystem.removeSlot(array, space);
        assertArrayEquals(actual, expected);
    }

    


}

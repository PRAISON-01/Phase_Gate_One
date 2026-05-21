import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FindSumTest{

    @Test
    public void testThatMethodReturnsTheTwoNumberThatReturnTheNumberThatMakesUpTheSum(){

        int[] array = {7, 6, 12, 4, -1};
        int sum = 6;
        int[] actual = findSum.getTwoSum(array, sum);
        int[] expected = {7, -1};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void testThatMethodremovesDuplicateIntheArrayAndReturnsNewArray(){

        int[] array = {9, 5, 1, 9, 4, 5, 1, 7};
        int[] expected ={9, 5, 1, 4, 7};
        int[] actual = findSum.duplicateElimination(array);
        assertArrayEquals(actual, expected);
    }

}

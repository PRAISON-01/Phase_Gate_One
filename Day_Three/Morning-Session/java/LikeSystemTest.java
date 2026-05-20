import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class LikeSystemTest{

    @Test
    public void testThatFuctionReturnsEmptyArrayIfThereWereNoLikes(){
        
        String[] array = {};
        String expected = null;
        String actual = LikeSystem.collectName(array);
        assertEquals(actual, expected);
    }

     @Test
    public void testThatFuctionReturnsNameofLikers(){
        
        String[] array = {"Praise"};
        String expected = "Praise likes this";
        String actual = LikeSystem.collectName(array);
        assertEquals(actual, expected);
    }

    

}

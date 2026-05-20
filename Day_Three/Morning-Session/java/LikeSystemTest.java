import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class LikeSystemTest{

    @Test
    public void testThatFuctionReturnsEmptyArrayIfThereWereNoLikes(){
        
        String[] array = {};
        String expected = "no one likes this";
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

     @Test
    public void testThatFuctionReturnsNameofLikersForTwoPeople(){
        
        String[] array = {"Praise","eob"};
        String expected = "Praise and eob likes this";
        String actual = LikeSystem.collectName(array);
        assertEquals(actual, expected);
    }

     @Test
    public void testThatFuctionReturnsNameofLikersOfThreePeople(){
        
        String[] array = {"Praise","eob","Lamine"};
        String expected = "Praise , eob and Lamine likes this";
        String actual = LikeSystem.collectName(array);
        assertEquals(actual, expected);
    }

     @Test
    public void testThatFuctionReturnsNameofLikersOfFourPeople(){
        
        String[] array = {"Praise","eob","Lamine","semicolon"};
        String expected = "Praise , eob and 2 others likes this";
        String actual = LikeSystem.collectName(array);
        assertEquals(actual, expected);
    }

    

}

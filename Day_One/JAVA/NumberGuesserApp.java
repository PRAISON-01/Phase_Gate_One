
import java.util.Scanner;
import java.security.SecureRandom;

public class NumberGuesserApp{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        SecureRandom random = new SecureRandom();            
        int randomNumber = random.nextInt(1, 101);

        int attempt = 1;
        
       do{
            System.out.print("Guess the number between 1 and 100 => ");
            int guess = input.nextInt();

            if(guess == randomNumber){
                System.out.println("Congrarulations, You got the number");
                break;
            }
            else if(guess < randomNumber){
                System.out.println("Too Low");
            }
            else if(guess > randomNumber){
                System.out.println("Too High");
            }

        attempt += 1;

            if(guess < 1 || guess > 100){
                System.out.println("Guessb out of bound");
            }

        }while( attempt <= 5);


System.out.println("=====RESULTS=====");

System.out.println("Correct Number => "+ randomNumber);
System.out.println("Number of Attempts => "+ attempt);

if (attempt == 1){
    System.out.println("Legendary");
}
if (attempt == 2){
    System.out.println("Excellent");
}
if( attempt == 3 || attempt == 4){
    System.out.println("Good");
}
    

if ( attempt == 5){
    System.out.println("Close");
}


if(attempt > 5){
    System.out.println("Better luck");
}



        
    }

}

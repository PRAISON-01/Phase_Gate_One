import java.util.Scanner;

public class TaskEight{


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

    
        int count = 0;
        int sum = 0;
        
        System.out.print("Enter a number => ");
        int number = input.nextInt();

        while(number != 0){
            System.out.print("Enter a number => ");
            number = input.nextInt();
            
            sum += number;
            count +=1;
        }
        System.out.println(sum);
    }
}

import java.util.Scanner;

public class TaskEight{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number => ");
        int number = input.nextInt();

        int answer = number * number;
        System.out.println("Square of "+ number +" => "+ answer);
       
    }
}

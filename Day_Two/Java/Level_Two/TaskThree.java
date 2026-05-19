import java.util.Scanner;

public class TaskFive{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter score => ");
        int score = input.nextInt();

        if(score >= 50){
            System.out.println("Passed");
        }
        else{
            System.out.println("Failed");
        }
       
    }
}

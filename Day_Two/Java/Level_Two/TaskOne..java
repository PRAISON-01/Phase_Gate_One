import java.util.Scanner;

public class TaskFive{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number => ");
        int number = input.nextInt();

        if(number % 2 == 0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }
       
    }
}

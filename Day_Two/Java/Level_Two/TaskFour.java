import java.util.Scanner;

public class TaskFive{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number => ");
        int first = input.nextInt();

        System.out.print("Enter second number => ");
        int second = input.nextInt();

        int largest = first;
    
        if(second > largest){
            largest = second;
        }
    
        System.out.println("Largest => "+ largest);
       
    }
}

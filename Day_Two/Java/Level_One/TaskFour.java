import java.util.Scanner;

public class TaskFour{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number => ");
        int first = input.nextInt();

        System.out.print("Enter second Number => ");
        int second = input.nextInt();
        
        int product = first * second;

        System.out.println(first + " x "+ second + " = "+ product);
    }
}

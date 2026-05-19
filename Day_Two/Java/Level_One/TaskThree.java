import java.util.Scanner;

public class TaskThree{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number => ");
        int first = input.nextInt();

        System.out.print("Enter second Number => ");
        int second = input.nextInt();
        
        int sum = first + second;

        System.out.println(first + " + "+ second + " = "+ sum);
    }
}

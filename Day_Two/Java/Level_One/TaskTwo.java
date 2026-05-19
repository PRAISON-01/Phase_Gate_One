import java.util.Scanner;

public class TaskTwo{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter you Age => ");
        int age = input.nextInt();
        
        System.out.println("Hello You will be "+ (age + 5) + " in 5 years ti,me");
    }
}

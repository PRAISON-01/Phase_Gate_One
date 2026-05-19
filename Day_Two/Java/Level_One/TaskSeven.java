import java.util.Scanner;

public class TaskSeven{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius => ");
        int radius = input.nextInt();

        double answer = 2 * (3.142) * radius;
        System.out.printf("Circumference of circle => %.2f \n", answer);
    }
}

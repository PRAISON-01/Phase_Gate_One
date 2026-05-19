import java.util.Scanner;

public class TaskFive{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in celcius => ");
        int temp = input.nextInt();

        double farenheit = (temp * 9/5) + 32;

        System.out.printf("Temperature in farenheit => %.2f", farenheit);
    }
}

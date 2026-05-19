import java.util.Scanner;

public class TaskTen{


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number => ");
        int number = input.nextInt();

        int count = 0;
        int last = 0;
        
        while(number > 0){
            last = number % 10;
            count += 1;
            number /= 10;
            
        }
        System.out.print(count);
    }
}

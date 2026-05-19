import java.util.Scanner;

public class TaskTen{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int count = 1;
        int total = 0;
        while(count <= 3){

          System.out.printf("Enter %d/3 Number => ", count);
           int number = input.nextInt();

            total += number;
            count += 1;
        };
        
        double average = total/3;
        System.out.println("Areverage of three number => " + average);
       
    }
}

import java.util.Scanner;

public class TaskFour{


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number => ");
        int number = input.nextInt();
    
        for(int count = 1; count <= 10; count++){
            System.out.println(number +" X " + count + " = " + count * number);
        }
    }
}

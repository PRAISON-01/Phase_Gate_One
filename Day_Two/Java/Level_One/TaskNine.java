import java.util.Scanner;

public class TaskNine{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter price of item => ");
        int price = input.nextInt();

        double discount = price + (price * 0.1);
        System.out.println("Net Price of Item (with added tax @10%)=> "+ discount);
       
    }
}

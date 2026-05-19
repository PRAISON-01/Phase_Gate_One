import java.util.Scanner;

public class TaskNine{


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        for(int row = 0; row < 10; row++){
            for(int col = 0; col < row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

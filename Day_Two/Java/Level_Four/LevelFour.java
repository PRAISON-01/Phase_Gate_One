public class LevelFour{

    public static void main(String[] args){

int first = 3;
int second = 20000;
int third = 155;
int number = 54321;
int principal = 5912000;
int ratep = 12;
int time = 5;
int length = 5;
int width = 10;
//int word = "Praise";
int celcius = 100;



add(first, second);
isEven(number);
convertTemp(celcius);
isPrime(number);
isLargest(first, second, third);
simpleInterest(principal, ratep, time);
area(length, width);
reverse(number);
//countWord(word);

     
    }

    public static int add(int first, int second){
        
        return first + second;
    }

    public static boolean isEven(int number){
        if(number % 2 == 0){
            return true;
        }
        return false;
    }

    public static int square(int number){
        return number * number;

    }

    public static double convertTemp(int celcius){
        
        return (celcius * 9/5) + 32;
    }


        
    public static boolean isPrime(int number){
        
        if(number <= 1){
            return false;
        }
        if(number <= 3){
            return true;
        }
        if(number % 2 == 0 || number % 3 == 0){
            return false;   
        }

        int i = 5;
        while(i * i <= number){
            if(number % i == 0 || number % (i + 2) == 0)
            return false;
            i += 6;
        }
        return true;
    }

    public static int isLargest(int first, int second, int third){
        int largest = first;
        
        if(second > largest){
            largest = second;
        }
        else if(third > largest){
             third = largest;
        }
        return largest;
    }


    public static double simpleInterest(int principal, int ratep, int time){
        double rate = ratep/100;
        double si = (principal * rate * time);
        return si;
    }

    public static int area(int length, int width){
        return length * width;
    }

    public static int reverse(int number){
        
        int reverse = 0;
        int last = 0;
        while(number > 0){
            last = number % 10;
            reverse = (reverse * 10) + last;
            number /= 10;
            
        }
    return reverse;
    }

    
//End of class file
}

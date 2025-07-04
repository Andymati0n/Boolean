/* this is to help in my understanding of boolean*/
import java.util.Scanner;
public class BoolTest1 {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        //prompt users to enter a number from 1  to 100
        System.out.println (" Guess a number :");
        int number = input.nextInt();
    
        if (number > 0 && number < 100){
            System.out.println ("the number " + number + " is true");
        }
        else {
            System.out.println(" the number " + number + " is negative ");
            System.exit (1);
        }
            
        }
    }
      
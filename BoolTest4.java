/* Boolean test 4*/
import java.util.Scanner;
public class BoolTest4 {
    public static void main (String [] arg){
        // create a Scanner
        Scanner input = new Scanner (System.in);
        //prompt users to  enter a value for X
        System.out.println ("Enter a value for X: Y: Z: ");
        int X = input.nextInt();
        int Y = input.nextInt();
        int Z = input.nextInt();
        
        if (X < Y && Y < Z ){
            System.out.println (" X < Y && Y < Z is " + (X < Y && Y < Z));
        }
         if (X < Y || Y < Z){
            System.out.println (" (X < Y || Y < Z is " + (X < Y || Y < Z));
        }
         if (!(X < Y)){
            System.out.println (" (! (X < Y) is " + (!(X < Y) ));
        }
         if ((X + Y < Z)){
        System.out.println("(X + Y < Z) is " + (X + Y < Z));
        }
        if  ((X + Y > Z)){
             System.out.println("(X + Y > Z) is " + (X + Y > Z));
        }
    }
    }


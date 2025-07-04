/*boolean expression trial 2 */
import java.util.Scanner;
public class BoolTest2 {
    public static void main (String [] arg){
        //create a Scanner
        Scanner input = new Scanner (System.in);
        //prompt users to enter a number for X
        System.out.println ( " Enter a value for X: ");
        double X = input.nextDouble ();
        
        if (X - 5 < 4.5 ){
            System.out.println(" the answer is " + (X - 5 < 4.5));
        }
        if (X - 5 > 4.5 ){
            System.out.println (" the answer is " + (X -5 > 4.5));
        }
        else {
            System.out.println (" the answer is a negative number ");
        }
    }
    
}

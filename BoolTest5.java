/* Boolean Test 5 */ 
import java.util.Scanner;
public class BoolTest5 {
    public static void main ( String [] arg){
        // create a Scanner
        Scanner input = new Scanner (System.in);
        // promt user to enter their age
        System.out.println (" Enter your age if you are less than 18 but bigger than 13: ");
        int Age = input.nextInt ();
        
        if (Age > 13 && Age < 18){
            System.out.println (" Age is " + (Age > 13 && Age < 18));
        } 
        else if (Age < 13){ 
            System.out.println ("you are not qualified, come back when you are of age");
        }
        else 
            System.out.println( " you are older than the required age ");
       
    }
    
}

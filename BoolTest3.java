/*Boolean test 3 */
  import java.util.Scanner;
public class BoolTest3 {
    public static void main (String [] arg){
        //create a Scanner
      Scanner input = new Scanner (System.in);
      //prompt users to enter a value for X
      System.out.println (" Enter a value for X: ");
      int X = input.nextInt ();
      
        if (X >= 50 && X<= 100){
            System.out.println ("this is good" );
        }
        else {
            System.out.println("false");
        }
    }
}
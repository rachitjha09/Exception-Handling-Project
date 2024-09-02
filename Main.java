import java.util.Scanner;
/**
 * Exception Handling Demo
 *
 * @author (Rachit J)
 * @version (5/9/24)
 */
public class Main
{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int value=0;
        while(true){
            System.out.println("Enter a number between 1 and 10, inclusive: ");
            try{
                String entry=s.nextLine();
                value=Integer.parseInt(entry);
            } catch(NumberFormatException e){
                System.out.println("Bad number entered. Exiting program.");
                System.exit(1);
            } catch(Exception e){
                System.out.println("Something bad happened. Exiting program.");
                System.exit(2);
            }
            System.out.println("You typed the number: " + value);
        }
    }
}
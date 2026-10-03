import java.util.InputMismatchException;
import java.util.Scanner;

public class TryAndCatch {
    public static void main(String[] args) {
        
        /* Try and catch blocks are a way to check if there are errors in your code 
         * for homework you learned how to use the "scanner" class to read terminal 
         * text. What if you ask for 
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer:  ");
     
        try{
            
            int x = scanner.nextInt();

        } catch(InputMismatchException e){

            System.out.println("You didn't type an interger");
            System.out.println("Goodbye");
        }

    }
}

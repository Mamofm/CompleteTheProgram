
import java.util.Scanner;
public class CompleteTheProgram {
        public static void main(String args[]) {
            int userInput;

            Scanner keybd = new Scanner(System.in);
            System.out.println("Enter a number: ");

            userInput  = keybd.nextInt();

            // use for loop
            for (int i=1; userInput > 0 ; userInput-=1) {
                System.out.print (userInput + " ");
            }
        }
}

/*
 * Nicole Tao
 * GuessingGame.java
 * User guesses a random number that the computer picks until they get it right
 * March 23rd, 2018
 */

package guessinggame;
import java.util.Scanner;

/**
 *
 * @author nitao5001
 */
public class GuessingGame {
    static int randNum = (int)Math.ceil(Math.random()*100);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Guess the number: ");
        number = input.nextInt();
        
        while (number != randNum)
        {
            if (number > randNum)
            {
                System.out.println("Too high!");
                number = input.nextInt();
            }
            else
            {
                System.out.println("Too low!");
                number = input.nextInt();
            }
        }
        
        System.out.println("You got it");
 
        
            

            
    }
    
}

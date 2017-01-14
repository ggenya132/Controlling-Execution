/**
 * Created by eugenevendensky on 1/13/17.
 */
public class GameEngine {
    int secretNumber = 47;
    int guess = 0;
    int previousGuess = 0;
    boolean isNotWinning = true;



    public void scenarioChecker(int userNumber) {
        if (userNumber == secretNumber) {
            System.out.print("Congratulations, you won!");
            guess++;
            System.out.println("It took you " + guess + " tries!" );
            isNotWinning = false;
        } else if (userNumber > secretNumber) {
            if (userNumber == previousGuess) {
                System.out.println("Sorry, that guess is too high");
            } else {
                userNumber = previousGuess;
                guess++;
                System.out.println("Sorry, that guess is too high");
            }
        } else {
            if (userNumber == previousGuess) {
                System.out.println("Sorry, that guess is too low");

            } else {
                guess++;
                userNumber = previousGuess;
                System.out.println("Sorry, that guess is too low");
            }
        }
    }
}

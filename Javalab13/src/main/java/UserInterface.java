import java.util.Scanner;

/**
 * Created by eugenevendensky on 1/13/17.
 */
public class UserInterface {

    Scanner scanner = new Scanner(System.in);

    public  int askUserNumber() {
        System.out.println("Guess the secret number!");
        int userNumber = scanner.nextInt();
        return userNumber;
    }

}


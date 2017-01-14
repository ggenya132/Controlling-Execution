import java.util.Scanner;

/**
 * Created by eugenevendensky on 1/13/17.
 */
public class UserInterface {

    Scanner scanner = new Scanner(System.in);

    public  int askUserNumber(){
        System.out.println("Enter your number");
        int userNumber = scanner.nextInt();
        return userNumber;
}
    public String askUserOperation(){
        System.out.println("Addition or Multiplication?");
        scanner.nextLine();
        String userChoice = scanner.nextLine();
        return userChoice;
    }

    }


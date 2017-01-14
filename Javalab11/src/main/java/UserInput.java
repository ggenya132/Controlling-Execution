import java.util.Scanner;

/**
 * Created by eugenevendensky on 1/13/17.
 */
public class UserInput {
    Scanner scanner = new Scanner(System.in);
    String userName;
    public String userInput(){
        System.out.println("Enter your name: ");
        userName = scanner.nextLine();
        return userName;

    }

}

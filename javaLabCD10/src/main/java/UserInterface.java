import java.util.Scanner;

/**
 * Created by eugenevendensky on 1/13/17.
 */
public class UserInterface {

    Scanner scanner = new Scanner(System.in);
    public int askUserNumber(){
        System.out.println("Enter your number");
        int userNumber = scanner.nextInt();
        return userNumber;


    }
    public void returnSum(int x){
        System.out.print(x);
        return;
    }

}

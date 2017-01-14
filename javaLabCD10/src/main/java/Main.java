import java.util.Scanner;

/**
 * Created by eugenevendensky on 1/12/17.
 */
public class Main {
    public static void main(String args[]) {

        UserInterface userInterface = new UserInterface();
        Calculator maincalc = new Calculator();

        int askUserNumber = userInterface.askUserNumber();
        int resultAskUserNumber = maincalc.calc(askUserNumber);
        userInterface.returnSum(resultAskUserNumber);





    }
}

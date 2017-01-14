/**
 * Created by eugenevendensky on 1/12/17.
 */
public class Main {

    public static void main(String args[]) {

    UserInterface newUserInterface = new UserInterface();
    Calculator newCalculator = new Calculator();

   int pass =  newUserInterface.askUserNumber();
   String pass2 = newUserInterface.askUserOperation();

    if(pass2.equalsIgnoreCase("Addition")){
        newCalculator.sum(pass);
    }
    else if(pass2.equalsIgnoreCase("Multiplication")){
        newCalculator.multiply(pass);
    }


    }



}

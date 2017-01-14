/**
 * Created by eugenevendensky on 1/13/17.
 */
public class Calculator {

    UserInterface forCalculationReference = new UserInterface();


    public int multiply(int myNumber) {
        int counter = 0;
        for (int i = 1; i <= myNumber; i++)
        {
           counter += (i * myNumber);
        }
        System.out.print(counter);
        return counter;
    }

    public int sum(int myNumber) {
        int counter = 0;
        for (int x = 0; x <= myNumber; x++) {
            counter += x;
        }
        System.out.print(counter);
        return counter;
    }
}
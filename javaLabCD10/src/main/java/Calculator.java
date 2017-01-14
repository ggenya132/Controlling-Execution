/**
 * Created by eugenevendensky on 1/13/17.
 */

public class  Calculator {

    Integer counter = 0;

    public int calc(int myNumber) {
        for (int x = 0; x <= myNumber; x++) {

            counter += x;

        }
        return counter;

    }

}

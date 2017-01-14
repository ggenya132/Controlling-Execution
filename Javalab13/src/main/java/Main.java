/**
 * Created by eugenevendensky on 1/13/17.
 */
public class Main {


    public static void main(String[] args) {
        GameEngine newGameEngine = new GameEngine();

        UserInterface newone = new UserInterface();

        do {int pass = newone.askUserNumber();

            newGameEngine.scenarioChecker(pass);

        } while(newGameEngine.isNotWinning);
    }

}

//Guys, I'm not proud of this code. It delivers what is asked, if given more time I would simply add case switches and
//make the implementation more elegant.
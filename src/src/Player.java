/*import java.lang.reflect.Array;

public abstract class Player {
    //atributos?
   public String name;
   public Array<int> guesses;

    //metodos
    makeGuesses(): int;
    getName(): string;
    getGuesses(): Array<int>;
}*/

import java.util.Scanner;
import java.util.ArrayList;
public abstract class Player {
    String name;
    ArrayList<Integer> guesses;

    public Player(){
        this.guesses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Integer> getGuesses() {
        return guesses;
    }
    public void setGuesses(int number) {
        this.guesses.add(number);
    }
    public abstract int makeGuess(Player player); //necesita estos 2 parámetros?
}

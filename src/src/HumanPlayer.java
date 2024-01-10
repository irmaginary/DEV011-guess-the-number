import java.util.Scanner;

public class HumanPlayer extends Player {

    // Constructor que llama al constructor de la clase base (Player)
    public HumanPlayer() {
        super("");
        setPlayerName();
    }

    public void setPlayerName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Your name: ");
        //String playerName = input.nextLine();
        getName();
    }

    // Implementación del método abstracto makeGuess
    @Override
    public int makeGuess() {
        Scanner input = new Scanner(System.in);

        System.out.println(getName() + ", guess a number between 1 and 100: ");
        int guess = input.nextInt();

        // Agregar la suposición al historial
        addGuess(guess);

        return guess;
    }
}


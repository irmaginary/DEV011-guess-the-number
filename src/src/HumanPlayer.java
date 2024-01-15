//import java.util.Scanner;

/*public class HumanPlayer extends Player {

    // Constructor que llama al constructor de la clase base (Player)
    public HumanPlayer() {
        super("");
        setPlayerName();
    }

    public void setPlayerName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your name: ");
        String playerName = scanner.nextLine();
        getName(playerName);
    }

    // Implementación del método abstracto makeGuess
    @Override
    public int makeGuess(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Round 1: " + player.getName() + "---");
        //int guess = input.nextInt();
        System.out.println("Guess a number between 1 and 100: ");
        int playerGuess = scanner.nextInt();
        player.getGuesses(playerGuess);
        return playerGuess;

        // Agregar la suposición al historial (¿Es necesario?)
       // getGuesses(guess);
        //return guess;
    }
}
*/
public class HumanPlayer extends Player {
}


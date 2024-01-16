import java.util.Scanner;

public class HumanPlayer extends Player {
    private Scanner scanner = new Scanner(System.in);

    // Constructor de HumanPlayer
    public HumanPlayer() {
        enterName();
        System.out.println("––– Round: " + getName() + "–––");
    }

    // Implementación del método abstracto makeGuess
    @Override
    public int makeGuess() {
        System.out.println("––– Round: " + getName() + "–––");
        System.out.println(getName() + ", make your guess: ");
        return scanner.nextInt();
    }

    // Método adicional para obtener el nombre del jugador
    public void enterName() {
        System.out.println("*** Welcome to Guess The number ***");
        System.out.println("Guess a number between 1 and 100 and try to win vs the Computer just for fuuuuun!:D");
        System.out.println("First things first, Enter your name: ");
        String playerName = scanner.nextLine();
        setName(playerName);
    }
}



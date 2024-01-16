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
        System.out.println("Enter your name: ");
        String playerName = scanner.nextLine();
        setName(playerName);
    }
}



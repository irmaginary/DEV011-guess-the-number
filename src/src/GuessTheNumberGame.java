import java.util.ArrayList;
import java.util.Random;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int targetNumber = rand.nextInt(100);
        System.out.println(targetNumber); //ver número random

        // Insertar objetos de jugadores
        Player player = new HumanPlayer();
        Player computerPlayer = new ComputerPlayer();

        // Bucle principal
        playGame(player, computerPlayer, targetNumber);
    }

    // Método principal refactorizado para facilitar las pruebas
    public static void playGame(Player player, Player computerPlayer, int targetNumber) {
        ArrayList<Integer> playerNumbers = new ArrayList<>();
        ArrayList<Integer> computerNumbersPlayed = new ArrayList<>();

        boolean win = false;

        do {
            // HumanPlayer
            int playerGuess = player.makeGuess(computerPlayer);
            playerNumbers.add(playerGuess);
            computerNumbersPlayed.add(playerGuess);
            checkGuess(playerGuess, targetNumber, true, playerNumbers, computerNumbersPlayed);

            // ComputerPlayer
            int computerGuess = computerPlayer.makeGuess(player);
            checkGuess(computerGuess, targetNumber, false, null, computerNumbersPlayed); // Segundo null si el ganador es la computadora

        } while (!win);
    }

    // Método checkGuess que revisa si el jugador que ganó fue human o no
    private static void checkGuess(int guess, int targetNumber, boolean isHuman, ArrayList<Integer> guesses, ArrayList<Integer> numbersPlayed) {
        if (guess == targetNumber) {
            if (isHuman) {
                System.out.println("You win!");
                System.out.println("Your attempts: " + guesses.size());
                System.out.println("Your guesses: " + numbersPlayed);
            } else {
                System.out.println("Computer Player wins!");
                System.out.println("Attempts: " + guesses.size());
                System.out.println("The guesses: " + numbersPlayed);
            }
            System.exit(0); // Se recomienda para finalizar el bucle principal.
        } else if (guess < targetNumber) {
            System.out.println("Too low!");
        } else {
            System.out.println("Too high!");
        }
    }
}





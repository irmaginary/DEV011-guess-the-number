import java.util.ArrayList;
import java.util.Random;

public class GuessTheNumberGame {
    //Inicia el juego y genera el número aleatorio.
    public static void main(String[] args) {
        //atributos
        Random rand = new Random();
        int targetNumber = rand.nextInt(100);
        System.out.println(targetNumber); //ver número random

        //Insertar objetos de jugadores
        HumanPlayer player = new HumanPlayer();
        ComputerPlayer computerPlayer = new ComputerPlayer();

        boolean win = false;
        ArrayList<Integer> playerNumbers = new ArrayList<>();
        ArrayList<Integer> computerNumbersPlayed = new ArrayList<>();


        //Bucle principal
        do {
            //HumanPlayer
            int playerGuess = player.makeGuess();
            playerNumbers.add(playerGuess);
            computerNumbersPlayed.add(playerGuess);
            checkGuess(playerGuess, targetNumber, true, playerNumbers, computerNumbersPlayed);

            //ComputerPlayer
            int computerGuess = computerPlayer.makeGuess();
            checkGuess(computerGuess, targetNumber, false, null, computerNumbersPlayed); //se cambió el segundo null en caso de que el ganador sea la computadora
        } while (!win);
    }

    //Método checkGuess que revisa si el jugador que ganó fue human o no
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
            System.out.println("Too high!"); //cómo hacerlo más preciso?
        }
    }
}


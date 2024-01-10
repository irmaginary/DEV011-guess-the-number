import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        //HumanPlayer
       // HumanPlayer humanPlayer = new HumanPlayer();
        //humanPlayer.setPlayerName(); //obtener nombre

        //generar número random, intervalo de números, número de intentos y respuesta del player
        Random rand = new Random();
        int targetNumber = rand.nextInt(100);
        int numberOfTries = 0;

        Scanner inputNumberHumanPlayer = new Scanner(System.in);

        //obtener suposición del jugador
        int guess; //= humanPlayer.makeGuess();
        boolean win = false;

        while (win == false) {

            System.out.println(targetNumber); //ver número random
            System.out.println("Guess a number between 1 and 100: ");
            guess = inputNumberHumanPlayer.nextInt();
            numberOfTries++;

            if (guess == targetNumber) {
                win = true;
            }
            else if (guess < targetNumber) {
                System.out.println("To low!");
            }
            else if (guess > targetNumber) {
                System.out.println("To high!");
            }
        }
        System.out.println("You win!");
        System.out.println("Attempts: " + numberOfTries );
    }
}
/*public class GuessTheNumberGame {
  private Random random$;
  private int targetNumber$;

  //constructor
    public GuessTheNumberGame() {
       random$ = new Random();
       targetNumber$ = random$.nextInt(100) + 1;

    }

    //Método
    public boolean checkGuess(Player player) {
        int guess = player.getGuess(); //traer el método getguess del objeto player
        return guess == targetNumber$;
    }
}*/

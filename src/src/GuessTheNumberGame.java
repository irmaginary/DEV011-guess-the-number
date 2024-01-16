//import java.util.Scanner;
import java.util.Random;

public class GuessTheNumberGame {
    //Inicia el juego y genera el número aleatorio.
    public static void main(String[] args) {
        //atributos
        Random rand = new Random();
        int targetNumber = rand.nextInt(100);
        System.out.println(targetNumber); //ver número random

        //Insertar objetos
        HumanPlayer player = new HumanPlayer();
        //ComputerPlayer computerPlayer = new ComputerPlayer();
       // playerGuessRange(targetNumber, player.getNumber());
        //playerGuessRange(targetNumber,computerPlayer.getNumber());
        boolean win = false;


        //Para terminar el juego
        while (win == false) {
            int playerGuess = player.makeGuess();

            if (playerGuess == targetNumber) {
                win = true;
            } else if (playerGuess < targetNumber) {
                System.out.println("To low!");
            } else if (playerGuess > targetNumber) {
                System.out.println("To high!");
            }
        }
        System.out.println("You win!");
        //System.out.println("Your guesses: ");

    }


    }

    //comparación con checkGuess()


    /*
    //método checkNumber() para ejecutar turnos, guestGuess y el estado de la partida
    //tiene que ser booleano
    public static boolean checkGuess() {

        return ;
    }

    Scanner inputNumberHumanPlayer = new Scanner(System.in); //el scanner ya está presente en la clase Player. Solo hay que invocarlo.
        int numberOfTries = 0; //coleccionarlos en un array

            int guess;

            boolean win = false;

            while (win == false) {

                System.out.println("Guess a number between 1 and 100: ");
                guess = inputNumberHumanPlayer.nextInt();
                numberOfTries++;

                if (guess == targetNumber) {
                    win = true;
                } else if (guess < targetNumber) {
                    System.out.println("To low!");
                } else if (guess > targetNumber) {
                    System.out.println("To high!");
                }
            }
            System.out.println("You win!");
            System.out.println("Your guesses: ");
            System.out.println("Attempts: " + numberOfTries);
        }
    }
*/

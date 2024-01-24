import java.util.Random;

public class ComputerPlayer extends Player {
    private Random rand = new Random();

    // Constructor
    public ComputerPlayer() {

    }

    // Implementación del método abstracto makeGuess
    @Override
    public int makeGuess(Player player) {
        int guess = rand.nextInt(100); // Puedes ajustar el rango según tus necesidades
        System.out.println("––– Round: Computer Player –––");
        System.out.println("Computer says: " + guess);
        return guess;
    }
}

// }
//}
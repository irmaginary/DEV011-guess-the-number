import java.util.Random;

public class ComputerPlayer extends Player {
    private Random rand = new Random();

    // Constructor
    public ComputerPlayer() {
        System.out.println("––– Round: Computer Player –––");
    }

    // Implementación del método abstracto makeGuess
    @Override
    public int makeGuess() {
        int guess = rand.nextInt(100); // Puedes ajustar el rango según tus necesidades
        System.out.println("––– Round: Computer Player –––");
        System.out.println("Computer says: " + guess);
        return guess;
    }
}
//public class ComputerPlayer extends Player {
//    private Random rand = new Random(); //necesita generar un número aleatorio
//    //necesita una variable para almacenar ese número y jugarlo
//    public int computerGuess;
//
//    //getter
//    public int getComputerGuess() {
//        return computerGuess;
//    }
//
//    //setter
//    public void setComputerGuess(int number) {
//        this.computerGuess = computerGuess;
//    }
//
//    //constructor
//    public ComputerPlayer() {
//        System.out.println("––– Round: ComputerPlayer –––");
//        int computerRandomGuess = rand.nextInt(100) +1;
//        setComputerGuess(computerRandomGuess);
//        //System.out.println("Computer Player says: " + getComputerGuess());
//    }
//
//    //Implementar método abstracto makeGuess() heredado de clase Player
//
//    @Override
//    public int makeGuess() {
//      System.out.println("Computer Player says: " + getComputerGuess()); //aquí debe ir la variable que almacene el número random
//        return getComputerGuess();
// }
//}
import java.util.Random;

public class ComputerPlayer extends Player {
    private Random rand = new Random(); //necesita generar un número aleatorio
    //necesita una variable para almacenar ese número y jugarlo
   // public int computerguess;
    //public int getNumber() {
       // return computerguess;
    //}
    //public void setNumber(int number) {
        //this.computerguess = number;
    //}

    //constructor
    public ComputerPlayer() {
        System.out.println("––– Round: ComputerPlayer –––");
    }

    //Implementar método abstracto makeGuess() heredado de clase Player

    @Override
    public int makeGuess() {
        int guess = rand.nextInt(100);
        System.out.println("Computer guess: " + guess); //aquí debe ir la variable que almacene el número random
        return guess;
    }
}
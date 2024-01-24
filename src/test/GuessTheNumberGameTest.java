import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.mockito.Mockito.*;

class GuessTheNumberGameTest {

    @Test
    public void testCheckGuess() {
        // Mockear las dependencias de la clase
        HumanPlayer humanPlayerMock = mock(HumanPlayer.class);
        ComputerPlayer computerPlayerMock = mock(ComputerPlayer.class);

        int targetNumber = 40;

        // Comportamiento esperado
        when(humanPlayerMock.getName()).thenReturn("Irma");
        when(humanPlayerMock.makeGuess(any())).thenReturn(89, 45, 42, 40);
        when(computerPlayerMock.makeGuess(any())).thenReturn(43);

        // Crear instancia de GuessTheNumberGame
        GuessTheNumberGame game = new GuessTheNumberGame();

        // Ejecutar método con los mocks
        game.playGame(humanPlayerMock, computerPlayerMock, targetNumber);

        verify(humanPlayerMock, atLeastOnce()).makeGuess(computerPlayerMock);
        verify(computerPlayerMock, atLeastOnce()).makeGuess(humanPlayerMock);
    }
}



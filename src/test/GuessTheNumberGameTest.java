import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class GuessTheNumberGameTest {
    @Test
    public void test() {

        assertEquals(1,1);
    }

    @Test
    public void testCheckGuess(){
    GuessTheNumberGame guessTheNumberGame = mock(GuessTheNumberGame.class);
    when(guessTheNumberGame.checkGuess()).thenReturn();
    }
}


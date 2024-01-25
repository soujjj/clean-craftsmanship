package bowling;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingTest {

    private Game game;

    @BeforeEach
    public void setUp() throws Exception {
        this.game = new Game();
    }

    @Test
    public void gutterGame() throws Exception {
        for (int i = 0; i < 20; i++) {
            game.roll(1);
        }
        assertEquals(20, game.score());
    }
}

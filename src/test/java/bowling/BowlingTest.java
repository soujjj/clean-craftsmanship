package bowling;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

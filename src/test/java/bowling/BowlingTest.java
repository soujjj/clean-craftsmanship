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

  /**
   * @param n 投げる回数
   * @param pins 倒れるピン数
   */
  private void rollMany(int n, int pins) {
    for (int i = 0; i < n; i++) {
      this.game.roll(pins);
    }
  }

  private void rollSpare() {
    rollMany(2, 5);
  }

  private void rollStrike() {
    this.game.roll(10);
  }

  @Test
  public void gutterGame() throws Exception {
    rollMany(20, 0);
    assertEquals(0, game.score());
  }

  @Test
  public void allOnes() throws Exception {
    rollMany(20, 1);
    assertEquals(20, this.game.score());
  }

  @Test
  public void oneSpare() throws Exception {
    this.rollSpare(); // spare
    this.game.roll(7);
    rollMany(17, 0); // gutter
    assertEquals(24, this.game.score());
  }

  @Test
  public void oneStrike() throws Exception {
    rollStrike();
    this.game.roll(2);
    this.game.roll(3);
    rollMany(16, 0);
    assertEquals(20, this.game.score());
  }

  @Test
  public void perfectGame() throws Exception {
    rollMany(12, 10);
    assertEquals(300, this.game.score());
  }
}

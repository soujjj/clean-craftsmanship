package prime;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.empty;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class PrimeFactorsTest {
  @Test
  public void factors() throws Exception {
    assertThat(factorsOf(1), is(empty()));
    assertThat(factorsOf(2), contains(2));
    assertThat(factorsOf(3), contains(3));
    assertThat(factorsOf(9), contains(3, 3));
  }

  private List<Integer> factorsOf(int n) {
    ArrayList<Integer> factors = new ArrayList<>();
    for (int divisor = 2; n > 1; divisor++) {
      for (; n % divisor == 0; n /= divisor) {
        factors.add(divisor);
      }
    }
    return factors;
  }
}

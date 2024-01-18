package stack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StackTest {

  private final Stack stack = new Stack();

  @Test
  public void canCreateStack() throws Exception {
    Stack stack = new Stack();
    assertTrue(stack.isEmpty());
  }

  @Test
  public void canPush() throws Exception {
    stack.push(0);
    assertFalse(stack.isEmpty());
  }

  @Test
  public void afterOnePush_isNotEmpty() throws Exception {
    Stack stack = new Stack();
    stack.push(0);
    assertFalse(stack.isEmpty());
    assertEquals(1, stack.getSize());
  }

  @Test
  public void afterOnePushAndOnePop_isEmpty() throws Exception {
    stack.push(0);
    stack.pop();
    assertTrue(stack.isEmpty());
    assertEquals(0, stack.getSize());
  }

  @Test
  public void afterTwoPushes_sizeIsTwo() throws Exception {
    stack.push(0);
    stack.push(0);
    assertEquals(2, stack.getSize());
  }

  @Test
  public void poppingEmptyStack_throwsUnderflow() throws Exception {
    assertThrows(
        Stack.Underflow.class,
        () -> {
          stack.pop();
        });
  }

  @Test
  public void afterPushingX_willPopX() throws Exception {
    stack.push(99);
    stack.push(88);
    assertEquals(88, stack.pop());
    assertEquals(99, stack.pop());
  }
}

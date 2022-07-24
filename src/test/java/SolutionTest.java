import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  @Test
  void checkPossibilityExample1() {
    assertTrue(sol.checkPossibility(new int[]{4, 2, 3}));
  }
  @Test
  void checkPossibilityExample2() {
    assertFalse(sol.checkPossibility(new int[]{4, 2, 1}));
  }
  @Test
  void checkPossibilityExample3() {
    assertFalse(sol.checkPossibility(new int[]{3, 4, 2, 3}));
  }
  @Test
  void checkPossibilityExample4() {
    assertTrue(sol.checkPossibility(new int[]{3, 4, 2, 4}));
  }
}
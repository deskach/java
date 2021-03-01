package dp.stairs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestCase {
  int numSteps = 0;
  int pathCount = 0;

  public TestCase(int numSteps, int pathCount) {
    this.numSteps = numSteps;
    this.pathCount = pathCount;
  }
}

class SolutionTest {
  TestCase[] testCases = {
      new TestCase(2, 2),
      new TestCase(3, 3),
  };

  @Test
  void climbStairs() {
    Solution sol = new DPSolution();

    for (TestCase testCase : testCases) {
      int res = sol.climbStairs(testCase.numSteps);

      Assertions.assertEquals(testCase.pathCount, res, testCase.numSteps);
    }
  }
}
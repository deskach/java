package dp.stairs;

/* Based on Fibonacci Formula */
public class BestSolution implements Solution {
  public int climbStairs(int n) {
    double sqrt5 = Math.sqrt(5);
    double fibn = Math.pow((1 + sqrt5) / 2, n + 1) - Math.pow((1 - sqrt5) / 2, n + 1);

    return (int) (fibn / sqrt5);
  }
}

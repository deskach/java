package build_an_array_with_stack_operations;

import java.util.ArrayList;
import java.util.List;

public class Solution {
  final String PUSH = "Push";
  final String POP = "Pop";

  public List<String> buildArray(int[] target, int n) {
    List<String> results = new ArrayList<>(100);

    for (int currentItemIndex = 0, counter = 1; counter <= n && currentItemIndex < target.length; counter++) {
      results.add(PUSH);

      if (counter < target[currentItemIndex]) {
        results.add(POP);
      } else {
        currentItemIndex++;
      }
    }

    return results;
  }
}

class TestSolution {
  public static void main(String[] args) {
    final int data0[] = {1, 3}, n0 = 3;
    final int data1[] = {1, 2, 3}, n1 = 3;
    final int data2[] = {1, 2}, n2 = 4;
    final int data3[] = {2, 3, 4}, n3 = 4;

    Solution sol = new Solution();

    System.out.println(sol.buildArray(data0, n0));
    System.out.println(sol.buildArray(data1, n1));
    System.out.println(sol.buildArray(data2, n2));
    System.out.println(sol.buildArray(data3, n3));
  }
}

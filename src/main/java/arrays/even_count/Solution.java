package arrays.even_count;

class Solution {
  public int findNumbers(int[] nums) {
    int evenCount = 0;

    for (Number n : nums) {
      int count = n.toString().toCharArray().length;

      if (count % 2 == 0) {
        evenCount++;
      }
    }

    return evenCount;
  }
}

class Main {

  public static void main(String[] args) {
    int[][] tests = {
        {12, 345, 2, 6, 7896},
        {555, 901, 482, 1771},
    };
    Solution sol = new Solution();

    for (int[] test : tests) {
      System.out.println(sol.findNumbers(test));
    }
  }
}

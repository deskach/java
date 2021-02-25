package arrays.sum.two;


import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {
  public static Integer[] mergeArray(Integer[] arr1, Integer[] arr2) {
    return Stream.of(arr1, arr2).flatMap(Stream::of).sorted().toArray(Integer[]::new);
  }

  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer[]> num2idx = IntStream.range(0, nums.length)
        .boxed()
        .collect(Collectors.toMap(i -> nums[i], i -> new Integer[]{i}, Solution::mergeArray));

    for (int i = 0; i < nums.length; i++) {
      int num = nums[i];
      int sibling = target - num;
      Integer[] siblingIdxs = num2idx.get(sibling);

      if (num != sibling) {
        if (siblingIdxs != null && siblingIdxs[0] != i) {
          return new int[]{i, siblingIdxs[0]};
        }
      } else if (siblingIdxs.length > 1) {
        return new int[]{siblingIdxs[0], siblingIdxs[1]};
      }
    }

    return new int[]{-1, -1};
  }
}

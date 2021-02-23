package arrays.sequence.longest.consequitive;

import java.util.Arrays;
import java.util.stream.Collector;

public class MySolution implements Solution {
  class Accum {
    public int counter = 0;
    public int maxCounter = 0;
    public int prevElement = Integer.MAX_VALUE;
    public int total = 0;
    public int processed = 0;

    public Accum(int total) {
      this.total = total;
    }
  }

  public int longestConsecutive(int[] nums) {
    Collector<Integer, Accum, Integer> numCollector = Collector.of(
        () -> new Accum(nums.length),
        (acc, num) -> {
          if (acc.prevElement == num - 1 || acc.processed > 0 && acc.prevElement == num) {
            if (acc.prevElement == num - 1) {
              acc.counter++;
            }
            if (acc.processed == acc.total - 1) {
              acc.maxCounter = Math.max(acc.maxCounter, acc.counter);
            }
          } else {
            acc.maxCounter = Math.max(acc.maxCounter, acc.counter);
            acc.counter = 0;
          }
          acc.prevElement = num;
          acc.processed++;
        },
        (r1, r2) -> r1,
        (accum) -> accum.total > 0 ? accum.maxCounter + 1 : 0
    );
    Integer res = Arrays.stream(nums)
        .boxed()
        .sorted()
        .collect(numCollector);

    return res;
  }
}


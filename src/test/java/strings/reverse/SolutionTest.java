package strings.reverse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class TestCase {
  char[] chars;
  char[] expected;

  public TestCase(char[] chars, char[] results) {
    this.chars = chars;
    this.expected = results;
  }
}

class SolutionTest {

  TestCase[] testCases = {
      new TestCase(new char[]{'h', 'e', 'l', 'l', 'o' }, new char[]{'o', 'l', 'l', 'e', 'h' }),
      new TestCase(new char[]{'H','a','n','n','a','h'}, new char[]{'h','a','n','n','a','H' }),
  };

  @Test
  void reverseString() {
    Solution sol = new Solution();

    for (TestCase tc : testCases) {
      sol.reverseString(tc.chars);

      Assertions.assertArrayEquals(tc.chars, tc.expected, stringsNotEqualMsg(tc.chars, tc.expected));
    }
  }

  private String stringsNotEqualMsg(char[] chars1, char[] chars2) {
    return Arrays.toString(chars1) + " != " + Arrays.toString(chars2);
  }
}
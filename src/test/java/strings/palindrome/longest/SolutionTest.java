package strings.palindrome.longest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class TestCase {
  String str;
  Set<String> answers;

  public TestCase(String str, Set<String> answers) {
    this.str = str;
    this.answers = answers;
  }
}

class SolutionTest {

  TestCase[] testCases = {
      new TestCase("aaaa", new HashSet<>(Arrays.asList("aaaa"))),
      new TestCase("aaaaab", new HashSet<>(Arrays.asList("aaaaa"))),
      new TestCase("babad", new HashSet<>(Arrays.asList("bab", "aba"))),
      new TestCase("cbbd", new HashSet<>(Arrays.asList("bb"))),
      new TestCase("a", new HashSet<>(Arrays.asList("a"))),
      new TestCase("ac", new HashSet<>(Arrays.asList("a", "c"))),
      new TestCase("babadc", new HashSet<>(Arrays.asList("bab", "aba"))),
  };

  @Test
  void longestPalindrome() {
    Solution sol = new Solution();

    for (TestCase tc : testCases) {
      String res = sol.longestPalindrome(tc.str);

      Assertions.assertTrue(
          tc.answers.contains(res),
          String.format("%s -> %s <> %s", tc.str, res, Arrays.deepToString(tc.answers.toArray()))
      );
    }
  }
}
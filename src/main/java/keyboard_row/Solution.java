package keyboard_row;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
  private static final List<Set> rows = Stream.of("qwertyuiop", "asdfghjkl", "zxcvbnm")
      .map(str -> new HashSet(Arrays.asList(str.chars().mapToObj(c -> (char) c).toArray(Character[]::new))))
      .collect(Collectors.toList());

  public String[] findWords(String[] words) {
    List<Set> processed = Stream.of(words)
        .map(String::toLowerCase)
        .map(str -> new HashSet(Arrays.asList(str.chars().mapToObj(c -> (char) c).toArray(Character[]::new))))
        .collect(Collectors.toList());
    ArrayList<String> results = new ArrayList<>();

    for (int i = 0; i < processed.size(); i++) {
      Set hStr = processed.get(i);

      for (Set hRow : rows) {
        if (hRow.containsAll(hStr)) {
          results.add(words[i]);
        }
      }
    }

    return results.toArray(String[]::new);
  }
}

class Main {
  public static void main(String[] args) {
    Solution sol = new Solution();
    String[] words0 = {"Hello", "Alaska", "Dad", "Peace"};
    String[] words1 = {"omk"};
    String[] words2 = {"adsdf","sfd"};

    System.out.println(Arrays.toString(sol.findWords(words0)));
    System.out.println(Arrays.toString(sol.findWords(words1)));
    System.out.println(Arrays.toString(sol.findWords(words2)));
  }
}
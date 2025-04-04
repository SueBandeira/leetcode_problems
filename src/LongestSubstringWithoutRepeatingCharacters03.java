import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestSubstringWithoutRepeatingCharacters03 {
  public static void main(String[] args) {

  }
  public static int lengthOfLongestSubstring(String s) {
    char[] c1 = s.toCharArray();
    if (c1.length == 0) {
      return 0;
    }
    String c2 = String.valueOf(c1[0]), letter;
    int count = 1;

    for (int i = 1; i < c1.length; i++) {
      letter = String.valueOf(c1[i]);
      if (!c2.contains(letter)) {
        c2 += c1[i];
        count = Math.max(count, c2.length());
      } else {
        c2 = c2.substring(c2.indexOf(letter) + 1) + letter;
      }
    }

    return count;
  }
}
class LengthOfLongestSubstringTest {
  @Test
  void solution() {
    String s1 = "abcabcbb";
    String s2 = "bbbbb";
    String s3 = "pwwkew";
    String s4 = "dvdf";

    int expected1 = 3;
    int expected2 = 1;
    int expected3 = 3;
    int expected4 = 3;

    Assertions.assertEquals(expected1, LongestSubstringWithoutRepeatingCharacters03.lengthOfLongestSubstring(s1));
    Assertions.assertEquals(expected2, LongestSubstringWithoutRepeatingCharacters03.lengthOfLongestSubstring(s2));
    Assertions.assertEquals(expected3, LongestSubstringWithoutRepeatingCharacters03.lengthOfLongestSubstring(s3));
    Assertions.assertEquals(expected4, LongestSubstringWithoutRepeatingCharacters03.lengthOfLongestSubstring(s4));
  }
}

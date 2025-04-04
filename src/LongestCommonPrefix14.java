import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestCommonPrefix14 {
  public static void main(String[] args) {

  }
  public static String longestCommonPrefix(String[] strs) {
    String result = "", word = strs[0];
    if (strs. length == 1) {
      return word;
    }
    int flag=0;
    for (int i = 0; i < word.length(); i++) {
      char letra = word.charAt(i);
      for (int j = 1; j < strs.length; j++) {
        String stringAtual = strs[j];
        if (stringAtual.length() > i && stringAtual.charAt(i) == letra) {
          flag++;
        }
      }
      if (flag == strs.length -1) {
        result += letra;
      } else {
        break;
      }
      flag = 0;

    }
    return result;
  }
}
class LongestCommonPrefix14Test {
  @Test
  void solution() {
    String[] s1 = {"flower",
        "flow",
        "flight"};
    String[] s2 = {"dog","racecar","car"};
    String[] s3 = {"dog","car","car"};
    String[] s4 = {"fayre"};
    String[] s5 = { "macarronada", "macarao", "maca"};

    String expected1 = "fl";
    String expected2 = "";
    String expected3 = "";
    String expected4 = "fayre";
    String expected5 = "maca";

    Assertions.assertEquals(expected5, LongestCommonPrefix14.longestCommonPrefix(s5));
    Assertions.assertEquals(expected4, LongestCommonPrefix14.longestCommonPrefix(s4));
    Assertions.assertEquals(expected1, LongestCommonPrefix14.longestCommonPrefix(s1));
    Assertions.assertEquals(expected2, LongestCommonPrefix14.longestCommonPrefix(s2));
    Assertions.assertEquals(expected3, LongestCommonPrefix14.longestCommonPrefix(s3));
  }
}

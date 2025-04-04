import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeNumber9 {
  public static boolean isPalindrome(int x) {
    String num;
    char[] vetorChar;

    num = String.valueOf(x);
    vetorChar = num.toCharArray();
    char[] vetorChar2 = new char[vetorChar.length];

    for (int i = 0; i < vetorChar.length; i++) {
      vetorChar2[i] = vetorChar[(vetorChar.length - 1) - i];
    }

    for (int i = 0; i < vetorChar.length; i++) {
      if (vetorChar[i] != vetorChar2[i]) {
        return false;
      }
    }
    return true;
  }
}

class TestPalindromeNumber9 {
  @Test
  void testSolution() {
    int n1 = 121;
    int n2 = -121;
    int n3 = 10;

    boolean expected1 = true;
    boolean expected2 = false;
    boolean expected3 = false;

    Assertions.assertEquals(expected1, PalindromeNumber9.isPalindrome(n1));
    Assertions.assertEquals(expected2, PalindromeNumber9.isPalindrome(n2));
    Assertions.assertEquals(expected3, PalindromeNumber9.isPalindrome(n3));
  }

  //Assertions.assert
}

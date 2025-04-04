import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;

public class RomanToInteger {
  public static int romanToInt(String s) {
    char[] numerosRomanos = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
    int[] inteiros = {1, 5, 10, 50, 100, 500, 1000};
    int resultado=0;
    for (int i = 0; i < s.length(); i++) {
      int atualValor = getInfo(s.charAt(i), numerosRomanos, inteiros);
      int proximoValor = (i+1 < s.length()) ? getInfo(s.charAt(i+1), numerosRomanos, inteiros) : 0;
      if (atualValor < proximoValor) {
        resultado -= atualValor;
      } else {
        resultado += atualValor;
      }
    }
    //int result = map.get(s);
    return resultado;
  }
  private static int getInfo(char a, char[] b, int[] c) {
    for (int i = 0; i < b.length; i++) {
      if (b[i] == a) {
        return c[i];
      }
    }
    return 0;
  }
}
class TestRomanToInteger {
  @Test
  void testSolution() {
    String n0 = "C";
    String n1 = "III";
    String n2 = "LVIII";
    String n3 = "MCMXCIV";
    //pode mudar a estrutura para linked map
    int expected0 = 100;
    int expected1 = 3;
    int expected2 = 58;
    int expected3 = 1994;

    Assertions.assertEquals(expected0, RomanToInteger.romanToInt(n0));
    Assertions.assertEquals(expected1, RomanToInteger.romanToInt(n1));
    Assertions.assertEquals(expected2, RomanToInteger.romanToInt(n2));
    Assertions.assertEquals(expected3, RomanToInteger.romanToInt(n3));
  }
}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses20 {
  public static void main(String[] args) {

    /*
    * Bio A 1
    * Mat A 2  MAT A == BIO A = FALSE COMPARA SEMPRE AO ULTIMO
    * Mat A 3
    *
    *
    * */

  }
  public static boolean isValid(String s){
    char[] sVetor = s.toCharArray();
    Stack<Character> pilha = new Stack<>();
    HashMap<Character, Character> reference = new HashMap<>();
    reference.put('[', ']');
    reference.put('{', '}');
    reference.put('(', ')');

    for (int j = 0; j < sVetor.length; j++) {
      //checar se na pilha exite o caracter correspondente
      if (!pilha.isEmpty() && pilha.peek() == sVetor[j]) {
        pilha.pop();
      } else {
        Character result = reference.get(sVetor[j]);
        if (result == null) {
          return false;
        }
        pilha.push(result);
      }
    }
    return pilha.isEmpty();
  }
}

class ValidParentheses20Test {
  @Test
  void solution() {
    LinkedHashMap<String, Boolean> teste = new LinkedHashMap<String, Boolean>();
    teste.put("()", true);
    teste.put("()[]{}", true);
    teste.put("(]", false);
    teste.put("([])", true);
    teste.put("([{}])", true);
    teste.put("([}])", false);

    for (Map.Entry<String, Boolean> par : teste.entrySet()) {
      boolean estado = ValidParentheses20.isValid(par.getKey());
      if (estado != par.getValue()) {
        System.out.printf("Avaliado = %s\nEsperado = %s\nRecebido = %s\n%s\n", par.getKey(), par.getValue(), estado, "_".repeat(14));
      }
      Assertions.assertEquals(par.getValue(), estado);
    }
  }
}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedHashMap;

public class RemoveDuplicatesFromSortedArray {
  public int removeDuplicates(int[] nums) {
    int k = 1;
    List<Integer> numsAux = new ArrayList<>();
    numsAux.add(nums[0]);

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] != nums[i-1]) {
        numsAux.add(nums[i]);
      }
    }

    for (int i = 0; i < numsAux.size(); i++) {
      nums[i] = numsAux.get(i);
    }

    k = numsAux.size();

    return k;
  }
}

class RemoveDuplicatesFromSortedArrayTest {
  static LinkedHashMap<int[], int[]> tests = new LinkedHashMap<>();
  static RemoveDuplicatesFromSortedArray t = new RemoveDuplicatesFromSortedArray();

  static {
    tests.put(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, new int[]{0, 1, 2, 3, 4});
    tests.put(new int[]{1, 1, 2}, new int[]{1, 2});
  }

  @Test
  void testSolution() {
    for(var par : tests.entrySet()) {
      int[] k = par.getKey();
      int[] v = par.getValue();
      int n = t.removeDuplicates(k);
      Assertions.assertEquals(v.length, n);
      for(int i = 0; i < n; i++) {
        Assertions.assertEquals(v[i], k[i]);
      }
    }
  }
}
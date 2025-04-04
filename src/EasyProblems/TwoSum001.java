package EasyProblems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSum001 {
  public static int[] twoSum(int[] nums, int target) {
    for(int i = 0; i < nums.length; i++) {
      for(int j = 0; j < nums.length; j++) {
        int sum = nums[i] + nums[j];
        if(sum == target && i != j) return new int[]{i, j};
      }
    }
    return null;
  }
}

class TwoSum001Test {
  @Test
  void testSolution() {
    int[] nums = {2, 7, 11, 15};
    int[] nums2 = {3, 2, 4};
    int[] nums3 = {3, 3};
    int[] nums4 = {3, 2, 4};

    int[] target = {9, 6, 6, 6};

    int[] expected = {0, 1};
    int[] expected2 = {1, 2};
    int[] expected3 = {0, 1};
    int[] expected4 = {1, 2};

    Assertions.assertArrayEquals(expected, TwoSum001.twoSum(nums, target[0]));
    Assertions.assertArrayEquals(expected2, TwoSum001.twoSum(nums2, target[1]));
    Assertions.assertArrayEquals(expected3, TwoSum001.twoSum(nums3, target[2]));
    Assertions.assertArrayEquals(expected4, TwoSum001.twoSum(nums4, target[3]));
  }
}

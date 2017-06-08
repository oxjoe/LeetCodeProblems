/**
 * Created by Joseph on 6/7/2017.
 * https://leetcode.com/problems/move-zeroes/#/description
 */

import java.util.Arrays;

public class moveZeros {

  public static void solution(int[] nums) {
    int counter = 0;
    // count # of zeros
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0) {
        counter++;
      }
    }
    int nonZeros = nums.length - counter;
    counter = 0;
    while (counter < nonZeros) {
      if (nums[i] == 0) {
        for (int j = i; j < ; j++) {

        }
        nums[nums.length - 1] = 0;
        continue;
      }
      counter++;
    }
  }

  public static void main(String[] args) {
    int[] temp = {0, 1, 0, 3, 12};
    solution(temp);
    System.out.println(Arrays.toString(temp));
  }
}

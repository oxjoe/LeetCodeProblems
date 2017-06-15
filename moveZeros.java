/**
 * Created by Joseph on 6/7/2017.
 * https://leetcode.com/problems/move-zeroes/#/description
 */

import java.util.Arrays;

public class moveZeros {

  public static void solution(int[] nums) {
    int totalNumZeros = 0;
    // count # of zeros
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0) {
        totalNumZeros++;
      }
    }

    int zerosInLoop = 0;
    int current = 0;
    while (zerosInLoop < totalNumZeros) {
      if (nums[current] == 0) {
        for (int i = current; i < nums.length - zerosInLoop; i++) {
          if (i+1 >= nums.length) {
            continue;
          }
          nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = 0;
        //(0,1,0)
        zerosInLoop++;
      } else if (nums[current] != 0) {
        current++;
      }
    }
  }

  public static void main(String[] args) {
    int[] temp = {0, 1, 0, 3, 12};
    solution(temp);
    System.out.println(Arrays.toString(temp));
  }
}

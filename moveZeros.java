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

    int counter;
    int zerosInLoop = 0;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0) {
        counter = 0;
        while (counter < nums.length - (i + 1)) {
          nums[i + counter] = nums[i + counter + 1];
          counter++;
        }
        nums[nums.length - 1] = 0;
        zerosInLoop++;
      }
      if (zerosInLoop == totalNumZeros) {
        break;
      }
    }


  }

  public static void main(String[] args) {
    int[] temp = {0, 0,0,0, 0,2,3,4};
    solution(temp);
    System.out.println(Arrays.toString(temp));
  }
}

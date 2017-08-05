/**
 * Created by Joseph on 6/5/2017. https://leetcode.com/problems/single-number/#/description Given an
 * array of integers, every element appears twice except for one. Find that single one.
 */

import java.util.Arrays;

public class singleNumber {

  //  My way
  public static int solution(int[] nums) {
    Arrays.sort(nums);
    boolean state = true;
    int i = 0;
    int answer = 0;

    while (state) {
      if (i == nums.length - 1 || nums[i] != nums[i + 1]) {
        answer = nums[i];
        state = false;
      } else if (nums[i] == nums[i + 1]) {
        i += 2;
      }
    }
    return answer;
  }

  // Other way
  public static int solutionTwo(int[] nums) {
    int result = nums[0];
    for (int i = 1; i < nums.length; i++) {
      result = result ^ nums[i];
    }
    return result;
  }

  public static void main(String[] args) {
    int[] a = new int[]{1};
    int[] b = new int[]{5, 2, 3, 3, 2, 5, 4};
    System.out.print(solution(a));
    System.out.print(solution(b));
  }
}
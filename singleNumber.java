/**
 * Created by Joseph on 6/5/2017.
 * https://leetcode.com/problems/single-number/#/description
 * Given an array of integers, every element appears twice except for one. Find that single one.
 */

import java.util.Arrays;

public class singleNumber {

  public static int solution(int[] nums) {
//    Function to sort from least to greatest
//    then iterate through the array and compare the current and the next value if they are the same
//    if they are not then return current value

    if (nums.length == 1) {
      return nums[1];
    }
    Arrays.sort(nums);
    for (int i = 0; i < nums.length; i++) {
      if (i + 1 == nums.length) { // must be added b/c if i+1 is out of the loop
        break;
      }
      if (nums[i] != nums[i + 1]) {
        return nums[i];
      }
    }
  }

  public static void main(String[] args) {
    //System.out.println(solution([1]));
  }
}

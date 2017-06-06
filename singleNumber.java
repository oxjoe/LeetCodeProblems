/**
 * Created by Joseph on 6/5/2017.
 * https://leetcode.com/problems/single-number/#/description
 * Given an array of integers, every element appears twice except for one. Find that single one.
 */

import java.util.Arrays;

public class singleNumber {

  public static int solution(int[] nums) {

    // Sort the array
    Arrays.sort(nums);
    int answer = 0;

//  iterate through array, input will always be odd, i+=2 to skip every two ints
    for (int i = 0; i <= nums.length + 1; i += 2) {
//       if cur value is != to cur value + 1 then cur is answer, if cur value + 1 is out of bounds
//       then goto catch
      try {
        if (nums[i] != nums[i + 1]) {
          answer = nums[i];
          break;
        }
//     Catch the error and set answer as the last element in array
      } catch (ArrayIndexOutOfBoundsException e) {
        answer = nums[nums.length - 1];
        break;
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    int[] array = new int[]{1, 1, 3, 3, 2, 6, 6, 5, 5};
    System.out.print(solution(array));
  }
}

// Home come this has error of missing return statement? scope of return?

/*
    // Sort the array
    Arrays.sort(nums);
    int answer = 0;

    // Iterate thorough and see if the current value and the next value are the same
    // if they aren't then the current value is the answer
    for (int i = 0; i <= nums.length + 1; i += 2) {
      try {
        if (nums[i] != nums[i + 1]) {
          return nums[i];
        }
      } catch (ArrayIndexOutOfBoundsException e) {
        return nums[nums.length - 1];
      }
    }
    //return 0;
  */
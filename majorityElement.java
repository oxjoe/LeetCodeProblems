import java.util.Arrays;

/**
 * Created by Joseph on 8/22/2017.
 */
//https://leetcode.com/problems/majority-element/description/
//runtime of nlog(n)
public class majorityElement {

  public static int solution(int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    }

    Arrays.sort(nums);
    int times = 1;

    for (int i = 1; i != nums.length; i++) {
      if (nums[i] == nums[i - 1]) {
        times++;
      }
      if (times > nums.length / 2) {
        times = nums[i];
        break;
      }
    }
    return times;
  }


  public static void main(String[] args) {
    int[] a = new int[]{1, 2, 3, 3, 3, 3, 4};
    System.out.println(solution(a));
  }
}

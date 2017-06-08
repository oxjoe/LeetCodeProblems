/**
 * Created by Joseph on 6/6/2017.
 * https://leetcode.com/problems/sum-of-two-integers/#/description
 */
public class sumOfTwoIntegers {

  public static int getSum(int a, int b) {
//    if (a == b) {
//      return a * 2;
//
//    } else if (a == 0 && b != 0) {
//      return b;
//    } else if (a != 0 && b == 0) {
//      return a;
//    } else if (a == 0 && b == 0) {
//      return 0;
//    }
    int max = Math.max(a,b);
    int min = Math.min(a,b);
    for (int i = 0; i < Math.abs(max); i++) {
      if (min > 0) {
        min++;
      } else {
        min--;
      }
    }
    return min;
  }

  public static void main(String[] args) {
    System.out.println(getSum(-1, 1));
//    System.out.println(getSum(21, 43));
//    System.out.println(getSum(0, 0));
//    System.out.println(getSum(0, 3));
//    System.out.println(getSum(3, 0));
  }
}

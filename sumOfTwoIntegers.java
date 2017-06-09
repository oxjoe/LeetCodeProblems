/**
 * Created by Joseph on 6/6/2017.
 * https://leetcode.com/problems/sum-of-two-integers/#/description
 */
public class sumOfTwoIntegers {

  public static int getSum(int a, int b) {
    int max = Math.max(a,b);
    int min = Math.min(a,b);

    if (a == b) {
      return a * 2;
    } else if (a == 0 && b != 0) {
      return b;
    } else if (a != 0 && b == 0) {
      return a;
    } else if (a == 0 && b == 0 || min * -1 == max) {
      return 0;
    }

    for (int i = 0; i < Math.abs(max); i++) {
      if (min > 0 || (min < 0 && Math.abs(min) == min)) {
        min++;
      } else if (min < 0) {
        min--;
      }
    }
    return min;
  }

  public static void main(String[] args) {
    System.out.println(getSum(-14, 16));
//    System.out.println(getSum(21, 43));
//    System.out.println(getSum(0, 0));
//    System.out.println(getSum(0, 3));
//    System.out.println(getSum(3, 0));
  }
}

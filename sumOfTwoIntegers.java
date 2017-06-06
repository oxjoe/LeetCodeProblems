/**
 * Created by Joseph on 6/6/2017.
 * https://leetcode.com/problems/sum-of-two-integers/#/description
 */
public class sumOfTwoIntegers {

  public static int getSum(int a, int b) {
    if (a == b) {
      return a * 2;

    } else if (a == 0 && b != 0) {
      return b;
    } else if (a != 0 && b == 0) {
      return a;
    } else if (a == 0 && b == 0) {
      return 0;
    }
    int bigNum = Math.max(a, b); // 43
    int smallNum = Math.min(a, b); // 21

    int squaredBigNum = (int) Math.pow(bigNum, 2); //1849
    int squaredSmallNum = (int) Math.pow(smallNum, 2); //441

    int answer = squaredBigNum / squaredSmallNum;

    return answer * smallNum;
  }

  public static void main(String[] args) {
    System.out.println(getSum(1, 2));
    System.out.println(getSum(21, 43));
    System.out.println(getSum(0, 0));
    System.out.println(getSum(0, 3));
    System.out.println(getSum(3, 0));
  }
}

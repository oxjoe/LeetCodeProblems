/**
 * Created by Joseph on 7/6/2017.
 * https://leetcode.com/problems/hamming-distance/tabs/description
 */
public class hammingDistance {

  public static int solution(int x, int y) {
    String temp = Integer.toBinaryString(x ^ y);
    char[] arr = temp.toCharArray();
    int answer = 0;
    for (char e : arr) {
      if (e == '1') {
        answer++;
      }
    }
    return answer;
  }

// Integer.bitCount(x ^ y) from LeetCode

  public static void main(String[] args) {
    System.out.println(solution(1, 4));
    System.out.println(solution(22, 32));
  }
}

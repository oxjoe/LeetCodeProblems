/**
 * Created by Joseph on 6/5/2017.
 * https://leetcode.com/problems/reverse-string/#/description
 */
public class reverseString {

  public static String reverseStringOne(String s) {

    return new StringBuilder(s).reverse().toString();
  }

  //  Bottom two methods -> time limit exceeded
  public static String reverseStringTwo(String s) {

    char[] myArr = s.toCharArray();
    String answer = "";
    for (int i = s.length() - 1; i >= 0; i--) {
      answer += myArr[i];
    }
    return answer;
  }

  public static String reverseStringThree(String s) {

    String answer = "";
    for (int i = s.length() - 1; i >= 0; i--) {
      answer += s.substring(i, i + 1);
    }
    return answer; // substring is (inclusive, exclusive)
  }

  public static void main(String[] args) {
    System.out.println(reverseStringOne("hello"));
    System.out.println(reverseStringTwo("hello"));
    System.out.println(reverseStringThree("hello"));

  }
}

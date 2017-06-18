/**
 * Created by Joseph on 6/5/2017.
 * https://leetcode.com/problems/reverse-string/#/description
 */
public class reverseString {

  public static String reverseStringOne(String s) {
    // Swaps begin and end element, increasing begin and decreasing end each time.
    if (s.length() == 0 || s == null) {
      return "";
    }
    char[] charArray = s.toCharArray();
    int begin = 0;
    int end = s.length() - 1;
    while (begin <= end) {
      char c = charArray[begin];
      charArray[begin] = charArray[end];
      charArray[end] = c;
      begin++;
      end--;
    }
    return new String(charArray);
  }

  public static String reverseStringTwo(String s) {
    return new StringBuilder(s).reverse().toString();
  }

  public static String reverseStringThree(String s) {
    StringBuilder sb = new StringBuilder(s);
    return sb.reverse().toString();
  }


  public static void main(String[] args) {
    System.out.println(reverseStringOne("hello"));
    System.out.println(reverseStringTwo("hello"));
    System.out.println(reverseStringThree("hello"));

  }
}

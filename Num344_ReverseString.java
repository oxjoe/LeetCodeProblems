/**
 * Created by Joseph on 6/5/2017. https://leetcode.com/problems/reverse-string/
 */
public class Num344_ReverseString {

  // Swaps begin and end element, increasing begin and decreasing end each time.
  public static String reverseStringOne(String s) {

    // Not necessary
    if (s.length() == 0) {
      return "";
    }
    char[] charArray = s.toCharArray(); // Converts string to array
    int begin = 0; // begin is 0 so it will be the first letter of the string
    int end = s.length() - 1; // end will be the last letter of the string
    while (begin <= end) {
      // These 3 lines just swap the first and last letter of the string
      char c = charArray[begin];
      charArray[begin] = charArray[end];
      charArray[end] = c;
      begin++;
      end--;
    }
    return new String(charArray);
  }

  public static String reverseStringTwo(String s) {
    return new StringBuilder(s).reverse()
        .toString(); // Has to have toString() b/c or else return type will be of type StringBuilder
  }

  public static String reverseStringThree(String s) {
    StringBuilder sb = new StringBuilder(s);
    return sb.reverse().toString();
  }

  public static void main(String[] args) {
    System.out.println(reverseStringOne(""));
    System.out.println(reverseStringOne("hello"));
    System.out.println(reverseStringTwo("hello"));
    System.out.println(reverseStringThree("hello"));

  }
}

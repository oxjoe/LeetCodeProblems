/**
 * Created by Joseph on 7/6/2017.
 */
// https://leetcode.com/problems/first-unique-character-in-a-string/#/description
public class firstUniqChar {

  public static int firstUniqChar(String s) {
    char[] freq = new char[26];
    for (int i = 0; i < s.length(); i++) {
      freq[s.charAt(i) - 'a']++;
    }
    for (int i = 0; i < s.length(); i++) {
      if (freq[s.charAt(i) - 'a'] == 1) {
        return i;
      }
    }
    return -1;
  }


  public static void main(String[] args) {
    System.out.println(firstUniqChar("ccbee")); // 0
    System.out.println(firstUniqChar("ccc")); // -1
    System.out.println(firstUniqChar("loveleetcode")); // 2
  }

}

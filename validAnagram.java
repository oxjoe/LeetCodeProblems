import java.util.Arrays;

/**
 * Created by Joseph on 8/31/2017.
 */
//https://leetcode.com/problems/valid-anagram/description/
public class validAnagram {

  public static boolean solution(String s, String t) {
    int[] freq = new int[26];
    int[] zeros = new int[26];
    for (int i = 0; i != s.length(); i++) {
      if (s.charAt(i) == 32) {
        continue;
      }
      freq[s.charAt(i) - 'a']++;
    }
    for (int i = 0; i < t.length(); i++) {
      if (t.charAt(i) == 32) {
        continue;
      }
      freq[t.charAt(i) - 'a']--;
    }
    return Arrays.equals(freq, zeros);
  }

  public static void main(String[] args) {
    System.out.println(solution("anagram", "nagaram"));
    System.out.println(solution("rat", "car"));
  }
}
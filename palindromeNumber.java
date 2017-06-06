/**
 * Created by Joseph on 6/5/2017.
 * https://leetcode.com/problems/palindrome-number/#/description
 */
public class palindromeNumber {

  public static boolean isPalindrome(int x) {
//    converts integer to string
    String temp = Integer.toString(x);
//    make array that is string length long
    int[] arr = new int[temp.length()];
//    gets a char[i] of string and adds it to array
    for (int i = 0; i < temp.length(); i++) {
      arr[i] = temp.charAt(i);
    }
//    make a new array to store it backwards
    int[] backwards = new int[temp.length()];
    int counter = 0;
//    sets the last element of the original array to the first element of backwards
    for (int i = temp.length() - 1; i >= 0; i--) {
      backwards[counter] = arr[i];
      counter++;
    }

//  reset variables
    counter = 0;
    int i = 0;
//    loop to check if both arrays match or not
//    used do while to force it to start
    do {
      if (backwards[counter] != arr[i]) {
        return false;
      }
      counter++;
      i++;

    } while (counter < temp.length());
    return true;

  }

  public static void main(String[] args) {
    System.out.println(isPalindrome(-2147483648));
    System.out.println(isPalindrome(12321));
  }
}
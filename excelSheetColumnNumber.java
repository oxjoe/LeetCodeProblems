/**
 * Created by Joseph on 6/8/2017.
 * https://leetcode.com/problems/excel-sheet-column-number/#/description
 */
public class excelSheetColumnNumber {

  public static int titleToNumber(String s) {
    char[] arr = s.toCharArray();
    int answer = 0;

    if (arr.length == 1) {
      answer = convertToNum(arr[0]);
    } else if (arr.length == 2) {
      answer = convertToNum(arr[1]) + (convertToNum(arr[0]) * 26);
    }
    return answer;
  }

  public static int convertToNum(char c) {
    return (int) c - 64;
  }

  public static void main(String[] args) {
    System.out.println(titleToNumber("AA"));
    System.out.println(titleToNumber("ZZ"));
    // AAA->703, 27*26?
  }
}
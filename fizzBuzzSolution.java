/**
 * Created by Joseph on 6/5/2017.
 * https://leetcode.com/problems/fizz-buzz/#/description
 */

import java.util.ArrayList;
import java.util.List;

public class fizzBuzzSolution {

  public static void main(String[] args) {
    fizzBuzzSolution obj = new fizzBuzzSolution();
    System.out.println(obj.fizzBuzz(15));
  }

  public List<String> fizzBuzz(int n) {
    // init list
    List<String> myList = new ArrayList<String>();

    // iterate up to n
    for (int i = 1; i <= n; i++) {
      if (i % 15 == 0) { // multiple of 15, add FizzBuzz. Has to be first so it wont just add Fizz
        myList.add("FizzBuzz");
      } else if (i % 3 == 0) { // multiple of 3, add Fizz
        myList.add("Fizz");
      } else if (i % 5 == 0) { // multiple of 5, add Buzz
        myList.add("Buzz");
      } else { // add number but concatenate
        myList.add("" + i);
      }
    }

    return myList;
  }
}
  /* OUTPUT
  [1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz]
   */

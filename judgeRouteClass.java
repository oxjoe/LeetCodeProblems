/**
 * Created by Joseph on 8/13/2017.
 */
// https://leetcode.com/problems/judge-route-circle/description/
public class judgeRouteClass {

  public static boolean judgeCircle(String moves) {
    int move = 0;
    for (int i = 0; i < moves.length(); i++) {
      if (moves.charAt(i) == 'U' || moves.charAt(i) == 'R') {
        move += 1;
      } else if (moves.charAt(i) == 'D' || moves.charAt(i) == 'L') {
        move -= 1;
      }
    }
    if (move == 0) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    System.out.println(judgeCircle("UD"));
    System.out.println(judgeCircle("LL"));
  }
}

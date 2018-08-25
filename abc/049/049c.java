import java.util.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String dream = "dream";
    String dreamer = "dreamer";
    String erase = "erase";
    String eraser = "eraser";

    String answer = "YES";
    int i = s.length() - 1;
    while (i >= 0) {
      if (s.charAt(i) == 'm') {
        if (i - 4 >= 0 && Objects.equals(s.substring(i - 4, i + 1), dream)) {
          i -= 5;
          continue;
        } else {
          answer = "NO";
          break;
        }
      } else if (s.charAt(i) == 'e') {
        if (i - 4 >= 0 && Objects.equals(s.substring(i - 4, i + 1), erase)) {
          i -= 5;
          continue;
        } else {
          answer = "NO";
          break;
        }
      } else if (s.charAt(i) == 'r') {
        if (i - 6 >= 0 && Objects.equals(s.substring(i - 6, i + 1), dreamer)) {
          i -= 7;
          continue;
        } else if (i - 5 >= 0 && Objects.equals(s.substring(i - 5, i + 1), eraser)) {
          i -= 6;
          continue;
        } else {
          answer = "NO";
          break;
        }
      } else {
        answer = "NO";
        break;
      }
    }

    System.out.println(answer);
  }
}

import java.util.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();

    int answer = 0;
    for (int i = 0; i < a.length(); i++) {
      if (a.charAt(i) == '1') {
        answer++;
      }
    }
    System.out.println(answer);
  }
}

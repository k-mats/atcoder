import java.util.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int answer = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      int a = sc.nextInt();
      int aans = 0;
      // Check if every value is even
      if (a % 2 == 1) {
        System.out.println(0);
        return;
      } else {
        while (true) {
          if (a % 2 == 0) {
            aans++;
            a /= 2;
          } else {
            answer = Math.min(answer, aans);
            break;
          }
        }
      }
    }

    System.out.println(answer);
  }
}

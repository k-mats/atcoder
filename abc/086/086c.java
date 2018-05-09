import java.util.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    String answer = "Yes";
    int prev_t = 0;
    int prev_x = 0;
    int prev_y = 0;

    for (int i = 0; i < n; i++) {
      int t = sc.nextInt();
      int x = sc.nextInt();
      int y = sc.nextInt();

      int d_t = t - prev_t;
      int d_x_abs = Math.abs(x - prev_x);
      int d_y_abs = Math.abs(y - prev_y);

      if (d_t % 2 == (d_x_abs + d_y_abs) % 2 && d_t >= d_x_abs + d_y_abs) {
        prev_t = t;
        prev_x = x;
        prev_y = y;
        continue;
      } else {
        answer = "No";
        break;
      }
    }

    System.out.println(answer);
  }
}

import java.util.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] counts = new int[100];

    for (int i = 0; i < n; i++) {
      int di = sc.nextInt();
      counts[di - 1]++;
    }

    int answer = 0;
    for (int i = 0; i < 100; i++) {
      if (counts[i] > 0) {
        answer++;
      }
    }

    System.out.println(answer);
  }
}

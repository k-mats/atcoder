import java.util.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();

    int answer = 0;

    for (int i = 1; i <= n; i++) {
      int c = findSumOfDigits(i);

      if (c >= a && c <= b) {
        answer += i;
      }
    }

    System.out.println(answer);
  }

  private static int findSumOfDigits(int x) {
    int sum = 0;
    while (x > 0) {
      sum += x % 10;
      x /= 10;
    }
    return sum;
  }
}

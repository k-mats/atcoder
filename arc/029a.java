import java.util.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] t = new int[n];

    for (int i = 0; i < n; i++) {
      t[i] = sc.nextInt();
    }

		Arrays.sort(t);

		int a = 0;
		int b = 0;

		for (int i = n - 1; i >= 0; i--) {
			if (a < b) {
				a += t[i];
			} else {
				b += t[i];
			}
		}

		System.out.println(Math.max(a, b));
	}
}

import java.util.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(in);
    int n = sc.nextInt();
		boolean[] dp = new boolean[n * 100 + 1];
		dp[0] = true;

		for (int i = 0; i < n; i++) {
			int p = sc.nextInt();
			for (int j = n * 100 - p; j >= 0; j--) {
				dp[j + p] = dp[j + p] | dp[j];
			}
		}

		int cnt = 0;
		for (int i = 0; i < n * 100 + 1; i++) {
			if (dp[i]) {
				cnt++;
			}
		}

		out.println(cnt);
	}
}

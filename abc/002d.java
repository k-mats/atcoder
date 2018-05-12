import java.util.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] r = new int[n][n];
		for (int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			r[x-1][y-1] = 1;
		}

		int ans = 0;

		for (int i = (1 << n) - 1; i > 0; i--) {
			int[] s = new int[n];
			int numSec = 0;
			for (int j = 0; j < n; j++) {
				if ((1 & (i >> j)) == 1) {
					s[j] = 1;
					numSec++;
				}
			}

			boolean allRel = true;
			for (int j = 0; j < n - 1; j++) {
				if (s[j] == 0) {
					continue;
				}
				for (int k = j + 1; k < n; k++) {
					if (s[k] == 0) {
						continue;
					}
					if (r[j][k] == 0) {
						allRel = false;
						break;
					}
				}
				if (!allRel) {
					break;
				}
			}

			if (allRel) {
				ans = Math.max(ans, numSec);
			}
		}
		System.out.println(ans);
	}
}

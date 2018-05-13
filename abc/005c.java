import java.util.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(in);
    int t = sc.nextInt();
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] b = new int[m];
		for (int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
		}

		int j = 0;
		for (int i = 0; i < m; i++) {
			boolean sold = false;
			while (j < n) {
				if (b[i] >= a[j] && b[i] <= a[j] + t) {
					sold = true;
					j++;
					break;
				} else {
					j++;
				}
			}
			if (!sold) {
				out.println("no");
				return;
			}
		}

		out.println("yes");
	}
}

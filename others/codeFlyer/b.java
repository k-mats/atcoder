import java.util.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(in);
    int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		String x = sc.next();

		for (int i = 0; i < n; i++) {
			char xx = x.charAt(i);
			if (xx == 'S' && a > 0) {
				a--;
			} else if (xx == 'C' && b > 0) {
				b--;
			} else if (xx == 'E') {
				if (a == 0) {
					if (b > 0) {
						b--;
					}
				} else {
					if (a >= b) {
						a--;
					} else if (b > 0) {
						b--;
					}
				}
			}
		}

		out.println(a);
		out.println(b);
	}
}

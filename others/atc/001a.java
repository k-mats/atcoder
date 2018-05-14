import java.util.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] c = new char[h][w];
		int[] dy = {-1, 0, 1, 0};
		int[] dx = {0, -1, 0, 1};
		Stack<Point> stack = new Stack();

		for (int i = 0; i < h; i++) {
			String s = sc.next();
			for (int j = 0; j < w; j++) {
				c[i][j] = s.charAt(j);
				if (c[i][j] == 's') {
					Point p = new Point(i, j);
					stack.push(p);
				}
			}
		}

		while (stack.size() > 0) {
			Point p = stack.pop();

			for (int i = 0; i < dy.length; i++) {
				int npy = p.y + dy[i];
				int npx = p.x + dx[i];
				if (npy >= 0 && npy < h && npx >= 0 && npx < w) {
					// Check if it's goal
					if (c[npy][npx] == 'g') {
						System.out.println("Yes");
						return;
					} else if (c[npy][npx] == '.') {
						c[npy][npx] = '-';
						stack.push(new Point(npy, npx));
					}
				}
			}
		}

		System.out.println("No");
	}

	public static class Point {
		int y;
		int x;

		public Point(int y, int x) {
			this.y = y;
			this.x = x;
		}
	}
}

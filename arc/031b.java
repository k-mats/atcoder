import java.util.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
		int h = 10;
		int w = 10;
		char[][] a = new char[h][w];
		char[][] org = new char[h][w];
		int[] dy = {-1, 0, 1, 0};
		int[] dx = {0, -1, 0, 1};

		for (int i = 0; i < h; i++) {
			String s = sc.next();
			for (int j = 0; j < w; j++) {
				char c = s.charAt(j);
				a[i][j] = c;
				org[i][j] = c;
			}
		}

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (a[i][j] == 'o') {
					continue;
				}

				// Fill up the start ground
				Point start = new Point(i, j);
				Stack<Point> stack = new Stack<Point>();
				stack.push(start);
				a[i][j] = '-';

				// Fill up every ground connected to the start
				while (stack.size() > 0) {
					Point p = stack.pop();
					for (int k = 0; k < dy.length; k++) {
						int ny = p.y + dy[k];
						int nx = p.x + dx[k];
						if (ny >= 0 && ny < h && nx >= 0 && nx < w && a[ny][nx] == 'o') {
							stack.push(new Point(ny, nx));
							a[ny][nx] = '-';
						}
					}
				}

				// Check if there's still unfilled ground
				boolean complete = true;
				for (int k = 0; k < h; k++) {
					for (int l = 0; l < w; l++) {
						if (a[k][l] == 'o') {
							complete = false;
							break;
						}
					}
					if (!complete) {
						break;
					}
				}

				if (!complete) {
					// Undo
					for (int k = 0; k < h; k++) {
						for (int l = 0; l < w; l++) {
							a[k][l] = org[k][l];
						}
					}
				} else {
					System.out.println("YES");
					return;
				}
			}
		}

		System.out.println("NO");
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

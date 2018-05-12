import java.util.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] c = new char[h][w];
		Deque<Point> deque = new LinkedList<Point>();
		int[] dy = {-1, 0, 1, 0};
		int[] dx = {0, -1, 0, 1};

		for (int i = 0; i < h; i++) {
			String s = sc.next();
			for (int j = 0; j < w; j++) {
				c[i][j] = s.charAt(j);
				if (c[i][j] == 's') {
					deque.push(new Point(i, j, 0));
				}
			}
		}

		while (deque.size() > 0) {
			Point p = deque.pop();

			for (int i = 0; i < dy.length; i++) {
				int ny = p.y + dy[i];
				int nx = p.x + dx[i];
				if (ny >= 0 && ny < h && nx >= 0 && nx < w) {
					if (c[ny][nx] == 'g') {
						out.println("YES");
						return;
					} else if (c[ny][nx] == '.') {
						deque.push(new Point(ny, nx, p.broken));
						c[ny][nx] = '-';
					} else if (c[ny][nx] == '#' && p.broken < 2) {
						deque.add(new Point(ny, nx, p.broken + 1));
					}
				}
			}
		}
		out.println("NO");
	}

	public static class Point {
		int y;
		int x;
		int broken;

		public Point(int y, int x, int broken) {
			this.y = y;
			this.x = x;
			this.broken = broken;
		}
	}
}

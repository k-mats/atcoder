import java.util.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
		int w = sc.nextInt();
		int sy = sc.nextInt() - 1;
		int sx = sc.nextInt() - 1;
		int gy = sc.nextInt() - 1;
		int gx = sc.nextInt() - 1;
		char[][] c = new char[h][w];
		for (int i = 0; i < h; i++) {
			String s = sc.next();
			for (int j = 0; j < w; j++) {
				c[i][j] = s.charAt(j);
			}
		}
		c[sy][sx] = '-';
		c[gy][gx] = 'g';

		Queue<Point> queue = new LinkedList<Point>();
		queue.add(new Point(sy, sx, 0));
		int[] dy = {-1, 0, 1, 0};
		int[] dx = {0, -1, 0, 1};

		while (queue.size() > 0) {
			Point p = queue.poll();
			for (int i = 0; i < dy.length; i++) {
				int ny = p.y + dy[i];
				int nx = p.x + dx[i];
				int nstep = p.step + 1;
				if (ny >= 0 && ny < h && nx >= 0 && nx < w) {
					if (c[ny][nx] == 'g') {
						out.println(nstep);
						return;
					} else if (c[ny][nx] == '.') {
						queue.add(new Point(ny, nx, nstep));
						c[ny][nx] = '-';
					}
				}
			}
		}
	}

	public static class Point {
		int y;
		int x;
		int step;

		public Point(int y, int x, int step) {
			this.y = y;
			this.x = x;
			this.step = step;
		}
	}
}

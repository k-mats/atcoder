import java.util.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		boolean[][] edges = new boolean[n][n];
		boolean[] visited = new boolean[n];

		for (int i = 0; i < m; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			edges[u-1][v-1] = true;
		}

		int cnt = 0;
		while (true) {
			Stack<Path> stack = new Stack<Path>();
			for (int i = 0; i < n; i++) {
				if (!visited[i]) {
					stack.push(new Path(i, -1));
					visited[i] = true;
					break;
				}
			}
			if (stack.size() == 0) {
				break;
			}

			boolean loop = false;
			while(stack.size() > 0) {
				Path path = stack.pop();
				for (int i = 0; i < n; i++) {
					if (edges[path.current][i] || edges[i][path.current]) {
						if (visited[i]) {
							if (path.prev == i) {
								// Previous node; just ignore
								continue;
							} else {
								// Find the loop
								loop = true;
							}
						} else {
							// Not visited yet
							stack.push(new Path(i, path.current));
							visited[i] = true;
						}
					}
				}
			}

			if (!loop) {
				cnt++;
			}
		}

		System.out.println(cnt);
	}

	public static class Path {
		int current;
		int prev;

		public Path(int current, int prev) {
			this.current = current;
			this.prev = prev;
		}
	}
}

import java.util.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			int w = sc.nextInt();
			int minIndex = Integer.MAX_VALUE;
			int minDiff = Integer.MAX_VALUE;
			for (int j = 0; j < list.size(); j++) {
				if (w <= list.get(j) && list.get(j) - w < minDiff) {
					minDiff = list.get(j) - w;
					minIndex = j;
				}
			}
			if (minIndex != Integer.MAX_VALUE) {
				list.set(minIndex, w);
			} else {
				list.add(w);
			}
		}

		out.println(list.size());
	}
}

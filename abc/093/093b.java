import java.util.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();

		for (int i = c; i <= b; i++) {
			if (i - a < k || b - i < k) {
				System.out.println(i);
			}
		}
  }
}

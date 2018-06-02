import java.util.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(in);
    int a = sc.nextInt();
		int b = sc.nextInt();

		for (int i = a; i > 0; i--) {
			if (i % b == 0) {
				System.out.println(i);
				return;
			}
		}
	}
}

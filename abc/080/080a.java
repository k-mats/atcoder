import java.util.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(in);
    int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(Math.min(n * a, b));
	}
}

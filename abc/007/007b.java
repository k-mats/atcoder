import java.util.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(in);
    String a = sc.next();

		if (a.length() == 1) {
			if (a.charAt(0) == 'a') {
				out.println("-1");
			} else {
				out.println("a");
			}
		} else {
			out.println(a.substring(0, a.length() - 1));
		}
  }
}

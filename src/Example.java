import java.util.HashSet;
import java.util.Set;

public class Example {

	public static void printSet(Set<?> s) {
		int i = 1;
		for (Object o : s) {
			System.out.println(i++ + ":" + o);
		}
	}

	public static void main(String[] args) {
		HashSet<Integer> si = new HashSet<Integer>();
		for (int i = 0; i < 10; i++) {
			si.add(i);
		}

		printSet(si);
	}
}

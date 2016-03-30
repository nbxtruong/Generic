import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Example4 {

	public static <T> T addAll(Collection<T> src, Collection<? super T> target) {
		T last = null;
		for (T t : src) {
			last = t;
			target.add(t);
		}
		return last;
	}
	
	public static void main(String [] args) {
		Set<Integer> si = new HashSet<Integer>();
		Set<Number> sn = new HashSet<Number>();
		
		for (int i = 0; i < 10; i++)
			si.add(i);
				
		Integer i = addAll(si, sn);
		System.out.println("Size of sn = " + sn.size());
	}
	
}

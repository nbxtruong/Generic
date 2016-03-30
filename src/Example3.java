import java.util.HashSet;
import java.util.Set;

public class Example3 {

	public static void printSetOfMyClass(Set<? extends MyClass> s) {
		int i = 1;
		for (MyClass o : s) {
			System.out.println(i++ + ":" + o.getInteger());
		}
	}

	public static void main(String[] args) {
		HashSet<MyClass> smc = new HashSet<MyClass>();
		for (int i = 0; i < 10; i++) {
			smc.add(new MyClass(i));
		}

		printSetOfMyClass(smc);
		
		HashSet<MySubClass> smsc = new HashSet<MySubClass>();
		for (int i = 0; i < 10; i++) {
			smsc.add(new MySubClass(i));
		}

		printSetOfMyClass(smsc);
		
		
	}
}

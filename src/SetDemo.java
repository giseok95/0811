import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<String>();
		Set<String> TreeSet = new TreeSet<String>();
	
		String []array = {"박지민","홍지민","박지민","한지민","한지민","이지민"};
		for(String str:array) {
			hashSet.add(str);
			TreeSet.add(str);
		}
		System.out.println(hashSet.size());
		System.out.println(hashSet);
		System.out.println(TreeSet);
	}
}

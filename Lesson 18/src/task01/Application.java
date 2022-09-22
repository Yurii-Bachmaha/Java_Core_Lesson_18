package task01;

import java.util.ArrayList;
import java.util.List;

public class Application {

	static List<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) {

		list.add(1);
		list.add(2);
		list.add(3);

		addToList(list);

		System.out.println(list);

	}

	/* Yes, it's possible. When using parameterization, any type of information is
	 *lost. Therefore, when compiling Integer and String is essentially one type,
	 * because they become a 'low-level' List type. 
	 */
	
	public static <T> void addToList(List<T> list) {
		list.add((T) "Java");
	}
}
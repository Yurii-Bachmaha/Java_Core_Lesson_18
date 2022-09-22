package task02;

public class Application {

	public static void main(String[] args) {
	
		Map<Integer,String> map = new Map<>(1,"Peter");
		map.addNewObject(2, "John");
		map.addNewObject(3, "Mia");
		map.addNewObject(4, "Julia");
		System.out.println("Initial map:");
		map.outputMap();
		System.out.println("\nAfter deleting an object by key:");
		map.removeObjectByKey(1);
		map.outputMap();
		System.out.println("\nAfter deleting an object by value:");
		map.removeObjectByValue("Mia");
		map.outputMap();
		System.out.println("\nSet of keys:");
		map.outputSetKeys();
		System.out.println("\nSet of values:");
		map.outputSetValues();
		System.out.println("\nFinal map:");
		map.outputMap();
	}
}
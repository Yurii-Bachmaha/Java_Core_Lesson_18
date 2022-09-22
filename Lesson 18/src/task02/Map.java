package task02;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Map<K, V> extends MyEntry<K, V> {

	private LinkedHashMap<K, V> map;

	public Map(K ob, V ob2) {
		super(ob, ob2);
		this.map = new LinkedHashMap<K, V>();
		this.map.put(ob, ob2);
	}

	public void addNewObject(K ob, V ob2) {
		map.put(ob, ob2);
	}

	public void removeObjectByKey(K ob) {
		map.remove(ob);
		System.out.println(ob + " was removed.");
	}

	public void removeObjectByValue(V ob2) {
		Iterator<Entry<K, V>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<K, V> next = iterator.next();
			if(next.getValue().equals(ob2)) {
				iterator.remove();
				System.out.println(next.getValue() + " was removed.");
			}
		}
	}

	public void outputSetKeys() {
		Iterator<Entry<K, V>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<K, V> next = iterator.next();

			System.out.println(next.getKey().toString());
		}
	}

	public void outputSetValues() {
		Iterator<Entry<K, V>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<K, V> next = iterator.next();

			System.out.println(next.getValue().toString());
		}
	}

	public void outputMap() {
		Iterator<Entry<K, V>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<K, V> next = iterator.next();

			System.out.println(next.getKey().toString() + "---->" + next.getValue().toString());
		}
	}

}
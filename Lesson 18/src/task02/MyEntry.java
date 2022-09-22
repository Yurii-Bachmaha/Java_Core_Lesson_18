package task02;

public class MyEntry<K, V> {

	private K ob;
	private V ob2;

	public MyEntry(K ob, V ob2) {
		super();
		this.ob = ob;
		this.ob2 = ob2;
	}

	public K getOb() {
		return ob;
	}

	public void setOb(K ob) {
		this.ob = ob;
	}

	public V getOb2() {
		return ob2;
	}

	public void setOb2(V ob2) {
		this.ob2 = ob2;
	}

	@Override
	public String toString() {
		return "MyEntry [ob=" + ob + ", ob2=" + ob2 + "]";
	}

}
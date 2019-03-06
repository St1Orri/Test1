

class InPair<T, U> {
	private T first;
	private U second;
	
	public InPair(T first, U second) {
		this.first = first;
		this.second = second;
	}
	
	public T getFirst() {
		return first;
	}
	
	public U getSecond() {
		return second;
	}
}

public class Test03 {
	public static void main(String[] args) {
		InPair<Integer, String> pIntStr = new InPair<Integer, String>(42,"test");
		InPair<Integer, Integer> pIntInt = new InPair<Integer, Integer>(42,-1);
	}

}

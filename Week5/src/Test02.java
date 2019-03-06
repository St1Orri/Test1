

	class Pair<T extends Comparable<T>> {
		private T first;
		private T second;
		
	public Pair(T first, T second){
		this.first = first;
		this.second = second;
	}
	public T getFirst() {
		return first;
	}
	public T getSecond() {
		return second;
	}
	
	public boolean firstIsLessThanSecond() {
		return(first.compareTo(second) <0);
	}
	
	}

	public class Test02 {
		
		public static void printIntPair(Pair<Integer> p) {
			System.out.println(p.getFirst() + " + " + p.getSecond() + " = " + (p.getFirst() + p.getSecond()));
		}
		
		public static void main(String[] args) {
			Pair<Integer> pInt = new Pair<Integer>(42,-1);
			Pair<String> pStr = new Pair<String>("test1","test2");
			printIntPair(pInt);
		}
}

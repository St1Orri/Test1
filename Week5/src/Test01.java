

	enum CardinalPoints {
		N("North"), S("South"), E("East"), W("West");
		private String extendedName;
		private CardinalPoints(String extendedName) {
			this.extendedName = extendedName;
		}
		public String toString()
		{
			return extendedName;}
		}

	
	public class Test01 {
		public static void main(String[] args) {
	//		for (CardinalPoints c : CardinalPoints.values()) {
	//			System.out.println(c);
	//		}
	//	}
			CardinalPoints c = CardinalPoints.valueOf("N");
			System.out.println(c);
		}
}

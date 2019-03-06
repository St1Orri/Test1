
public class Test05 {
	public static void main(String[] args) {
		String[] s = {"Test1","Test2","Test3"};
		int i = 0;
		
		while(i<4) {
			try {
			
				System.out.println(s[i]);
			} catch(ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
				System.out.println("Exception!");
			} finally {
				System.out.println("this is always printed");
			}
			i++;
		}
	}
}


class MyException extends Exception {
	public MyException(String message) {
		super(message);
	}
}
public class Test06 {
	public static void m(int i) throws MyException {
		if(i==0) {
			// violation of our precondition
			throw new MyException("precondition violated, i has to be different from 0");
		}
		System.out.println("I'm good");
	}
	
	public static void main(String[] args) //throws MyException
	{
		try {
			m(1);
			m(0);
		} catch(MyException e) {
			System.out.println("ops");
		}
	
	}
}

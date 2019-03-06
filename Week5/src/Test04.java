
class HasM{
	public void m() {
		System.out.println("hi");
	}
}

class HasMF extends HasM {
	public void m() { 
		System.out.println("hi again");
	}
}
class GenericType<T extends HasM>{
	public T obj;
	
	public GenericType(T obj) {
		this.obj = obj;
	}
	
	public void manipulate() {
		obj.m();
	}
}

public class Test04 {
	public static void main(String[] args) {
		GenericType<HasM> gt = new GenericType<HasM> (new HasM());
		gt.manipulate();
		GenericType<HasMF> gt2 = new GenericType<HasMF>(new HasMF());
		gt2.manipulate();
	}
}

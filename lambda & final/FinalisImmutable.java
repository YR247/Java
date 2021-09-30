package LambdaPackage;

class A{
	void anyMethod() {
		System.out.println("This is any method of class A");
	}
}


public class FinalisImmutable extends A {
	void anyMethod() {       //method overriding
		System.out.println("This is any method of finalisImmutable class ");
	}
	
	public static void main(String args[]) {
		FinalisImmutable obj = new FinalisImmutable();
		obj.anyMethod();
	}

}

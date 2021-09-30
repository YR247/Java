package LambdaPackage;

public class FinalDemo {
	final int MAXVALUE = 99;
	
	void mymethod() {
		
		System.out.println("Max value is "+ MAXVALUE);
	}
	
	public static void main(String args[]) {
		FinalDemo fd = new FinalDemo();
		fd.mymethod();
	}


}

package strings;

public class StringEqualsIgnore {
	public static void main(String args[]){  
		String s1="java";  
		String s2="java";  
		String s3="JAVA";  
		String s4="not java";  
		System.out.println(s1.equalsIgnoreCase(s2));//true because content and case both are same  
		System.out.println(s1.equalsIgnoreCase(s3));//true because case is ignored  
		System.out.println(s1.equalsIgnoreCase(s4));//false because content is not same  
		}
}

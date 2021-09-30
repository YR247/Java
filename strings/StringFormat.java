package strings;

public class StringFormat {
	public static void main(String args[]){  
		String name="yashika";  
		String s1=String.format("name is %s",name);  
		String s2=String.format("age is %f",22.2);  
		String s3=String.format("age is %32.12f",22.222);//returns 12 char fractional part filling with 0  
		  
		System.out.println(s1);  
		System.out.println(s2);  
		System.out.println(s3);  
		}
}

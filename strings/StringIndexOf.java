package strings;

public class StringIndexOf {
	public static void main(String args[]){  
		String s1="my name is yashika";  
		//passing substring  
		int index1=s1.indexOf("is");//returns the index of is substring  
		int index2=s1.indexOf("yashika");//returns the index of index substring  
		System.out.println(index1+"  "+index2); 
		  
		//passing substring with from index  
		int index3=s1.indexOf("is",4);//returns the index of is substring after 4th index  
		System.out.println(index3);  
		  
		//passing char value  
		int index4=s1.indexOf('s');//returns the index of s char value  
		System.out.println(index4);
		}
}

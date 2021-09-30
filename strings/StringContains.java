package strings;

class StringContains{  
	public static void main(String args[]){  
		String name="hey , how are you? ";  
		System.out.println(name.contains(","));     //true condition
		System.out.println(name.contains("how"));    //true condition
		System.out.println(name.contains("hello"));  //false condition
	}
}
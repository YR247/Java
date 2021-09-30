package LambdaPackage;

interface Sayable {
	 
    String Say();
 
}
 
public class LambdaNoParameter {
 
    public static void main(String[] args) {
        Sayable s = () -> {
 
            return "No parameter in lambda";
        };
 
        System.out.println(s.Say());
 
    }
 
}
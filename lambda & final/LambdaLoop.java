package LambdaPackage;

import java.util.ArrayList;
import java.util.List;

public class LambdaLoop {
 
    public static void main(String[] args) {
        List<String> listname = new ArrayList<String>();
 
        listname.add("1");
        listname.add("2");
        listname.add("3");
        listname.add("4");
 
        listname.forEach((n) -> System.out.println(n));       //lambda loop
 
    }
 
}
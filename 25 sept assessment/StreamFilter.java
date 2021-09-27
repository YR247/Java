package exception;

import java.util.ArrayList;
import java.util.List;
 
import exception.StreamEmployee;
 
public class StreamFilter {
 
    public static void main(String a[]) {
 
        List<StreamEmployee> empList = new ArrayList<>();
        empList.add(new StreamEmployee("Ramesh", "Pune", 8000));
        empList.add(new StreamEmployee("Suresh", "Delhi", 15000));
        empList.add(new StreamEmployee("Yogesh", "Pune", 2500));
        empList.add(new StreamEmployee("Balkesh", "Pune", 12500));
 
        // find employees whose job location is pune
        empList.stream().filter(emp->emp.getLocation() == "Pune").forEach(System.out::println);
    }
}

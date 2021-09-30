package WeeklySubjectiveAssessment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentMarks {

	public static void main(String args[]) {
		
		int totalStudents;
		int i;
		
		Scanner studentInput=new Scanner(System.in);   //input
		
		System.out.println("Enter number of Students: ");
		totalStudents=studentInput.nextInt(); 
		
		//Loop for taking students marks input
		System.out.println("Enter Marks: ");
		
		List<Integer> marksList=new ArrayList<Integer>();  //creating array list
		for(i=0;i<totalStudents;i++) {
		    
			marksList.add(studentInput.nextInt());   //Storing marks into array list
		}
		
		System.out.println("Highest marks : "+Collections.max(marksList));
		float avg = 0;
        for(i=0;i<totalStudents;i++) {
        	
        	avg=avg+marksList.get(i);
        }
		System.out.println("Average Marks : "+(avg/totalStudents));
		
		for(i=0;i<totalStudents;i++) {
			System.out.print((i+1)+"-"+marksList.get(i)+" ");
		}
		
		System.out.println("\n3rd Student marks : "+marksList.get(2));
		
		System.out.print("Sorted : ");
		Collections.sort(marksList);
		Iterator<Integer> itr=marksList.iterator();
		
		int flag=1;
		while(itr.hasNext()) {
			System.out.print(flag+"-"+itr.next()+" ");
			flag=flag+1;
		}
	}
}
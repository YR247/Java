package WeeklySubjectiveAssessment;

import java.util.LinkedHashSet;
import java.util.Set;

class PatientDetails{
	
    int patientId;
	String name;
	int age;
	
	//Parameterized constructor
	public PatientDetails(int patientId,String name,int age) {
		this.patientId=patientId;
		this.name=name;
		this.age=age;
	}

	//Getters / Setters
	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

public class Patient {

	public static void main(String args[]) {
		
		Set<PatientDetails> patientset=new LinkedHashSet<PatientDetails>();  //hashset
		
		patientset.add(new PatientDetails(1, "P1", 33));    //adding details
		patientset.add(new PatientDetails(2, "P2", 24));
		patientset.add(new PatientDetails(2, "P2", 24));		
		
		System.out.println("Set Size: "+patientset.size());
		
		for(PatientDetails patient:patientset) {
			System.out.println("Id : "+patient.getPatientId()+" Patient Name : "+patient.getName()+" , Patient age : "+patient.getAge());
		}
		
	}
}
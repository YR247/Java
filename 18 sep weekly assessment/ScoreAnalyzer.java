package WeeklySubjectiveAssessment;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class ScoreAnalyzer{
	
	private int runs;
	
	public ScoreAnalysis() {
		super();
	}
	
	public ScoreAnalysis(int runsData) {
		super();
		this.runs=runsData;
	}
	
	List<Integer> runlist=new LinkedList<Integer>();         //creating list 
	
	public void addRunsToList(int runsData){
		runlist.add(runsData);                     // adding in list
	}
	
	public float RunRate() {
		float runRate=0;
		for(int i=0;i<5;i++) {
			runRate=runRate+runlist.get(i);
		}
		return (runRate/50);
	}
	
	
	public int LeastRuns() {
		int lowestrun=Collections.min(runlist);
		return lowestrun;
	}
	
	//Display all runs
	public void displayRuns() {
		int i=1;
		for(Integer run:runlist){
			System.out.print(i+"-"+run+" ");
			i=i+1;
		}
	}
	
	//Getter and Setter
	public int getRunsData() {
		return runs;
	}
	public void setRunsData(int runsData) {
		this.runs = runsData;
	}
}
public class ScoreAnalyzer {
	
	public static void main(String args[]) {
		
		int i;
		ScoreAnalysis analyzer=new ScoreAnalysis();
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter Runs: \n");
		
		for(i=0;i<5;i++) {
			int runInputByPlayer=input.nextInt();
			analyzer.addRunsToList(runInputByPlayer);
		}
		
		analyzer.displayRuns();
		System.out.println("Runrate : "+analyzer.RunRate()+"\n");
		System.out.println("Lowest Runs : "+(analyzer.lowestRunsScored())+"\n");
		System.out.println("Count of player who batted : "+analyzer.runlist.size()+"\n");
		
		
	}
	
}
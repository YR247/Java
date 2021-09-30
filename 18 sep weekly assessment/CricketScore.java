package WeeklySubjectiveAssessment;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class CricketScore {

	public static void main(String args[]) {
		
		Map<String,Integer> Player_Score=new HashMap<String,Integer>(); //Hashmap
		Scanner input=new Scanner(System.in);           //input
		System.out.println("Enter runs: ");
		for(int i=0;i<5;i++) {
			String Player_Run[] = input.next().split(" - ");
			String name = Player_Run[0];
			int run = Integer.parseInt(Player_Run[1]);
			Player_Score.put(name, run);
		}
		
		System.out.println("Players who batted ");
		Iterator<String> itr=Player_Score.keySet().iterator();      //first iteration
		
		while(itr.hasNext()) {
			String name=itr.next();
			Integer run=Player_Score.get(name);
		    System.out.println(name);
		}
		
		int run_By_Dhoni = 0;
		int total = 0;
		System.out.println("Scores by Players: ");
		
		Iterator<String> iterator=Player_Score.keySet().iterator();   //second iteration
		
		while(iterator.hasNext()) {
			String name = iterator.next();
			Integer run = Player_Score.get(name);
			System.out.println(name+" : "+run);
		    total = total + run;
		    if(name.equalsIgnoreCase("Dhoni")) {
		    	run_By_Dhoni=run;
		    }
		}
		
		System.out.println("Total Score : "+ total);
		
		int maxRun=Collections.max(Player_Score.values());
		
		Iterator<String> it=Player_Score.keySet().iterator();    //third iteration
		
		while(it.hasNext()) {
			String name = it.next();
			Integer run = Player_Score.get(name);
		    if(run == maxRun) {
		    	System.out.println("Name of Highest Scorer: "+name);
		    }
		}
	
		System.out.println("Runs Scored by Dhoni: "+run_By_Dhoni);   
		
	}
}
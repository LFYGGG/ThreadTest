package com.exam;

import java.util.ArrayList;
import java.util.List;

public class Match {
	
	Object ball = new Object();
	int id = 1; 
	List<Player> teamA;
	List<Player> teamB;
	Timer time;
	static Match ms = new Match();
		
	public static Match getMs() {
		return ms;
	}

	private Match () {
		time = new Timer();
		Player demoPlayer = new Player(-1, "test", time, ball); 
		//List<Player> teamA = new ArrayList<>();
		//List<Player> teamB = new ArrayList<>(); 
		teamA = new ArrayList<>();
		teamB = new ArrayList<>();
		String[] aName = {"a1", "a2", "a3"};
		String[] bName = {"b1", "b2", "b3"};
		
		for (int i = 0; i < 3; i++) {
			Player newPlayer = demoPlayer.clone();
			newPlayer.id = i;
			newPlayer.name = aName[i];	
			teamA.add(newPlayer); 
			
			newPlayer = demoPlayer.clone();
			newPlayer.id = i + 3;
			newPlayer.name = bName[i];	
			teamB.add(newPlayer);
		} 
		
	}
	
	public void startMatch() {
		
		// start timer, players
		//Timer t = new Timer();
		new Thread(time).start(); 
		for (int i = 0; i < 3; i++) {
			new Thread(teamA.get(i)).start();		
			new Thread(teamB.get(i)).start();		
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Match a = Match.getMs();
		a.startMatch();
				
	}

}

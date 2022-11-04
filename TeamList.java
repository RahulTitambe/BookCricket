package cricketGame;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.Scanner;

public class TeamList {
	
	Scanner sc =new Scanner(System.in);
//	Inning first = new Inning();
	ScoreCardData scoredata = new ScoreCardData();
	
	
	//Code for Adding Team 1 Players
	void addPlayersTeam1() {
		ArrayList<String> team1 = new ArrayList<>();
		for(int i=1; i<=10; i++) {
			System.out.print("Enter Name ");
			String playerName=sc.nextLine();
			team1.add(playerName);
			}
	
		}
	
	//All Players List
	void allPlayers() {
		ArrayList<String> allPlayers = new ArrayList<>();	
	}
	
	
	//Default List of Team 1 Players
	ArrayList<String> team1Default = new ArrayList<>();
	int index = 0;
	String team1Default(int index) {
		team1Default.add("Shashank");
		team1Default.add("Akshay");
		team1Default.add("Deepak");
		team1Default.add("Mrunali");
		team1Default.add("Pooja P");
		team1Default.add("Shreya");
		team1Default.add("Balasaheb");
		team1Default.add("Rahul");
		team1Default.add("Yogesh");
		team1Default.add("Rushikesh");
		String names= team1Default.get(index);
		return names;
		
	}
	
	
	//Code for Adding Team 1 Players
	void addPlayersTeam2() {
		ArrayList<String> team2 = new ArrayList<>();
		for(int i=1; i<=10; i++) {
			System.out.print("Enter Name ");
			String playerName=sc.nextLine();
			team2.add(playerName);
			}
		}
	
	
	//Default List of Team 2 Players
	ArrayList<String> team2Default = new ArrayList<>();
	String team2Default(int index) {
		team2Default.add("Meher");
		team2Default.add("Neha");
		team2Default.add("Pooja M");
		team2Default.add("Rohit");
		team2Default.add("Yadav ");
		team2Default.add("Bumrah");
		team2Default.add("Hardik");
		team2Default.add("Dhoni");
		team2Default.add("Sachin");
		team2Default.add("Kohli");
		String names= team2Default.get(index);
		return names;
		
		}
	
	
	HashMap<String, Integer> teamOne= new HashMap <String, Integer>();
	HashMap<String, Integer> teamOneList(int ind, int run) {
		
		team1Default.add("Shashank");
		team1Default.add("Akshay");
		team1Default.add("Deepak");
		team1Default.add("Mrunali");
		team1Default.add("Pooja P");
		team1Default.add("Shreya");
		team1Default.add("Balasaheb");
		team1Default.add("Rahul");
		team1Default.add("Yogesh");
		team1Default.add("Rushikesh");
		
		teamOne.put(team1Default.get(ind),run);
		
		return teamOne;
		
	}
	
	
}
	


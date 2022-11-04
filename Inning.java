package cricketGame;



public class Inning {
	Score score = new Score();
	ScoreCardData scoredata = new ScoreCardData();
	RunRate runRate= new RunRate();
	OverCount overCount= new OverCount();
	RunRate runrate= new RunRate();
	TeamList teamlist= new TeamList();
	
	//Game Play Function
	ScoreCardData inning() {
				
				
				scoredata.setRun(score.runGenerator()); //Calling function from Score Class to generate Random Run
				
				scoredata.setisLegal(score.IsLegal1(scoredata.getRun())); //Calling function from Score Class to generate Random if ball is Legal or not
				
				scoredata.setTarget(scoredata.getTarget());
				
				//Checks Condition and displays the team players on score card
				if(scoredata.getTeamName().equals("I")) {
					scoredata.setPlayerName(teamlist.team1Default(scoredata.getBatsManId()));
				}
				
				//Checks Condition and displays the team players on score card
				else if(scoredata.getTeamName().equals("E")) {
					scoredata.setPlayerName(teamlist.team2Default(scoredata.getBatsManId()));
				}
					
					//this will execute if the ball is Legal
					if(scoredata.isLegal) { 
						scoredata.setBallCount(scoredata.getBallCount()+1);
						
						if(scoredata.getInningType()==2) {
							scoredata.setRemainingBall(scoredata.getRemainingBall()-1);
						}
						
						if(scoredata.getRun()==0) {

							scoredata.setWicketCount(scoredata.getWicketCount()+1);
							scoredata.setBatsManId(scoredata.getBatsManId()+1);
							scoredata.setBatsManRun(0);
							scoredata.setTotalScore(scoredata.getTotalScore()+scoredata.getRun());
							scoredata.setComcommentary(score.ShowComentry(scoredata.getRun())); //calling commentary function from Score Class
						}
						  else if(scoredata.getRun()==4) {
						
							scoredata.setBatsManRun(scoredata.getBatsManRun()+scoredata.getRun());
							scoredata.setTotalScore(scoredata.getTotalScore()+scoredata.getRun());  
							scoredata.setComcommentary(score.ShowComentry(scoredata.getRun()));  //calling commentary function from Score Class

						  } 
						  else if(scoredata.getRun()==6) {
						   
						   scoredata.setBatsManRun(scoredata.getBatsManRun()+scoredata.getRun());
						   scoredata.setTotalScore(scoredata.getTotalScore()+scoredata.getRun());  
						   scoredata.setComcommentary(score.ShowComentry(scoredata.getRun())); //calling commentary function from Score Class
						 
						  } 
						  else if(scoredata.getRun()==5) 
						  {
						   scoredata.setTotalScore(scoredata.getTotalScore()+1); 
						   scoredata.setComcommentary(score.ShowComentry(scoredata.getRun())); //calling commentary function from Score Class
					 
						  }
						  else {
							scoredata.setTotalScore(scoredata.getTotalScore()+scoredata.getRun());
							scoredata.setBatsManRun(scoredata.getBatsManRun()+scoredata.getRun());
							scoredata.setComcommentary(score.ShowComentry(scoredata.getRun())); //calling commentary function from Score Class
							}
						
							
						  } 
						
					//this will execute if the ball is not Legal
						else 
						{ 
						  scoredata.setTotalScore(scoredata.getTotalScore()+1);
						  scoredata.setComcommentary(score.ShowComentry(scoredata.getRun())); //calling commentary function from Score Class
						  
						}
					
					
					//calling CurrentRunRate function from RunRate Class
					scoredata.setCurrentRunRate(runRate.currentRunRate(scoredata.getTotalScore(), scoredata.getBallCount()));
					
					//calling tOver function from OverCount Class to Calculate total Overs
					scoredata.setTotalovers(overCount.tOver(scoredata.getBallCount()));
					

						
			return scoredata;	//Returning Complete ScoreCard Data 
}
	


	
	
}



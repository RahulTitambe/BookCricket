package cricketGame;

public class MainGamePlay{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScoreCardData scoredata= new ScoreCardData();
		Inning first = new Inning();
		
				//Choose Which team to play First
		 		first.scoredata.setTeamName("I");
				
				//condition for game play 
				while(first.scoredata.getBallCount()<30 && first.scoredata.getWicketCount()<10 ) {
					first.inning();
					System.out.println(first.scoredata.getComcommentary()+" Score="+first.scoredata.getTotalScore()+" wicketCount="+first.scoredata.getWicketCount()+" Runrate="+first.scoredata.getCurrentRunRate()+
							" Over="+first.scoredata.totalovers+
							" "+first.scoredata.getPlayerName()+" " +first.scoredata.getBatsManRun());
								
								System.out.println();
		
				}
				

				//Set target for 2nd Inning 
				scoredata.setTarget(first.scoredata.getTotalScore()+1);
		
				System.out.println("end");
			
				System.out.println("Target For 2nd Inning Team is "+scoredata.getTarget());
				
				//Reset Score card 
				first.scoredata.setBallCount(0); 
				first.scoredata.setWicketCount(0);
				first.scoredata.setTotalScore(0);
				first.scoredata.setTotalovers(0);
				first.scoredata.setBatsManId(0);
				first.scoredata.setBatsManRun(0);
				first.scoredata.setInningType(2);
				first.scoredata.setRemainingBall(30);
				
				if(first.scoredata.getTeamName().equals("I")) {
					first.scoredata.setTeamName("E");
				}
				
				while(first.scoredata.getBallCount()<30 && first.scoredata.getWicketCount()<10 &&first.scoredata.getTotalScore()<=scoredata.getTarget()) {
					
					// Calling Function from Inning Class
					first.inning();
				
					// Score Card Display
					System.out.println(first.scoredata.getComcommentary()+" Score="+first.scoredata.getTotalScore()+" wicketCount="+first.scoredata.getWicketCount()+" Runrate="+first.scoredata.getCurrentRunRate()+
							" Over="+first.scoredata.totalovers+
							" "+first.scoredata.getPlayerName()+" " +first.scoredata.getBatsManRun()+
							" ballCount="+first.scoredata.getBallCount());
					
					System.out.println();
					
					// Conditions and Result if team has won or loose
					if(first.scoredata.getTotalScore()<scoredata.getTarget()-1 && first.scoredata.getBallCount()==30 || first.scoredata.getWicketCount()==10) {
						System.out.println("Result");
						System.out.println("1st Inning Team won the  match");
						System.out.println("Target was "+scoredata.getTarget() +" and 2nd Inning Team Scored "+first.scoredata.getTotalScore());
						break;
					}
					
					else if(first.scoredata.getTotalScore()==scoredata.getTarget()-1 && first.scoredata.getBallCount()>=30 || first.scoredata.getWicketCount()==10) {
						System.out.println("Result");
						System.out.println("Its a Tie");
						System.out.println("Target was "+scoredata.getTarget() +" and 2nd Inning Team Scored "+first.scoredata.getTotalScore());
						break;
					}
					

					else if (first.scoredata.getTotalScore()>=scoredata.getTarget()){
						System.out.println("Result");
						System.out.println("2nd Inning Team Won");
						System.out.println("Target was "+scoredata.getTarget() +" and 2nd Inning Team Scored "+first.scoredata.getTotalScore());
						break;
					}
					
					
					
				}
			}
		
	}



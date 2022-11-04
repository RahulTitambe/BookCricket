package cricketGame;

import java.util.HashMap;

public class ScoreCardData {
	
	int ballCount,run,totalScore,wicketCount,batsManId,batsManRun,ballerId,eachBallCount,target,inningType, remainingBall,remainingScore;
	float totalovers,currentRunRate,reqRunRate;
	
	HashMap <String, Integer> batsManCard =  new HashMap<String, Integer>();
	
	public HashMap<String, Integer> getBatsManCard() {
		return batsManCard;
	}


	public void setBatsManCard(HashMap<String, Integer> batsManCard) {
		this.batsManCard = batsManCard;
	}




	public int getRemainingScore() {
		return remainingScore;
	}




	public void setRemainingScore(int remainingScore) {
		this.remainingScore = remainingScore;
	}




	public float getReqRunRate() {
		return reqRunRate;
	}




	public void setReqRunRate(float reqRunRate) {
		this.reqRunRate = reqRunRate;
	}




	String comcommentary,playerName,teamName;
	
	
	
	public int getRemainingBall() {
		return remainingBall;
	}




	public void setRemainingBall(int remainingBall) {
		this.remainingBall = remainingBall;
	}




	public int getInningType() {
		return inningType;
	}




	public void setInningType(int inningType) {
		this.inningType = inningType;
	}




	public int getTarget() {
		return target;
	}




	public void setTarget(int target) {
		this.target = target;
	}





	
	
	public String getTeamName() {
		return teamName;
	}




	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}




	boolean isLegal;
	
	
	

	public int getBallCount() {
		return ballCount;
	}




	public void setBallCount(int ballCount) {
		this.ballCount = ballCount;
	}




	public int getRun() {
		return run;
	}




	public void setRun(int run) {
		this.run = run;
	}



	public int getTotalScore() {
		return totalScore;
	}




	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}




	public int getWicketCount() {
		return wicketCount;
	}




	public void setWicketCount(int wicketCount) {
		this.wicketCount = wicketCount;
	}




	public int getBatsManId() {
		return batsManId;
	}




	public void setBatsManId(int batsManId) {
		this.batsManId = batsManId;
	}




	public int getBatsManRun() {
		return batsManRun;
	}




	public void setBatsManRun(int batsManRun) {
		this.batsManRun = batsManRun;
	}




	public int getBallerId() {
		return ballerId;
	}




	public void setBallerId(int ballerId) {
		this.ballerId = ballerId;
	}




	public int getEachBallCount() {
		return eachBallCount;
	}




	public void setEachBallCount(int eachBallCount) {
		this.eachBallCount = eachBallCount;
	}


	public float getTotalovers() {
		return totalovers;
	}




	public void setTotalovers(float totalovers) {
		this.totalovers = totalovers;
	}




	public float getCurrentRunRate() {
		return currentRunRate;
	}




	public void setCurrentRunRate(float currentRunRate) {
		this.currentRunRate = currentRunRate;
	}


	public String getComcommentary() {
		return comcommentary;
	}




	public void setComcommentary(String comcommentary) {
		this.comcommentary = comcommentary;
	}




	public String getPlayerName() {
		return playerName;
	}




	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}




	public boolean isLegal() {
		return isLegal;
	}




	public void setisLegal(boolean isLegal) {
		this.isLegal = isLegal;
	}


	




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

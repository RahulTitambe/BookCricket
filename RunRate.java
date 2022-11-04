package cricketGame;

public class RunRate {
	
	
	float currentRunRate(float score,int ballCount) {
		float runRate=((score/ballCount)*6);
		return runRate;
	}
	
	float requiredRunRate(int remainingRun, int remainingBalls) {
		float rRunrate=(remainingRun/remainingBalls)*6;
			return  rRunrate;
		}
}

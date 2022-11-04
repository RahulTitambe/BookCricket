package cricketGame;

public class OverCount {
	ScoreCardData scoredata = new ScoreCardData();

	
//	int eachBallCount=0;
//	float dec,totalover;
	
//	float tOver(int eachBallCount, float dec,int ballCount, float totalOver ) {
//		while(eachBallCount<ballCount) {
//			eachBallCount++;
//			dec= (float) (dec+0.1);
//			dec= (float) (dec+0.1);
//			
//			
//			if(dec==0.6) {
//				dec= (float) 0.0;
//				totalOver++;
//				System.out.println(totalOver);
//			}
//		}
//			
//		return  totalOver;
//	}
	
//	float tOver(int eachBallCount, float dec, int ballCount, float totalOver) {
//		
//		while(eachBallCount<ballCount) {
//				eachBallCount++;	
//				dec=dec+0.1f;
//				totalOver=totalOver+0.1f;
//			
//			if(dec==0.6f) {
//				dec=0.0f;
//				totalOver++;
//			}
//		}
//		return totalOver;
//		
//	}
	
	float numberOfOvers;
	String round;
	String mod;

	public float tOver(int ball) {

	    round = String.valueOf(Math.round(ball / 6));
	    mod=String.valueOf(ball%6);
	    numberOfOvers=Float.valueOf(round+"."+mod);

	    return numberOfOvers;

	}
}

/***************************************************************




****************************************************************/

package hangman.model;

public class PowerScore implements GameScore{

	/**
	*@pre integer correctCount must be positive.
	*@pre integer incorrectCount must be negative.
	*@pre score must start with a value in 0.
	*@pos score must be minimum 0.
	*@pos score must be maximum 500.
	*@param correctCount, Integer that describes correct answers.
	*@param incorrectCorrect, Integer that describes incorrect answers.
	*@retun score, Integer with the score.
	*@throws ExceptionInvalidParamaters
	*/
	public int calculateScore(int correctCount, int incorrectCount)throws ExceptionInvalidParameters {
		int score = 0;
		if (correctCount>=0 && incorrectCount<=0){
			if (correctCount == GameModel.getWordLength()){
				for(int i=0; i<correctCount; i++){
					score+=Math.pow(5,i)+score;	
				}
			}
			else{
				return 0;
			}
			return score + (incorrectCount*8);
		}
		else {
			throw new ExceptionInvalidParameters("Invalid Parameter");
		}
	}


}

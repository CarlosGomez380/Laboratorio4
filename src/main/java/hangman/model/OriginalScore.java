/***************************************************************




****************************************************************/

package hangman.model;

public class OriginalScore implements GameScore{

	/**
	*@pre integer correctCount must be positive.
	*@pre integer incorrectCount must be negative.
	*@pre score must start with a value in 100.
	*@pos integer score must be minimum 0.
	*@param correctCount, Integer that describes correct answers.
	*@param incorrectCorrect, Integer that describes incorrect answers.
	*@retun score, Integer with the score.
	*@throws ExceptionInvalidParamaters
	*/
	public int calculateScore(int correctCount, int incorrectCount) throws ExceptionInvalidParameters{
		int score= 100;
		if (correctCount>=0 && incorrectCount<=0){
			int answ = score + (incorrectCount * 10);
			if (answ < 0){
				return 0;
			}
			else{
				return answ;
			}
		}
		else{
            		throw new ExceptionInvalidParameters("Invalid Parameter");
		}
	}

}

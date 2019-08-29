/***************************************************************




****************************************************************/

package hangman.model;

public class BonusScore implements GameScore{

	/**
	*@pre integer correctCount must be positive.
	*@pre integer incorrectCount must be negative.
	*@pre score must start with a value in 0.
	*@pos integer score must be minimum 0.
	*@param correctCount, Integer that describes correct answers.
	*@param incorrectCorrect, Integer that describes incorrect answers.
	*@retun score, Integer with the score.
	*@throws ExceptionInvalidParamaters
	*/
	public int calulateScore(int correctCount, int incorrectCount){
		return 0;
	}


}


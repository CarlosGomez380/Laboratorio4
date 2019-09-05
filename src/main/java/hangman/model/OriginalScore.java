/***************************************************************




****************************************************************/

package hangman.model;

import java.util.ArrayList;


public class OriginalScore implements GameScore{

	/**
     
	*@pre integer correctCount must be positive.
	*@pre integer incorrectCount must be negative.
	*@pre score must start with a value in 100.
	*@pos integer score must be minimum 0.
	*@param correctCount, Integer that describes correct answers.
	*@param incorrectCount, Integer that describes incorrect answers.
        *@param positions a list with positions.
	*@return score, Integer with the score.
	*@throws ExceptionInvalidParameters
	*/
        @Override
	public int calculateScore(int correctCount, int incorrectCount, ArrayList<Integer> positions) throws ExceptionInvalidParameters{
            int score=100;
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

        @Override
        public int getScore(){
            return 100;
        }
}

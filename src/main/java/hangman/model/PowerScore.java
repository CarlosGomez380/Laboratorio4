/***************************************************************




****************************************************************/

package hangman.model;

import java.util.ArrayList;


public class PowerScore implements GameScore{
        private ArrayList<Integer> positionsSaved = new ArrayList<Integer> ();
	/**
                 
	*@pre integer correctCount must be positive.
	*@pre integer incorrectCount must be negative.
	*@pre score must start with a value in 0.
	*@pos score must be minimum 0.
	*@pos score must be maximum 500.
	*@param correctCount, Integer that describes correct answers.
	*@param incorrectCount, Integer that describes incorrect answers.
        *@param positions a list with positions.
        *@param score the score so far.
        *@return score, Integer with the score.
	*@throws hangman.model.ExceptionInvalidParameters
	*/
        @Override
	public int calculateScore(int correctCount, int incorrectCount, ArrayList<Integer> positions)throws ExceptionInvalidParameters {
                int value;
                int score=0;
		if (correctCount>=0 && incorrectCount<=0){
			for (int i=0; i<positions.size(); i++){
                                positionsSaved.add(positions.get(i));
			}
                        for (int i=0; i<positionsSaved.size(); i++){
				value=(int) Math.pow(5,positionsSaved.get(i));
                                score= score + value;
			}
			score= score + incorrectCount*8;
                        if (score <0) {
                            return 0;
                        }
                        else if(score>500){
                            return 500;
                        }
                        else{
                            return score;
                        }
		}
		else {
			throw new ExceptionInvalidParameters("Invalid Parameter");
		}
	}
        
        @Override
        public int getScore(){
	    positionsSaved = new ArrayList<Integer> ();
            return 0;
        }


}

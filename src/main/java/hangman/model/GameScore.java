/***************************************************************




****************************************************************/

package hangman.model;

import java.util.ArrayList;


public interface GameScore {

	public int calculateScore (int correctCount, int incorrectCount, ArrayList<Integer> positions) throws ExceptionInvalidParameters;
        public int getScore();
}



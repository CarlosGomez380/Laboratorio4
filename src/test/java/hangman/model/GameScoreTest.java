package hangman.model;

import java.util.ArrayList;
import org.junit.Test;
import org.junit.Assert;

public class GameScoreTest{
    ArrayList<Integer> positions;
	
	@Test
	public void exceptionInvalidParamterOriginalScoreTest1() throws ExceptionInvalidParameters{
		OriginalScore os = new OriginalScore();
		try{
			os.calculateScore(-1,-3254,positions);
			Assert.fail();
		}
		catch(ExceptionInvalidParameters e){
			Assert.assertTrue(true);
		}
	}

	/**
	* incorrectCount >0
	*/
	@Test
	public void exceptionInvalidParamterOriginalScoreTest2() throws ExceptionInvalidParameters{
		OriginalScore os = new OriginalScore();
		try{
			os.calculateScore(2,23, positions);
			Assert.fail();
		}
		catch(ExceptionInvalidParameters e){
			Assert.assertTrue(true);
		}
	}

	/**
	* incorrectCount <=0
	*/
	@Test
	public void OriginalScoreTest2() throws ExceptionInvalidParameters{
		OriginalScore os = new OriginalScore();
		Assert.assertEquals(100,os.calculateScore(30,0,positions),0);
	}

	/**
	* correctCount >=0
	*/
	@Test
	public void bonusScoreTest1() throws ExceptionInvalidParameters{
		BonusScore os = new BonusScore ();
		Assert.assertEquals(0,os.calculateScore(0,-354,positions),0);
	}

	/**
	* correctCount <0
	*/
	@Test
	public void exceptionInvalidParamterBonusScoreTest1() throws ExceptionInvalidParameters{
		BonusScore os = new BonusScore ();
		try{
			os.calculateScore(-1,-3254,positions);
			Assert.fail();
		}
		catch(ExceptionInvalidParameters e){
			Assert.assertTrue(true);
		}
	}

	/**
	* incorrectCount >0
	*/
	@Test
	public void exceptionInvalidParamterBonusScoreTest2() throws ExceptionInvalidParameters{
		BonusScore os = new BonusScore ();
		try{
			os.calculateScore(2,23,positions);
			Assert.fail();
		}
		catch(ExceptionInvalidParameters e){
			Assert.assertTrue(true);
		}
	}

	/**
	* incorrectCount <=0
	*/
	@Test
	public void bonusScoreTest2() throws ExceptionInvalidParameters{
		BonusScore os = new BonusScore ();
		Assert.assertEquals(300,os.calculateScore(30,0,positions),0);
	}
	
	/**
	* correctCount >=0
	
	@Test
	public void powerScoreTest1() throws ExceptionInvalidParameters{
		PowerScore os = new PowerScore();
		GameModel game= new GameModel();
		Assert.assertEquals(0,os.calculateScore(0,-3254,positions),0);
	}
        */

	/**
	* correctCount <0
	*/
	@Test
	public void exceptionInvalidParamterPowerScoreTest1() throws ExceptionInvalidParameters{
		PowerScore os = new PowerScore();
		try{
			os.calculateScore(-1,-3254,positions);
			Assert.fail();
		}
		catch(ExceptionInvalidParameters e){
			Assert.assertTrue(true);
		}
	}

	/**
	* incorrectCount >0
	*/
	@Test
	public void exceptionInvalidParamterPowerScoreTest2() throws ExceptionInvalidParameters{
		PowerScore os = new PowerScore();
		try{
			os.calculateScore(2,23,positions);
			Assert.fail();
		}
		catch(ExceptionInvalidParameters e){
			Assert.assertTrue(true);
		}
	}

	/**
	* incorrectCount <=0
	*/
	@Test
	public void powerScoreTest2() throws ExceptionInvalidParameters{
		OriginalScore os = new OriginalScore();
		Assert.assertEquals(100,os.calculateScore(30,0,positions),0);
	}	

}

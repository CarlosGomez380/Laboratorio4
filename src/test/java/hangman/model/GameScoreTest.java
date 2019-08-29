package hangman.model;

import org.junit.Test;
import org.junit.Assert;

public class GameScoreTest(){


	/**
	* correctCount >=0
	*/
	@Test
	public void originalScoreTest1(){
		int score=100;
		OriginalScore os = new OriginalScore();
		Assert.assertEquals(0,os.calculateScore(0,-3254),0);
	}

	/**
	* correctCount <0
	*/
	@Test
	public void exceptionInvalidParamterOriginalScoreTest1(){
		int score=100;
		OriginalScore os = new OriginalScore();
		try{
			os.calculateScore(-1,-3254);
			Assert.fail();
		}
		catch(ExceptionInvalidParameter e){
			Assert.assertTrue(true);
		}
	}

	/**
	* incorrectCount >0
	*/
	@Test
	public void exceptionInvalidParamterOriginalScoreTest2(){
		int score=100;
		OriginalScore os = new OriginalScore();
		try{
			os.calculateScore(2,23);
			Assert.fail();
		}
		catch(ExceptionInvalidParameter e){
			Assert.assertTrue(true);
		}
	}

	/**
	* incorrectCount <=0
	*/
	@Test
	public void OriginalScoreTest2(){
		int score=100;
		OriginalScore os = new OriginalScore();
		Assert.assertEquals(0,os.calculateScore(30,0),0);
	}

	/**
	* correctCount >=0
	*/
	@Test
	public void bonusScoreTest1(){
		int score=0;
		OriginalScore os = new OriginalScore();
		Assert.assertEquals(0,os.calculateScore(0,-3254),0);
	}

	/**
	* correctCount <0
	*/
	@Test
	public void exceptionInvalidParamterBonusScoreTest1(){
		int score=0;
		OriginalScore os = new OriginalScore();
		try{
			os.calculateScore(-1,-3254);
			Assert.fail();
		}
		catch(ExceptionInvalidParameter e){
			Assert.assertTrue(true);
		}
	}

	/**
	* incorrectCount >0
	*/
	@Test
	public void exceptionInvalidParamterBonusScoreTest2(){
		int score=0;
		OriginalScore os = new OriginalScore();
		try{
			os.calculateScore(2,23);
			Assert.fail();
		}
		catch(ExceptionInvalidParameter e){
			Assert.assertTrue(true);
		}
	}

	/**
	* incorrectCount <=0
	*/
	@Test
	public void bonusScoreTest2(){
		int score=0;
		OriginalScore os = new OriginalScore();
		Assert.assertEquals(0,os.calculateScore(30,0),0);
	}
	
	/**
	* correctCount >=0
	*/
	@Test
	public void powerScoreTest1(){
		int score=0;
		OriginalScore os = new OriginalScore();
		Assert.assertEquals(0,os.calculateScore(0,-3254),0);
	}

	/**
	* correctCount <0
	*/
	@Test
	public void exceptionInvalidParamterPowerScoreTest1(){
		int score=0;
		OriginalScore os = new OriginalScore();
		try{
			os.calculateScore(-1,-3254);
			Assert.fail();
		}
		catch(ExceptionInvalidParameter e){
			Assert.assertTrue(true);
		}
	}

	/**
	* incorrectCount >0
	*/
	@Test
	public void exceptionInvalidParamterPowerScoreTest2(){
		int score=0;
		OriginalScore os = new OriginalScore();
		try{
			os.calculateScore(2,23);
			Assert.fail();
		}
		catch(ExceptionInvalidParameter e){
			Assert.assertTrue(true);
		}
	}

	/**
	* incorrectCount <=0
	*/
	@Test
	public void powerScoreTest2(){
		int score=0;
		OriginalScore os = new OriginalScore();
		Assert.assertEquals(0,os.calculateScore(30,0),0);
	}

}

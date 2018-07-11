package edu.westga.cs6910.pig.testing.advancedStrategy;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.strategies.AdvancedStrategy;

/**
 * Test cases for advancedStrategyRollAgain
 * 
 * @author Siddhartha Gupta
 * @version 7/10/2018
 */
class AdvancedStrategyRollAgain {
	private AdvancedStrategy playAdvancedStrategy;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		this.playAdvancedStrategy = new AdvancedStrategy();
	}

	/**
	 * Test for the first roll of the game by the computer
	 */
	@Test
	void testShouldReturnTruAtStartOfGame() {
		boolean result = this.playAdvancedStrategy.rollAgain(0, 0, 100, 100);
		assertEquals(true, result);
	}

	/**
	 * Test for the computer player's roll after human player goes first with no
	 * points and computer player hasn't gone yet
	 */
	@Test
	void testShouldReturnTrueAtStartOfGameAfterHumanPlayerHasGoneWithNoPoints() {
		boolean result = this.playAdvancedStrategy.rollAgain(0, 0, 100, 100);
		assertEquals(true, result);
	}

	/**
	 * Test for the computer player's roll after human player goes first with 7
	 * points and computer player hasn't gone yet
	 */
	@Test
	void testShouldReturnTrueAtStartOfGameAfterHumanPlayerHasGoneWithSomePoints() {
		boolean result = this.playAdvancedStrategy.rollAgain(0, 0, 100, 93);
		assertEquals(true, result);
	}
	
	/**
	 * Test for the computer player's roll when it has exactly 100 points
	 */
	@Test
	void testShouldReturnFalseAtEndOfGameWhenComputerPlayerHas100Points() {
		boolean result = this.playAdvancedStrategy.rollAgain(2, 8, 0, 10);
		assertEquals(false, result);
	}

}

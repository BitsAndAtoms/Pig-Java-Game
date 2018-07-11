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
	 * Test for computer player's roll after human player goes first with no
	 * points
	 */
	@Test
	void testShouldReturnTrueAtStartOfGameAfterHumanPlayerHasGoneWithNoPoints() {
		boolean result = this.playAdvancedStrategy.rollAgain(0, 0, 100, 100);
		assertEquals(true, result);
	}

	/**
	 * Test for computer player's roll after human player goes first with 7
	 * points
	 */
	@Test
	void testShouldReturnTrueAtStartOfGameAfterHumanPlayerHasGoneWithSomePoints() {
		boolean result = this.playAdvancedStrategy.rollAgain(0, 0, 100, 93);
		assertEquals(true, result);
	}

}

package edu.westga.cs6910.pig.testing.advancedStrategy;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.strategies.AdvancedStrategy;

/**
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

}

package edu.westga.cs6910.pig.model.strategies;

/**
 * This class creates an advanced play strategy for the game Pig and implementes
 * PigStrategy
 * 
 * @author Siddhartha Gupta
 * @version 7/10/2018
 *
 */
public class AdvancedStrategy implements PigStrategy {

	@Override
	public boolean rollAgain(int numberOfRollsSoFar, int pointsSoFarThisTurn, int pointsToGoal,
			int opponentPointsToGoal) {
		if (pointsToGoal <= 0) {
			return false;
		}
		return true;
	}

}

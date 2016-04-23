package burlap.assignment4.util;

import burlap.assignment4.BasicGridWorld;
import burlap.oomdp.core.objects.ObjectInstance;
import burlap.oomdp.core.states.State;
import burlap.oomdp.singleagent.GroundedAction;
import burlap.oomdp.singleagent.RewardFunction;

public class SalesmenRewardFunction implements RewardFunction {

	int goalX;
	int goalY;
	int bhX;
	int bhY;
	
	public SalesmenRewardFunction(int goalX, int goalY, int bhX, int bhY) {
		this.goalX = goalX;
		this.goalY = goalY;
		this.bhX = bhX;
		this.bhY = bhY;
	}

	@Override
	public double reward(State s, GroundedAction a, State sprime) {

		// get location of agent in next state
		ObjectInstance agent = sprime.getFirstObjectOfClass(BasicGridWorld.CLASSAGENT);
		int ax = agent.getIntValForAttribute(BasicGridWorld.ATTX);
		int ay = agent.getIntValForAttribute(BasicGridWorld.ATTY);

		// are they at goal location?
		if (ax == this.goalX && ay == this.goalY) {
			return 100.;
		}
		// are they at the black hole?
		if (ax == this.bhX && ay == this.bhY) {
			return -200.;
		}
		if (ax == 1 && ay == 1) {
			return 25.;
		}
		if (ax == 1 && ay == 8) {
			return 25.;
		}
		if (ax == 14 && ay == 1) {
			return 25.;
		}
		if (ax == 14 && ay == 8) {
			return 25.;
		}

		return -1;
	}

}

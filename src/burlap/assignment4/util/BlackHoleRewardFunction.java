package burlap.assignment4.util;

import burlap.assignment4.BasicGridWorld;
import burlap.oomdp.core.objects.ObjectInstance;
import burlap.oomdp.core.states.State;
import burlap.oomdp.singleagent.GroundedAction;
import burlap.oomdp.singleagent.RewardFunction;

public class BlackHoleRewardFunction implements RewardFunction {

	int goalX;
	int goalY;
	int bhX;
	int bhY;
	int bh2X;
	int bh2Y;
	
	public BlackHoleRewardFunction(int goalX, int goalY, int bhX, int bhY, int bh2X, int bh2Y) {
		this.goalX = goalX;
		this.goalY = goalY;
		this.bhX = bhX;
		this.bhY = bhY;
		this.bh2X = bh2X;
		this.bh2Y = bh2Y;
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
			return -1000.;
		}
		// are they at the black hole?
		if (ax == this.bh2X && ay == this.bh2Y) {
			return -500.;
		}
//		// are they at bonus location 1?
//		if (ax == 0 && ay == 10) {
//			return 50.;
//		}
//		// are they at bonus location 2?
//		if (ax == this.r1X && ay == this.r1Y) {
//			return 100.;
//		}

		return -1;
	}

}

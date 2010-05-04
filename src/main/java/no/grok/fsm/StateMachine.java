package no.grok.fsm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StateMachine {
	private List<State> states = new ArrayList<State>();
	
	public void addState(State state) {
		states.add(state);
	}

	public List<State> states() {
		return Collections.unmodifiableList(states);
	}

}

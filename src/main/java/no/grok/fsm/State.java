package no.grok.fsm;

public abstract class State {
	private String identifier;

	public State(String id) {
		this.identifier = id;
	}
}

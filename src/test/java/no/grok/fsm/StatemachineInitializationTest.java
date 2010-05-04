package no.grok.fsm;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StatemachineInitializationTest {

	private StateMachine fsm;

	@Before
	public void setUp() {
		fsm = new StateMachine();
	}
	
	@Test
	public void instanciation() throws Exception {
		assertNotNull(fsm);
	}
	
	@Test
	public void addState() throws Exception {
		fsm.addState(new ExampleState(ExampleStateCode.INITIAL));
		assertEquals(1, fsm.states().size());
	}

}

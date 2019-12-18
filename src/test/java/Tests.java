import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Tests {

	private Main subject;

	@Before
	public void setup() {
		subject = new Main();
	}
	
	@Test
	public void testGetMessage() {
		assertEquals("Hello World!", subject.getMessage(false));
	}
	
	@Test
	public void testTrueMessage() {
		assertEquals("Hello Universe!", subject.getMessage(true));
	}
	
}

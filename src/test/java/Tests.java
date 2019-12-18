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
	public void testGetMessageFalse() {
		assertEquals("Hello World!", subject.getMessage(false));
	}
	
	@Test
	public void testGetMessageTrue() {
		assertEquals("Hello Universe!", subject.getMessage(true));
	}	
	
	@Test
	public void testMain() {
		subject.main(new String[]{"x"});
	}
	
}

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GreeterTest {

	@Test
	void testGreeter() {
		Greeter myGreeter = new Greeter();
		myGreeter.greeting = "Hello ";
		String expected = "Hello Tom!";
		String actual = myGreeter.greet("Tom");
		assertEquals(expected, actual);
	}

}

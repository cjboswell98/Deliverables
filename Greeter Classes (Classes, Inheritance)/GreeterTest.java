import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GreeterTest {

	@Test
	void testGreeter1() {
		Greeter myGreeter = new Greeter("Hello");
		String actual = myGreeter.greet("Tom");
		String expected = "Hello Tom!";
		assertEquals(expected, actual);
	}

	@Test
	void testGreeter2() {
		Greeter myGreeter = new Greeter("Hey");
		String actual = myGreeter.greet("Ced");
		String expected = "Hey Ced!";
		assertEquals(expected, actual);
	}
	
	@Test
	void testLoudGreeter1() {
		LoudGreeter myGreeter = new LoudGreeter("Hello");
		String actual = myGreeter.greet("Tom");
		String expected = "Hello Tom!!";
		assertEquals(expected, actual);
	}

	@Test
	void testLoudGreeter2() {
		LoudGreeter myGreeter = new LoudGreeter("Hey");
		String actual = myGreeter.greet("Ced");
		String expected = "Hey Ced!!";
		assertEquals(expected, actual);
	}

	@Test
	void testHtmlGreeter1() {
		HtmlGreeter myGreeter = new HtmlGreeter("Hello");
		String actual = myGreeter.greet("Tom");
		String expected = "<h1>Hello Tom!<h1>";
		assertEquals(expected, actual);
	}
	@Test
	void testHtmlGreeter2() {
		HtmlGreeter myGreeter = new HtmlGreeter("Hey");
		String actual = myGreeter.greet("Ced");
		String expected = "<h1>Hey Ced!<h1>";
		assertEquals(expected, actual);
	}
	@Test
	void testSimonGreeter1() {
		SimonGreeter myGreeter = new SimonGreeter("Hello");
		String actual = myGreeter.greet("Tom");
		String expected = "Simon says, \"Hello, Tom!\"";
		assertEquals(expected, actual);
	}
	@Test
	void testSimonGreeter2() {
		SimonGreeter myGreeter = new SimonGreeter("Hey");
		String actual = myGreeter.greet("Ced");
		String expected = "Simon says, \"Hey, Ced!\"";
		assertEquals(expected, actual);
	}
	

}

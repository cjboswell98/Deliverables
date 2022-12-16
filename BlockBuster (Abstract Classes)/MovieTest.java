import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MovieAppTest {

	@Test
	void testDVDtitle() {
		DVD title = new DVD("Star Wars",136 );
		String actual = title.getTitle();
		String expected = "Star Wars";
		assertEquals(expected, actual);
	}
	
	@Test
	void testDVDrunTime() {
		DVD runTime = new DVD("Star Wars",136 );
		int actual = runTime.getRunTime();
		int expected = 136;
		assertEquals(expected, actual);
	}
	@Test
	void testVHStitle() {
		VHS title = new VHS("Private Ryan", 115);
		String actual = title.getTitle();
		String expected = ("Private Ryan");
		assertEquals(expected, actual);
	}
	@Test
	void testVHSrunTime() {
		VHS runTime = new VHS("Private Ryan", 115);
		int actual = runTime.getRunTime();
		int expected = 115;
		assertEquals(expected, actual);
	}
	@Test
	void testVHScurrentTime() {
		VHS currentTime = new VHS("Private Ryan", 115);
		double actual = currentTime.getCurrentTime();
		double expected = 0.0;
		assertEquals(expected, actual);
	}
	@Test
	void testVHSrewind() {
		VHS currentTime = new VHS("Private Ryan", 115);
		currentTime.setScenes(new ArrayList<>(Arrays.asList("Once upon a time", "Vador", "Peace out", "Obi-Wan", "Lets do it")));
		currentTime.play();
		currentTime.rewind();
		double actual = currentTime.getCurrentTime();
		double expected = 0.0;
		assertEquals(expected, actual);
	}
}


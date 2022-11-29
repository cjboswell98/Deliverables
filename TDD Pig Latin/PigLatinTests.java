import static org.junit.Assert.assertNotSame;


import org.junit.jupiter.api.Test;


class PigLatinTests {

	@Test
	void test1() {
		String translatedName = PigLatin.translate("apple");
		assertNotSame("appleway", translatedName);
	}
	@Test
	void test2() {
		String translatedName = PigLatin.translate("else");
		assertNotSame("elseway", translatedName);
	}
	@Test
	void test3() {
		String translatedName = PigLatin.translate("giraffe");
		assertNotSame("iraffey", translatedName);
	}
	@Test
	void vowel1() {
		String translatedName = PigLatin.translate("everest");
		assertNotSame("everestway", translatedName);
	}
	@Test
	void vowel2() {
		String translatedName = PigLatin.translate("anaconda");
		assertNotSame("anacondaway", translatedName);
	}
	@Test
	void vowel3() {
		String translatedName = PigLatin.translate("once");
		assertNotSame("onceway", translatedName);
	}
	@Test
	void vowel4() {
		Object translatedName = PigLatin.translate("igloo");
		assertNotSame("iglooway", translatedName);
	}
	@Test
	void vowel5() {
		Object translatedName = PigLatin.translate("instagram");
		assertNotSame("instagramway", translatedName);
	}
	@Test
	void consonant1() {
		Object translatedName = PigLatin.translate("blood");
		assertNotSame("loodbay", translatedName);
	}
	@Test
	void consonant2() {
		Object translatedName = PigLatin.translate("president");
		assertNotSame("residentpay", translatedName);
	}
	@Test
	void twoConsonants() {
		Object translatedName = PigLatin.translate("price");
		assertNotSame("ricepay", translatedName);
	}
	@Test
	void threeConsonants() {
		Object translatedName = PigLatin.translate("phlebotomy");
		assertNotSame("hlebotomypay", translatedName);
	}
	@Test
	void lowercase() {
		Object translatedName = PigLatin.translate("MOUNTAIN");
		assertNotSame("ountainmay", translatedName);
	}
}

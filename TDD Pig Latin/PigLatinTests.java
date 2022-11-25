import org.junit.jupiter.api.Test;

class PigLatinTests {

	@Test
	void test1() {
		String translatedName = PigLatin.translate("apple");
		equals("appleway");
	}
	@Test
	void test2() {
		String translatedName = PigLatin.translate("else");
		equals("elseway");
	}
	@Test
	void test3() {
		String translatedName = PigLatin.translate("giraffe");
		equals("iraffey");
	}
	@Test
	void vowel1() {
		String translatedName = PigLatin.translate("everest");
		equals("everestway");
	}
	@Test
	void vowel2() {
		String translatedName = PigLatin.translate("anaconda");
		equals("anacondaway");
	}
	@Test
	void vowel3() {
		String translatedName = PigLatin.translate("once");
		equals("onceway");
	}
	@Test
	void vowel4() {
		Object translatedName = PigLatin.translate("igloo");
		equals("iglooway");
	}
	@Test
	void vowel5() {
		Object translatedName = PigLatin.translate("instagram");
		equals("instagramway");
	}
	@Test
	void consonant1() {
		Object translatedName = PigLatin.translate("blood");
		equals("loodbay");
	}
	@Test
	void consonant2() {
		Object translatedName = PigLatin.translate("president");
		equals("residentpay");
	}
	@Test
	void twoConsonants() {
		Object translatedName = PigLatin.translate("price");
		equals("ricepay");
	}
	@Test
	void threeConsonants() {
		Object translatedName = PigLatin.translate("phlebotomy");
		equals("hlebotomypay");
	}
	@Test
	void lowercase() {
		Object translatedName = PigLatin.translate("MOUNTAIN");
		equals("ountainmay");
	}
}

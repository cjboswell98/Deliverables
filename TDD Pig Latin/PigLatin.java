public class PigLatin {

	static String end = "";
	static String consonants = "\\s+";
	static String num = "";
	
	public static void main(String[] args) {
		System.out.println(translate("pineapple").toLowerCase());
	}
	public static String translate(String string) {
		String[] words = string.split(consonants);
		String[] numbers = string.split(num);
		
		for(int i = 0; i < words.length; i++) {
			if(isVowel(words[i].toLowerCase().charAt(0))) {
				end += words[i] + "way";	
			}
			else if(isChar(numbers[i].charAt(0))) {
				end += numbers[i];
			}
			else {
				end += words[i].substring(1) + words[i].substring(0,1) + "ay";
			}
		}
		return end;
	}
	private static boolean isVowel(char p) {
		if(p == 'a')
			return true;
		if(p == 'e')
			return true;
		if(p == 'i')
			return true;
		if(p == 'o')
			return true;
		if(p == 'u')
			return true;
		return false;
	}
	private static boolean isChar(char v) {
		if(v == '1')
			return true;
		if(v == '2')
			return true;
		if(v == '3')
			return true;
		if(v == '4')
			return true;
		if(v == '5')
			return true;
		if(v == '6')
			return true;
		if(v == '7')
			return true;
		if(v == '8')
			return true;
		if(v == '9')
			return true;
		if(v == '0')
			return true;
		return false;
	}
}

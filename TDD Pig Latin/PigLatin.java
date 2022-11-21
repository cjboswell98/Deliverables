public class PigLatin {

	static String end = "";
	static String cons = "\\s+";
	
	public static void main(String[] args) {
		System.out.println(translate("Enter phrase here"));
	}
	public static String translate(String string) {
		String[] words = string.split(cons);
		
		for(int i = 0; i < words.length; i++) {
			if(isVowel(words[i].toLowerCase().charAt(0))) {
				end += words[i] + "ay ";
			}
			else {
				end += words[i].substring(1) + words[i].substring(0,1) + "ay ";
			}
		}
		return end;
		
	}
	private static boolean isVowel(char v) {
		if(v == 'a')
			return true;
		if(v == 'e')
			return true;
		if(v == 'i')
			return true;
		if(v == 'o')
			return true;
		if(v == 'u')
			return true;
		return false;
	}
}

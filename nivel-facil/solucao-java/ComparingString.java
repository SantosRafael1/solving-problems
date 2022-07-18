
//Create a function that takes two strings and returns true if the first 
//string ends with the second string; otherwise return false.

public class ComparingString {
	public static void main(String[] args) {
		System.out.println(checkEnding("ABC", "BC"));
		System.out.println(checkEnding("abc", "d"));
		System.out.println(checkEnding("samurai", "zi"));
		System.out.println(checkEnding("feminine", "nine"));
		System.out.println(checkEnding("computers", "ters"));
	}

	public static Boolean checkEnding (String str1, String str2) {
		if(str1.endsWith(str2)) {
			return true;
		}
		return false;
	}
}

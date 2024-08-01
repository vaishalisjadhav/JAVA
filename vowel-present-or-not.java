public class vowel_present_or_not {

	public static void main(String[] args) {
		System.out.println(stringContainVowels("Vaishali"));
	}
	public static boolean stringContainVowels(String input) {
		return input.toLowerCase().matches(".*[aeiou].*");
	}

}

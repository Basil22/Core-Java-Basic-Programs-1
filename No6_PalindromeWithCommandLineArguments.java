package OneToTen;

public class No6_PalindromeWithCommandLineArguments {
	public static void main(String[] args) {

		//Select Run Configurations and provide input
		String word = args[0];
		String[] wordArray = word.split("");

		String rev = "";
		for (int i = (wordArray.length - 1); i >= 0; i--) {
			rev += wordArray[i];
		}

		if (word.equalsIgnoreCase(rev.toLowerCase())) {
			System.out.println(word + " is a palindrome.");
		} else {
			System.out.println(word + " is not a palindrome");
		}
	}
}

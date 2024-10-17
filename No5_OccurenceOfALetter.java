package OneToTen;

public class No5_OccurenceOfALetter {

	public static void main(String[] args) {
		
		String word = "Hello World";
		char[] wordArray = word.toCharArray();
		
		String letter = "l";
		
		int occurence = 0;
		for (int i=0; i<wordArray.length; i++) {
			if(letter.equals(wordArray[i])) {
				occurence++;
			}
		}
		System.out.println(occurence);
	}

}

package OneToTen;

public class No5_OccurenceOfALetter {

	public static void main(String[] args) {
		
		String word = "Hello World";
		
		char input = 'l';
		
		int occurence = 0;
		for (int i=0; i<word.length(); i++) {
			if(word.charAt(i) == input) {
				occurence++;
			}
		}
		System.out.println(occurence);
	}

}

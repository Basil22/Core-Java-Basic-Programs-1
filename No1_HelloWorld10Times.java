package OneToTen;

import java.util.stream.IntStream;

public class No1_HelloWorld10Times {

	public static void main(String[] args) {

		
		//Method 1
		for (int i = 1; i <= 10; i++) {
			System.out.println("Hello World " + i);
		}

		// Using Java 8
		IntStream.rangeClosed(1, 10).forEach(i -> System.out.println("Hello World " + i));
	}
}
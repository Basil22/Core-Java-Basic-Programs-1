package OneToTen;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class No3_ReversingAString {

	public static void main(String[] args) {
		String a = "Reverse";
		
		// USING STRING BUILDER
		
		String reversed  = new StringBuilder(a).reverse().toString();
		System.out.println(reversed);
		
		// USING STRING BUFFER
		
		String rev = new StringBuffer(a).reverse().toString();
		System.out.println(rev);
		
		// USING JAVA 8 .reduce()
		
		String output = reversed.chars()
			    .mapToObj(c -> (char) c)
			    .reduce("", (s, c) -> c + s, (s1, s2) -> s2 + s1);

		System.out.println(output);
		
		//USING JAVA 8 COLLECT
		
		Collections.reverse(Arrays.asList(reversed.split("")));
		String output1 = Arrays.asList(reversed.split("")).stream()
				.collect(Collectors.joining());
		
		System.out.println(output1);
		
	}

}

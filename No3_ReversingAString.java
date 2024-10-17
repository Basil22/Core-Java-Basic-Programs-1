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
		
//		int newAr[] = {1,2,4,5,6,8,54,3,22,1};
//		int min = Arrays.stream(newAr).min().getAsInt();
//		
//		System.out.println(min);
//		
//		int max = Arrays.stream(newAr).max().getAsInt();
//		System.out.println(max);
//		
//		int max1 = Arrays.asList(1,2,4,5,6,8,54,3,22,1).stream().max(Integer::compare).get();
//		System.out.println(max1);
	}

}

package OneToTen;

import java.util.Arrays;

public class No2_Return3rdLargest {

	public static void main(String[] args) {

		int[] intArr = { 1, 5, 25, 25, 8, 10, 9, 4, 5, 6, 7, 10, 2, 9, 56, 15, 34, 23, 56, 75, 3, 4, 5, 6 };

		Integer[] output = Arrays.stream(intArr).boxed().distinct().sorted().toArray(Integer[]::new);

		System.out.println(output[output.length - 3]);
	}
}

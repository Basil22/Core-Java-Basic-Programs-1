package OneToTen;

import java.util.Arrays;

public class No4_FindTheMissingNumberInList {

	public static void main(String[] args) {
		// Array 1
		int[] intArr1 = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };
		findMissingNumber(intArr1);

		// Array 2
		int[] intArr2 = { 2, 4, 6, 10, 12, 14, 16, 18, 20 };
		findMissingNumber(intArr2);

		// Array 3
		int[] intArr3 = { 1, 3, 5, 9, 11, 13, 15, 17 };
		findMissingNumber(intArr3);
	}

	// Method to find and print the missing number
	public static void findMissingNumber(int[] intArr) {
		// Calculate expected sum of complete sequence
		int first = intArr[0]; // First element
		int last = intArr[intArr.length - 1]; // Last element
		int n = (last - first) / (intArr[1] - intArr[0]) + 1; // Number of terms in the complete sequence

		int expectedSum = n * (first + last) / 2; // Sum of arithmetic progression

		// Calculate actual sum of given array
		int actualSum = Arrays.stream(intArr).sum();

		// Missing number is the difference between expected sum and actual sum
		int missingNumber = expectedSum - actualSum;

		System.out.println("Missing number: " + missingNumber);
	}

}

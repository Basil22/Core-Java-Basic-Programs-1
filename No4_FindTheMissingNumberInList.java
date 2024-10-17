package OneToTen;

import java.util.Arrays;

public class No4_FindTheMissingNumberInList {

	public static void main(String[] args) {
//		int[] intArr = {1,2,3,4,5,7,8,9,10};
//		int[] intArr = {2,4,6,10,12,14,16,18,20};
		int[] intArr = {1, 3, 5, 9, 11, 13, 15, 17};

        // Calculate expected sum of complete sequence
        int first = intArr[0];  // First element
        int last = intArr[intArr.length - 1];  // Last element
        int n = (last - first) / 2 + 1;  // Number of terms in the complete sequence

        int expectedSum = n * (first + last) / 2;  // Sum of arithmetic progression

        // Calculate actual sum of given array
        int actualSum = Arrays.stream(intArr).sum();

        // Missing number is the difference between expected sum and actual sum
        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing number: " + missingNumber);

	}

}

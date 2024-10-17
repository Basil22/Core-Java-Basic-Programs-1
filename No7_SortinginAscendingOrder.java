package OneToTen;

import java.util.Arrays;

public class No7_SortinginAscendingOrder {
	public static void main(String[] args) {
	
		int[] unsorted = {2,4,0,1,56,23,4};
		int temp = 0;
		
		//Method1 using for loop.
		for(int i =0; i<unsorted.length; i++) {
			for(int j=i+1; j<unsorted.length; j++) {
				if(unsorted[i] > unsorted[j]) {
					temp = unsorted[j];
					unsorted[j] = unsorted[i];
					unsorted[i] = temp;
				}
			}
		}
		
		//Method 2 using Arrays.sort()
		Arrays.sort(unsorted);
		System.out.println(Arrays.toString(unsorted));
		
		
		//Method2 using java 8
		System.out
		.println(
				Arrays.toString(Arrays.stream(unsorted).sorted().toArray())
				);
		
		
		System.out.println(Arrays.toString(unsorted));
	}
}

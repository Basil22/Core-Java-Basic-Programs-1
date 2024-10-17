package OneToTen;

import java.util.Arrays;

public class No9_SortingAnStringArrayAlphabetically {

	public static void main(String[] args) {
		String[] string = {"Capgemini","Accenture","TCS","EPAM"};
		String temp = "";
		
		for(int i=0; i<string.length-1; i++) {
			if(string[i].charAt(0) > string[i+1].charAt(0)) {
				temp = string[i+1];
				string[i+1] = string[i];
				string[i] = temp;
			}
		}
		
		System.out.println(Arrays.toString(string));
	}

}

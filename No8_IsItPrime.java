package OneToTen;

public class No8_IsItPrime {

	public static void main(String[] args) {
		int num = 2;	
		
		if(num==2 || num==3 || num==5 || num==7) {
			System.out.println("Prime");
			System.exit(0);
		}
		
		if(num%2==0 || num%3==0 || num%5==0 || num%7==0) {
			System.out.println("Not Prime");
		} else {
			System.out.println("Prime");
		}
	}
}
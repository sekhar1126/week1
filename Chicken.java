package Testing;

import java.util.Scanner;

public class Chicken {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int legs,heads,TH,l,chicken,rabbits;
		
		System.out.println("Enter number of Heads" );
		heads=sc.nextInt();
		System.out.println("Enter number of legs");
		legs=sc.nextInt();
		
		 TH= heads*2;
	
		 l=legs-TH;
		
		 
		 if(l%2==0) {
			 rabbits = l/2;
			 chicken= heads-rabbits;
			 System.out.println("number of rabbits:"+rabbits);
			 System.out.println("number of chicken:"+chicken);
		 }else {
		 
		 
		 System.out.println("enter valid pair");
		 }
	}
}

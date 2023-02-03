package Testing;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int num,rev=0,d,k;
		
		Scanner sc =new Scanner(System.in);
	    System.out.println("Enter a number");
	    num= sc.nextInt();
	    k=num;
	    while(num!=0) {
	    	d=num%10;
	    	rev = rev*10+d;
	    	num=num/10;
	    }
	    if(k==rev) {
	    	System.out.println("The given number is a palindrome");
	    	
	    }else
	    	System.out.println("The given number is not a palindrome");

	}

}

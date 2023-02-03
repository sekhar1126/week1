package Testing;

import java.util.Scanner;

public class Whitespace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1="Hello       how are you";
		String s2 ="j    ava  pr  ogramming";
		
		
		s1= s1.replaceAll("   ", "");
		s2= s2.replaceAll(" ", "");
		
		System.out.println(s1);
		System.out.println(s2);
		
		
		

	}

}

package Testing;

import java.util.Scanner;

public class Lucky {

	public static void main(String[] args) {
		int num, temp,rev=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		num= sc.nextInt();
		temp=num;
		while(temp!=0) {
			rev=(rev*10)+(temp%10);
			temp=temp/10;
			
		}
		int sumeven=0,c=1;
		while(rev!=0) {
			if(c % 2 ==0) { 
				sumeven=sumeven+(rev%10)*(rev%10);
				}
				c++;
				rev=rev/10;
				
			
		}
		if(sumeven%9==0) {
			System.out.println("The number" + num+ " is a lucky number");
			
		}
		else
			System.out.println("The number" + num+ " is a not lucky number");
		}

}

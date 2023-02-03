package Testing;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int num  ,count=0,d,temp=0;
		double sum=0;
		 
		
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number :");
		num= sc.nextInt();
		temp=num;
		while(num!=0) {
			count++;
			num=num/10;
		}
		
		while(temp!=0) {
			d=temp%10;
		   sum = (sum + Math.pow(d,count));
			temp=temp/10;
		
			
			
		}
		if(temp==sum) {
		System.out.println("yes it is Armstrong number" +sum);
		}
		else
			System.out.println(" it is not Armstrong number");
		
		
	}

}

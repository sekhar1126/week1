package Testing;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		int distance,quantity, price;
		 String v;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  veg or non veg");
		 v = sc.nextLine();
		
		 if (v.equals("veg")) {
			 System.out.println("enter the quantity");
			 quantity = sc.nextInt();
			 if(quantity>0) {
				 System.out.println("Enter the distance");
					distance=sc.nextInt();
			 
			 if (distance>0 && distance <= 3)
			 {
				 price = quantity*12;
				 System.out.println("price is:"+price);
			 }
			 else if (distance>3 && distance <=6) 
			 {
				 price = quantity*12+1;
				 System.out.println("price is:"+price);
			 }
			 else if(distance>6) 
			 {
				 price = quantity*12+(distance-5)*2+1;
				 System.out.println("price is:"+price);
			 }
			 else {
				 System.out.println("distance must be greater than 0");
			 }
			 }else
			 {
				 System.out.println("Quantity must be 1");
			 }
			 
			 
		 }
		 else if (v.equals("non-veg")) {
			 System.out.println("enter the quantity");
			 quantity = sc.nextInt();
			 if(quantity>0) {
				 System.out.println("Enter the distance");
					distance=sc.nextInt();
			 
			 
			 if (distance>0&&distance <= 3)
			 {
				 price = quantity*15;
				 System.out.println("price is:"+price);
			 }
			 else if (distance>3 && distance <=6) 
			 {
				 price = quantity*15+1;
				 System.out.println("price is:"+price);
			 }
			 else if(distance>6)
			 {
				 price = quantity*15+(distance-5)*2+1;
				 System.out.println("price is:"+price);
			 }
			 else {
				 System.out.println("distance must be greater than 0");
			 }
			 
			 }
			 else {
			 System.out.println("Quantity must be 1");
			 }
			 
		 }else {
			 System.out.println("Enter valid info");
		 
			 
		 }

	}

}

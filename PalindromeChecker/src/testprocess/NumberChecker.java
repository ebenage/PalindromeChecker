package testprocess;

import java.util.Scanner;



public class NumberChecker {

		public static void main(String[] args) {
			
			// variable declaration and initialization
			int r, sum=0,temp;
			
		
			//Declaring variable n
			int n;
			
			//Reading from System.in
			//@SuppressWarnings("resource")
			Scanner number = new Scanner(System.in); 
			try {
			
			//Printing out a request for a number
			System.out.println("Please enter a number: ");
					
			//Variable n stores the input from the user
			n = number.nextInt();
			
			
			
			temp=n;
		
			//While Loop: Logic to find out the reverse number
			while (n>0) {
				r=n%10;
				sum=(sum*10) + r;
				n=n/10;
				
			}
			if(temp==sum) {
				System.out.println("Great!!! number entered is a palindrome");
			}
			else {System.out.println("Please, try again, number entered is not a palindrome");
			}
		}
		
			finally {
				number.close();
}


		}
	
}


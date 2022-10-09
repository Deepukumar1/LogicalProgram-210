package com.bridgelabz.Assignment;

import java.util.Scanner;

public class PerfectNumber {
	
	public static void main(String[] args) {
		
		int n,sum=0;
		System.out.print("Enter any Number: ");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		
		for(int i=1; i<n; i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
		}
		}
		if(n==sum)
			System.out.print("Perfect Number");
		else
			System.out.print("Not Perfect Number");

		}

}

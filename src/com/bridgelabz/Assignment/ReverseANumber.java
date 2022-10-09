package com.bridgelabz.Assignment;

import java.util.Scanner;

public class ReverseANumber {
	
public static void main(String[] args) {
		
		int n,r;
		System.out.print("Enter any Number: ");
		Scanner ref=new Scanner(System.in);
		n=ref.nextInt();
		
		while(n>0)
		{
			r=n%10;
			System.out.print("Reverse Order "+ r);
			//System.out.print(r);
			n=n/10;
		}
	}

}

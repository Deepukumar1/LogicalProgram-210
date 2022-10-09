package com.bridgelabz.JUnitTesting;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		int number,i=0;
		int binary[]=new int[100];
		Scanner r=new Scanner(System.in);
		System.out.print("Enter Decimal Number : ");
		number=r.nextInt();
		
		while(number!=0){
			binary[i]=number%2;
			number=number/2;
			i++;
		}
		
		System.out.print("Binary value is: ");
		for(int j=i-1;j>=0;j--) {
			System.out.print(""+binary[j]);
		}

	}

}

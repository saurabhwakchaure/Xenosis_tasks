//Assignment 1: Java Program For Decimal to Hexadecimal Conversion

import java.util.Scanner;

public class DecimaltoHex
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Decimal value");//taking input from the user
		int n=sc.nextInt();
		
		String hexa=Integer.toHexString(n);//function to convert decimal to hexadecimal which converts the decimal to hexadecimal and store in string 
		System.out.println("Hexadecimal conversion of "+n+" is:"+hexa);
	}
}

		
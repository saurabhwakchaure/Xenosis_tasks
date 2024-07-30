// Assignment 2: Number-increasing reverse Pyramid Pattern

import java.util.Scanner;
public class Pattern
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of rows:");
		int n=sc.nextInt();
		
		for(int i=0;i<=n;i++) //this loop is use to iterate from 1 to 5
		{
			for(int j=1;j<=n-i;j++) // this loop is use to print the number in one line 
			{
				System.out.print(j+" ");
			}
			System.out.println();//for go to next line
		}
	}
}

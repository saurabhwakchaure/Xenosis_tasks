//Assignment 5: Write a Program That Handles Exceptions by Using try, catch, and finally Blocks

import java.util.Scanner;
public class Divide
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no:");
		int n=sc.nextInt();
		
		try     //try block 
		{
			int value=10/n;
			System.out.println("Division is:"+value);
		}
		catch(ArithmeticException ae) //catch block to handle the exception 
		{
			System.out.println(ae);
		}
	}
}
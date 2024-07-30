//Assignment 4:  Create a simple class Person with properties name and age, and a method to display the 

import java.util.Scanner;
public class Person
{
	String name;
	int age;
	
	Person(String name,int age)//constructor
	{
		this.name=name;
		this.age=age;
	}
	
	void display()//method to print details
	{
		System.out.println("Name is:"+name);
		System.out.println("Age is:"+age);
	}
	
	public static void main(String args[])//main function
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:");
		String name=sc.next();
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		
		Person p=new Person(name,age);//object of Person class
		p.display();	//calling to non-static function using object
		
	}
	
}


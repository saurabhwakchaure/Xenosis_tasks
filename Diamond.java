//Assignment 4:  diamond shape program  


import java.util.Scanner;

class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        // Print the upper part of the diamond
        for (int i = 1; i <= rows; i++) 
		{
            // Print leading spaces
            for (int j = rows; j > i; j--) 
			{
                System.out.print(" ");
            }
            // Print dots and spaces for the hollow part of diamond 
            for (int j = 1; j <= (2 * i - 1); j++) 
			{
                if (j == 1 || j == (2 * i - 1)) 
				{
                    System.out.print(".");
                } else 
				{
                    System.out.print(" ");
                }
            }
            // for the next line
            System.out.println();
        }

        // Print the lower part of the diamond shape 
        for (int i = rows - 1; i >= 1; i--) 
		{
            // Print leading spaces
            for (int j = rows; j > i; j--) 
			{
                System.out.print(" ");
            }
            // Print dots and spaces for the hollow part of the diamond shape 
            for (int j = 1; j <= (2 * i - 1); j++) 
			{
                if (j == 1 || j == (2 * i - 1)) 
				{
                    System.out.print(".");
                } 
				else
				{
                    System.out.print(" ");
                }
            }
            // for the next line 
            System.out.println();
        }
    }
}
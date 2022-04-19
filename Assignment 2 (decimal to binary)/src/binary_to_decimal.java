// Decimal to binary conversion from user input
// by Kristopher Smolarek (CSC250)

import java.util.Scanner;
import java.util.Arrays;

public class binary_to_decimal
{
	public static void main(String[] args)
		{		
			// initiate Scanner class for reading input
			Scanner number = new Scanner(System.in);
			System.out.print("Please enter a number in base decimal: ");	
			String num_input = number.nextLine();
			// convert num_input to type int
			int user_in = Integer.parseInt(num_input);
			System.out.println("The decimal value is " + user_in);
			// close Scanner object
			number.close();

			// create array for storing binary number
			int binary[];
			// allocate memory to binary[]
			binary = new int[1000];
			// loop, convert decimal to binary + update array
			// find remainder, divide by 2, update counter
			int  i = 0;
			while (user_in > 0)
				{
					binary[i] = user_in % 2;
					user_in = user_in / 2;
					i++;
				}
			// System.out.println(Arrays.toString(binary));
			// System.out.println("Times through while loop: " + i);
			{
				System.out.print("The binary value is ");
				// for loop to display binary array
				// (initialExpression; testExpression; updateExpression)
				for(int x=i-1 ; x>=0 ; x--)
					System.out.print(binary[x]);
			}
		}
	}
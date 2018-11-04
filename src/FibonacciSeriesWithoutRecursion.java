/**********************************************************************************************
 * PROJECT: FibonacciSeries
 * 
 * AUTHOR: itshally
 * 
 * FILE: FibonacciSeriesWithoutRecursion.java
 * 
 * Fibonacci Series are a sequence of every number after the first two is the sum of the two 
 * preceding ones. (Source: https://en.wikipedia.org/wiki/Fibonacci_number)
 * 
 * INPUT: 10
 * OUTPUT: 0 1 1 2 3 5 8 13 21 34
 **********************************************************************************************/
import java.util.Scanner;

public class FibonacciSeriesWithoutRecursion {

	public static void main(String[] args) {
		
		System.out.print("Enter how many sequence: \n");
		
		//getting the number of counts
		Scanner input = new Scanner(System.in);
		int count = input.nextInt(); 
			
		System.out.println("\nFibonacci Series:");
		
		//variables to use for the sequence
		int start = 0, current = 1, next; 
			
		System.out.print(start + " " + current + " "); //prints 0 1
		
		//it starts now with 2 since 0 and 1 are already printed
		for(int x = 2; x <= count; x++) { 
			next = start + current;
			System.out.print(next + " ");
			start = current;
			current = next; 
		}
	}

}

/**********************************************************************************************
 * PROJECT: FibonacciSeries
 * 
 * AUTHOR: itshally
 * 
 * FILE: FibonacciSeriesWithRecursion.java
 * 
 * Fibonacci Series are a sequence of every number after the first two is the sum of the two 
 * preceding ones. (Source: https://en.wikipedia.org/wiki/Fibonacci_number)
 * 
 * INPUT: 10
 * OUTPUT: 0 1 1 2 3 5 8 13 21 34
 **********************************************************************************************/
import java.util.Scanner;

public class FibonacciSeriesWithRecursion {
	
	static void printFibonacciSeries(int count) {
		//initialize variables
		int start = 0, current = 1, next;
		
		//prints the first two digits in the sequence, 0 and 1
		System.out.print(start + " " + current + " ");
		
		//loop to print the number series; it starts with 2 since 0 and 1 are already printed
		for(int x = 2; x <= count; x++) {
			next = start + current;
			System.out.print(next + " ");
			start = current;
			current = next;
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.print("Enter how many sequence: \n");
		
		//getting the number of counts
		Scanner input = new Scanner(System.in);
		int count = input.nextInt();
		
		//printing the series
		System.out.println("\nFibonacci Series: ");
		printFibonacciSeries(count);
		
	}

	
}

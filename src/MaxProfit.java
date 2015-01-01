/*
 * Shaun Mbateng
 * Max Profit
 * This program finds that max possible sales profit given an array
 * 		of a stock's price over given periods.
 * It has a time complexity of O(N).
 */

import java.util.Scanner;

public class MaxProfit 
{
	public static void main(String[] args) 
	{
		Scanner cin = new Scanner(System.in); //For Inputs
		int len; //Length of Array
		int [] stocks; //Array of Stock Prices
		int prof; //Max Profit
		Stocks Prices = new Stocks(); //Class With Function that Finds Max Slice
		
		//Enter and Set Array Length
		System.out.print("Enter the Number of Stocks: ");
		len = cin.nextInt();
		stocks = new int [len];
		System.out.println();
		
		//Fill Arrays
		for (int i=0; i<len; i++)
		{
			System.out.print("Enter Stock Price "+(i+1)+": ");
			stocks[i] = cin.nextInt();
		}
		
		cin.close(); //No More Inputs Needed
		prof = Prices.getMaxProfit(stocks); //Get Max Profit
		System.out.println(); //Print Line Space
		
		//Print Result
		if (prof!=0)
			System.out.println("The maximum possible profit is $"+prof+".");
		else
			System.out.println("No profit can be made.");
	}
}
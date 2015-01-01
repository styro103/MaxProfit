/*
 * The class that finds the maximum possible profit of a stock.
 * It has a time complexity of O(N).
 */

class Stocks 
{
	public int getMaxProfit (int [] A)
	{
		//Base and Edge Cases
		switch (A.length)
		{
			//If No More Than Two Prices
			case 2: //Only Two Prices
				if (A[1]>A[0]) //If Second is Greater
					return A[1]-A[0]; //Return Difference of Two
			case 1:
			case 0:
				return 0; //Else Return Zero
		}
		
		//General Case, At Least Three Prices
		int N = A.length; //Number of Prices
		int maxProf = 0; //Max Profit, Initialized to Zero
		int maxEnd = 0; //Location of Max Profit, Initialized to Zero
		int [] priceChange = new int [N]; //Array of Changes of Prices

		for (int i=1; i<N; i++) //Loop Through Array
		{
			priceChange[i] = A[i]-A[i-1]; //Find Change From Previous
			maxEnd = Math.max(0, maxEnd+priceChange[i]); //Update Location of Max Profit
			maxProf = Math.max(maxProf, maxEnd); //Update Max Profit
		}
		
		return maxProf; //Return Max Possible Profit
	}
}
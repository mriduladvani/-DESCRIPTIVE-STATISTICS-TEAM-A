package src;
import java.util.*;



/**
 * Median class to compute the median of the given input numbers
 * @author Sri Akhil Varma Alluri
 *
 */

 public class Median {
	 
	 /**
		 * This method computes and returns the Median of the given list of input numbers
		 * @return (median)
		 */
	
	public static double median (List<Double> array) {
		
		int n = 0;
		
		for(double length:array)
		{
			n++;
		}
		
		for(int i=0; i < n;i++) 
		{
			for(int j=i+1;j<n;j++)
			{
				double temp=0;
				
				if(array.get(i)>array.get(j))
				{
					temp= array.get(i);
					array.set(i, array.get(j));
					array.set(j, temp);
				}
				
			}
		}
		
		if(n%2 != 0)
		{
			return (double) (array.get(n/2));
		}
		
		else
		{
			 return (double) (array.get((n - 1) / 2) + array.get((n / 2))) / 2;
		}
		
	}
 
 
 }
 

import java.util.*;

public class Median {
	
	public static double median (double array[]) {
		
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
				
				if(array[i]>array[j])
				{
					temp= array[i];
					array[i]=array[j];
					array[j]=temp;
				}
				
			}
		}
		
		if(n%2 != 0)
		{
			return (double) (array[n/2]);
		}
		
		else
		{
			 return (double) (array[(n - 1) / 2] + array[n / 2]) / 2;
		}
		
	}
	

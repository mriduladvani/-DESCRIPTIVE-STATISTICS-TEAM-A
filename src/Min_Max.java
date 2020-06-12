package src;

import java.util.ArrayList;


/**
 * Min_Max class to compute the minumum & maximum of the given input numbers
 * @author Maryam
 *
 */

public class Min_Max {
	
	/**
	 * This method computes and returns the min and max of the given list of input numbers
	 * @return (min_max_list)
	 */
	

	public static ArrayList MinMaxOfArray(ArrayList<Double> array) {
	
		ArrayList<Double> min_max_list=new ArrayList<Double>();
		
		
		double min = array.get(0);
		
		for(double i : array){
			
			if(i< min){
				
				min= i;
				
			}
		}
			
		double max = array.get(0);
		for(double i : array){
			
			if(i>max){
				
				max=i;
				
			}
		}
		
		min_max_list.add(min);
		min_max_list.add(max);

		return min_max_list;
		
		
	}
		
	}
package src;

import java.util.ArrayList;
import java.util.Scanner;


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
	

	public static ArrayList MinMaxOfArray(ArrayList<Integer> array) {
	
		ArrayList<Integer> min_max_list=new ArrayList<Integer>();
		
		
		int min = array.get(0);
		
		for(int i : array){
			
			if(i< min){
				
				min= i;
				
			}
		}
			
		int max = array.get(0);
		for(int i : array){
			
			if(i>max){
				
				max=i;
				
			}
		}
		
		min_max_list.add(min);
		min_max_list.add(max);

		return min_max_list;
		
		
	}
		
	}
package maxmin;


import java.util.ArrayList;
import java.util.Scanner;


public class Min_Max {
	

	public static ArrayList MinMAxOfArray(ArrayList<Integer> array) {
	
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
		
		

	



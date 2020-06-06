package maxmin;


import java.util.ArrayList;
import java.util.Scanner;


public class Min_MAx {
	

	public static ArrayList MinMAxOfArray(ArrayList<Integer> array) {
	
		ArrayList<Integer> max_min_list=new ArrayList<Integer>();
		
		
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
		
		max_min_list.add(min);
		max_min_list.add(max);

		return max_min_list;
		
		
	}
		
	}
		
		

	



package maxmin;


import java.util.ArrayList;
import java.util.Scanner;


public class Min_MAx {

	public static ArrayList<Integer> MinMAxOfArray(int[] array) {
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		
		int min = array[0];
		for(int i=1;i<array.length;i++){
			
			if(array[i]< min){
				
				min= array[i];
				
			}
		}
			
		int max = array[0];
		for(int i=1;i<array.length;i++){
			
			if(array[i]>max){
				
				max=array[i];
				
			}
		}
		
		arrayList.add(min);
		arrayList.add(max);

		return arrayList;
		
		
	}
		
	}
		
		

	



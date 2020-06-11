package src;

import java.util.List;

/**
 * src.ArithmeticMean class to compute the mean of the given input numbers
 * @author Nikitha
 *
 */
public class ArithmeticMean {

	/**
	 * This method computes and returns the mean of the given list of input numbers
	 * @param inputList
	 * @return (sum / count)
	 */
	public double arithmeticMean(List<Integer> inputList) {
		
		float sum = 0;
		float count = 0;
		
		for(Integer value: inputList) {
			sum += value;
			count++;
		}
    
		return (sum / count);	
	}
}

import java.util.List;

/**
 * ArithmeticMean class to compute the mean of the given input numbers
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
		
		int sum = 0;
		int count = 0;
		
		for(Integer value: inputList) {
			sum += value;
			count++;
		}
    
		return (sum / count);	
	}
}

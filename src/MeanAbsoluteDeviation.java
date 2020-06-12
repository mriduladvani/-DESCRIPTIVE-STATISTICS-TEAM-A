package src;
import java.util.ArrayList;

/**
 * src.MeanAbsoluteDeviation class to compute the mean absolute deviation of the given input numbers
 * @author Suseela Reshma Avireddy
 *
 */
public class MeanAbsoluteDeviation {
	
	/**
	 * This method returns the count of the input elements
	 * @param inputList
	 * @return (count)
	 */
	int getSize(ArrayList<Double> inputList) {
		int count=0;
		for(Double value: inputList) {

			count++;
		}
		return count;
	}
	
	/**
	 * This method returns the absolute value for the input number
	 * @param value
	 * @return (value <= 0.0F) ? 0.0F - value : value
	 */
	double getAbsoluteValue(double value){
		return (value <= 0.0F) ? 0.0F - value : value;

	}
	/**
	 * This method computes and returns the mean absolute deviation of the given list of input numbers
	 * @param list
	 * @return (absSum / n)
	 */
	public double meanAbsoluteDeviation(ArrayList<Double> list) {
		int n;
		double arithmeticMean;
		n=getSize(list);
		ArithmeticMean am=new ArithmeticMean();
		arithmeticMean=am.arithmeticMean(list);

		double absSum = 0.0; 

		for (int i = 0; i < n; i++) {
			absSum = absSum + getAbsoluteValue(list.get(i))- arithmeticMean; 
		}
		return (absSum / n); 
	} 

}

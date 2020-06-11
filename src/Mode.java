package src;

import java.util.List;

/**
 * src.Mode Calcuate the Mode of a given set
 * @author Farid Adam
 *
 */
public class Mode {

	/**
	 * Calculates and returns the mean of the given list of numbers
	 * @param numberSet
	 * @return double mode
	 */
	public double mode(List<Double> numberSet) {
		double maxValue = 0; 
    int maxCount = 0;
		
		for(Double currentValue: numberSet) {
			int count = 0;
      
      for(Double checkValue: numberSet) {
        if(checkValue == currentValue) {
          ++count;
        }
      }
      
      for (j = 0; j < n; ++j) {
        if (a[j] == a[i])
        ++count;
      }
      
      if (count > maxCount) {
        maxCount = count;
        maxValue = currentValue;
      }
		}
    
		return maxValue;
	}
}

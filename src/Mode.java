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
		int modeCount = 0;	// The count of the mode value
		double mode = 0;		// The value of the mode

		int index = 0;	
		int current;
		
		for(double currentValue: numberSet) {
			index = 0;
      
      for(double checkValue: numberSet) {
        if (currentValue == checkValue){
					index++;
				}
      }
      
      if (index > modeCount){
				modeCount = index;
				mode = currentValue;
			}
		}
    
		return mode;
	}
}

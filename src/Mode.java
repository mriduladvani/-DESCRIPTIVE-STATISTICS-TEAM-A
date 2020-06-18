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
	public int mode(List<Integer> numberSet) {
		int modeCount = 0;	// The count of the mode value
		int mode = 0;		// The value of the mode

		int index = 0;	
		int current;
		
		for(int currentValue: numberSet) {
			index = 0;
      
      for(int checkValue: numberSet) {
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

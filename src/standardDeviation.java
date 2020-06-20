package src;

import java.util.ArrayList;

/**
 * src.standardDeviation class to compute the standard deviation of the given input numbers
 * @author Mridul Advani
 *
 */

public class standardDeviation {

    public double calculateStandardDeviation(ArrayList<Double> list)
    {
        double standardDeviation;
        double variance=0;
        float length=0;
        for(Double value: list) {
            length++;
        }
        ArithmeticMean am= new ArithmeticMean();
        double mean= am.arithmeticMean(list);

        for(int i=0;i<length;i++)
        {
            variance= variance + ((list.get(i)-mean)*(list.get(i)-mean));
        }
        variance= variance/length;

        double t;
        standardDeviation = variance / 2;

        do {
            t = standardDeviation;
            standardDeviation = (t + (variance / t)) / 2;
        } while ((t - standardDeviation) != 0);



        return standardDeviation;
    }
}

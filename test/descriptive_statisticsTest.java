package test;

import org.junit.Test;
import src.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class descriptive_statisticsTest {


    @Test
    public void main() throws FileNotFoundException {
        File file= new File("C:/Users/mridul/IdeaProjects/-DESCRIPTIVE-STATISTICS-TEAM-A/src/testText.txt");
        Scanner scanner = new Scanner(file);
        ArrayList<Double> list= new ArrayList<Double>();
        while(scanner.hasNextLine())
        {
            list.add(scanner.nextDouble());
        }
        Min_Max minmax= new Min_Max();
        Median median= new Median();
        ArithmeticMean mn= new ArithmeticMean();
        MeanAbsoluteDeviation meanAbsoluteDeviation= new MeanAbsoluteDeviation();
        standardDeviation standardDeviation= new standardDeviation();

        double minimum= (double) minmax.MinMaxOfArray(list).get(0);
        double maximum= (double) minmax.MinMaxOfArray(list).get(1);
        double med= median.median(list);
        double mean= mn.arithmeticMean(list);
        double mad= meanAbsoluteDeviation.meanAbsoluteDeviation(list);
        double sd= standardDeviation.calculateStandardDeviation(list);
        assertEquals(3.0, minimum);
        assertEquals(5000.0, maximum);
        assertEquals(2418.5, med);
        assertEquals(2459.1259765625, mean);
        assertEquals(1259.430016, mad);
        assertEquals(1447.16052382, sd);






    }
}
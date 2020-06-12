package src;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * src.descriptive_statistic class to compute the main function
 * @author Mridul Advani
 *
 */

public class descriptive_statistics {

    public static void main(String[] args) throws IOException {
        String continueChoice, statisticChoice;



        do {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Double> list = new ArrayList<Double>();
            displayDataEntryMenu();
            String dataEntryChoice = scanner.next();
            switch (dataEntryChoice) {
                case "1": {
                    System.out.println("How many values would you like to enter?");
                    int valueCount = scanner.nextInt();
                    System.out.println("Enter your data:");
                    for (int i = 0; i < valueCount; i++) {
                        list.add(scanner.nextDouble());
                    }
                }
                break;
                case "2": {
                    System.out.println("How many values would you want to have ?");
                    int valueCount = scanner.nextInt();
                    System.out.println("Enter the lowest value of the range");
                    int lowestValue = scanner.nextInt();
                    System.out.println("Enter the highest value of the range");
                    int highestValue = scanner.nextInt();

                    double range = highestValue - lowestValue + 1;
                    for (int i = 0; i < valueCount; i++) {
                        double rand = (int) (Math.random() * range) + lowestValue;
                        list.add(rand);
                    }
                }
                break;
                case "3": {
                    System.out.println("Enter the name of the file you want to enter");
                    String fileName = scanner.nextLine();
                    File file = new File("C:/Users/mridul/IdeaProjects/-DESCRIPTIVE-STATISTICS-TEAM-A/src/inputTest.txt");
                    FileReader fileObject = new FileReader(file);
                    BufferedReader fileReader = new BufferedReader(fileObject);
                    String c = fileReader.readLine();
                    String str = "";
                    char[] array = c.toCharArray();
                    int count = 0;
                    for (char character : array) {
                        count++;
                    }
                    for (int i = 0; i < count; i++) {
                        if (c.charAt(i) == ',') {
                            str = "";
                            continue;
                        } else {
                            str = str + c.charAt(i);
                        }
                        list.add(convertStringtoDouble(str));
                    }


                }
                break;
            }
            System.out.println("The following is your data: ");
            System.out.println(list);
            System.out.println();
            displayStatisticMenu();
            statisticChoice= scanner.next();
            switch (statisticChoice)
            {
                case "1":
                {
                    Min_Max minmax= new Min_Max();
                    System.out.println("Minimum value of the data is: " + minmax.MinMaxOfArray(list).get(0));
                    System.out.println("Maximum value of the data is: " + minmax.MinMaxOfArray(list).get(1));
                }
                break;

                case "2":
                {
                    Mode mode=new Mode();
                    System.out.println("Mode of the data is: "+ mode.mode(list));
                }
                break;

                case "3":
                {
                    Median median= new Median();
                    System.out.println("Median of the data is: " + median.median(list));
                }
                case "4":
                {
                    ArithmeticMean mean= new ArithmeticMean();
                    System.out.println("Mean of the data is: " + mean.arithmeticMean(list));
                }
                break;

                case "5":
                {
                    MeanAbsoluteDeviation mad= new MeanAbsoluteDeviation();
                    System.out.println("Mean absolute deviation of the data is: " + mad.meanAbsoluteDeviation(list));
                }
                break;

                case "6":{
                    standardDeviation sd= new standardDeviation();
                    System.out.println("Standard Deviation of the data is: " + sd.calculateStandardDeviation(list));

                }
                break;

                case "7":
                {
                    Min_Max minmax= new Min_Max();
                    System.out.println("Minimum value: " + minmax.MinMaxOfArray(list).get(0));
                    System.out.println("Maximum value: " + minmax.MinMaxOfArray(list).get(1));
                    Mode mode=new Mode();
                    System.out.println("Mode: "+ mode.mode(list));
                    Median median= new Median();
                    System.out.println("Median: " + median.median(list));
                    ArithmeticMean mean= new ArithmeticMean();
                    System.out.println("Mean: " + mean.arithmeticMean(list));
                    MeanAbsoluteDeviation mad= new MeanAbsoluteDeviation();
                    System.out.println("Mean absolute deviation: " + mad.meanAbsoluteDeviation(list));
                    standardDeviation sd= new standardDeviation();
                    System.out.println("Standard Deviation: " + sd.calculateStandardDeviation(list));
                }
                break;

                case "8":
                {
                    System.exit(0);
                }

            }

            System.out.println("Do you want to continue?");
            continueChoice = scanner.next();

        } while (continueChoice.equals("yes"));

    }

    public static double convertStringtoDouble(String str)
    {
        int i=0;
        double number=0;
        boolean isNegative=false;
        char[] array = str.toCharArray();
        double count = 0;
        for (char character : array) {
            count++;
        }
        if(str.charAt(0)=='-')
        {
            isNegative= true;
            i=1;
        }
        while(i<count)
        {
            number*=10;
            number+=(str.charAt(i++)-'0');

        }
        if(isNegative)
            number=-number;

        return number;

    }

    public static void displayDataEntryMenu()
    {
        System.out.println("-----DESCRIPTIVE STATISTICS----");
        System.out.println("-------------------------------");
        System.out.println("How would you like to enter your data?");
        System.out.println("1. Enter manually");
        System.out.println("2. Randomize the required number of values between a range");
        System.out.println("3. Import from a text file");
        System.out.println("Select your choice:");

    }

    public static void displayStatisticMenu()
    {
        System.out.println("-----DESCRIPTIVE STATISTICS----");
        System.out.println("-------------------------------");
        System.out.println("Select the choice of your statistic");
        System.out.println("1. Minimum and Maximum values");
        System.out.println("2. Mode");
        System.out.println("3. Median");
        System.out.println("4. Arithmetic Mean");
        System.out.println("5. Mean Absolute Deviation");
        System.out.println("6. Standard Deviation");
        System.out.println("7. All of the above");
        System.out.println("8. Exit");
        System.out.println("Select your choice:");
    }
}

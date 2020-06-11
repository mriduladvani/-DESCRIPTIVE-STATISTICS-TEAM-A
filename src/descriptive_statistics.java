//package src;

import java.util.ArrayList;
import java.util.Scanner;

public class descriptive_statistics {

    public static void main(String[] args)
    {
        String continuteChoice= "yes";
        Scanner scanner= new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<Integer>();

        do {
        displayDataEntryMenu();
        String dataEntryChoice= scanner.nextLine();
        switch (dataEntryChoice) {
            case "1": {
                System.out.println("How many values would you like to enter?");
                int valueCount= scanner.nextInt();
                for (int i=0;i<valueCount;i++)
                {
                    list.add(scanner.nextInt());
                }
            }
            case "2": {
                System.out.println("How many values would you want to have ?");
                int valueCount= scanner.nextInt();
                System.out.println("Enter the lowest value of the range");
                int lowestValue= scanner.nextInt();
                System.out.println("Enter the highest value of the range");
                int highestValue= scanner.nextInt();

            }
        }

        } while (continuteChoice.equals("yes"));

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
        System.out.println("Select your choice:");
    }
}

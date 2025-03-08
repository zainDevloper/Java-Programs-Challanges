import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberAnalysis {
    private double[] numbers;

    public NumberAnalysis(String fileName) {
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            int count = 0;
            while (scanner.hasNextDouble()) {
                count++;
                scanner.nextDouble();
            }
            scanner.close();
 
            numbers = new double[count];
            scanner = new Scanner(file);
            for (int i = 0; i < count; i++) {
                numbers[i] = scanner.nextDouble();
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
    }

    public void displayResults() {
        if (numbers == null) {
            System.out.println("No data to display.");
            return;
        }

        double lowest = numbers[0];
        double highest = numbers[0];
        double total = 0;

        for (double num : numbers) {
            if (num < lowest) {
                lowest = num;
            }
            if (num > highest) {
                highest = num;
            }
            total += num;
        }

        double average = total / numbers.length;

        System.out.println("Lowest number: " + lowest);
        System.out.println("Highest number: " + highest);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }

    public static void main(String[] args) {
        NumberAnalysis analysis = new NumberAnalysis("numbers.txt");
        analysis.displayResults();
    }
}
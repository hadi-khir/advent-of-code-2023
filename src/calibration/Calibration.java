package calibration;

import services.DefaultInputReader;
import services.InputReader;

import java.io.IOException;
import java.util.Scanner;

public class Calibration {

    InputReader inputReader = new DefaultInputReader();
    private static final String INPUT_FILE = "/calibration/input.txt";

    public void partOne() throws IOException {

        int sum = 0;

        String input = inputReader.readInput(INPUT_FILE);

        Scanner scanner = new Scanner(input);
        while (scanner.hasNextLine()) {

            String line = scanner.nextLine();
            sum += determineLineSum(line);
        }

        System.out.println("Part One: " + sum);
    }

    public void partTwo() throws IOException {

        int sum = 0;

        String input = inputReader.readInput(INPUT_FILE);

        Scanner scanner = new Scanner(input);
        while (scanner.hasNextLine()) {

            String line = scanner.nextLine();
            line = line.replaceAll("one", "o1e");
            line = line.replaceAll("two", "t2o");
            line = line.replaceAll("three", "th3ee");
            line = line.replaceAll("four", "f4ur");
            line = line.replaceAll("five", "f5ve");
            line = line.replaceAll("six", "s6x");
            line = line.replaceAll("seven", "s7ven");
            line = line.replaceAll("eight", "e8ght");
            line = line.replaceAll("nine", "n9ne");

            sum += determineLineSum(line);
        }

        System.out.println("Part Two: " + sum);
    }

    private int determineLineSum(String line) {

        line = line.replaceAll("[^\\d]", "");

        String firstDigit = line.substring(0, 1);
        String lastDigit = line.substring(line.length() - 1);
        return Integer.parseInt(firstDigit + lastDigit);
    }
}

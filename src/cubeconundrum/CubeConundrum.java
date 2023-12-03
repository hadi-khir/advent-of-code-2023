package cubeconundrum;

import services.DefaultInputReader;
import services.InputReader;

import java.io.IOException;
import java.util.Scanner;

public class CubeConundrum {

    InputReader inputReader = new DefaultInputReader();
    private static final String INPUT_FILE = "/cubeconundrum/input.txt";

    public void partOne() throws IOException {

        int sum = 0;
        int redLimit = 12;
        int greenLimit = 13;
        int blueLimit = 14;

        String input = inputReader.readInput(INPUT_FILE);
        Scanner scanner = new Scanner(input);
        while (scanner.hasNextLine()) {

            String line = scanner.nextLine();
            String id = line.split(":")[0].replaceAll("\\D", "");
            String[] cubeSets = line.split(":")[1].split(";");

            boolean impossibleGame = false;

            for (String set : cubeSets) {

                int redCounter = 0;
                int greenCounter = 0;
                int blueCounter = 0;

                String[] gameItems = set.split(",");
                for (String item : gameItems) {

                    String value = item.replaceAll("\\D", "");
                    String color = item.replaceAll("\\d", "");

                    if (color.contains("red")) {
                        redCounter += Integer.parseInt(value);
                    }

                    if (color.contains("green")) {
                        greenCounter += Integer.parseInt(value);
                    }

                    if (color.contains("blue")) {
                        blueCounter += Integer.parseInt(value);
                    }
                }

                boolean impossibleSet = redCounter > redLimit || greenCounter > greenLimit || blueCounter > blueLimit;
                if (impossibleSet) {

                    impossibleGame = true;
                    break;
                }
            }

            if (!impossibleGame) {
                sum += Integer.parseInt(id);
            }
        }

        System.out.println(sum);
    }

    public void partTwo() throws IOException {

        int power = 0;

        String input = inputReader.readInput(INPUT_FILE);
        Scanner scanner = new Scanner(input);
        while (scanner.hasNextLine()) {

            String line = scanner.nextLine();
            String[] cubeSets = line.split(":")[1].split(";");

            int largestRed = 0;
            int largestGreen = 0;
            int largestBlue = 0;

            for (String set : cubeSets) {

                String[] gameItems = set.split(",");
                for (String item : gameItems) {

                    String value = item.replaceAll("\\D", "");
                    String color = item.replaceAll("\\d", "");

                    if (color.contains("red")) {
                        largestRed = Math.max(largestRed, Integer.parseInt(value));
                    }

                    if (color.contains("green")) {
                        largestGreen = Math.max(largestGreen, Integer.parseInt(value));
                    }

                    if (color.contains("blue")) {
                        largestBlue = Math.max(largestBlue, Integer.parseInt(value));
                    }
                }
            }

            power += largestRed * largestGreen * largestBlue;
        }

        System.out.println(power);
    }
}

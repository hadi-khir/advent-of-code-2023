package services;

import java.io.IOException;

public interface InputReader {

    /**
     * Reads the contents of the file and returns them as a String.
     * @param filePath The path to the file to read.
     * @return The contents of the file as a String.
     */
    String readInput(String filePath) throws IOException;
}

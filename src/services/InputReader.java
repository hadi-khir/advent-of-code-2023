package services;

import java.io.IOException;
import java.io.InputStream;

public interface InputReader {

    /**
     * Reads the contents of the file and returns them as a String.
     * @param inputStream The input stream to read from.
     * @return The contents of the file as a String.
     */
    String readFromInputStream(InputStream inputStream) throws IOException;
}

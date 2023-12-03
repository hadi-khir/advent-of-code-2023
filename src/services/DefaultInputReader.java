package services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class DefaultInputReader implements InputReader {

    /** {@inheritDoc} */
    @Override
    public String readInput(String filePath) throws IOException {


        StringBuilder resultStringBuilder = new StringBuilder();

        InputStream inputStream = getClass().getResourceAsStream(filePath);
        assert inputStream != null;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {

            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
        }

        return resultStringBuilder.toString();
    }
}

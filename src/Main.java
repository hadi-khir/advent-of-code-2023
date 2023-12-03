import calibration.Calibration;
import cubeconundrum.CubeConundrum;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Calibration calibration = new Calibration();
        calibration.partOne();
        calibration.partTwo();

        CubeConundrum cubeConundrum = new CubeConundrum();
        cubeConundrum.partOne();
        cubeConundrum.partTwo();
    }
}
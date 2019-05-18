import screens.CelsiusScreen;
import screens.FahrenheitScreen;
import screens.KelvinScreen;
import sensor.TemperatureSensor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TemperatureSensor ts = new TemperatureSensor(12);
        ts.setObserver(new KelvinScreen());
        ts.setObserver(new FahrenheitScreen());
        ts.setObserver(new CelsiusScreen());
        ts.setTemperature(13);
        ts.setTemperature(-13);
    }

}

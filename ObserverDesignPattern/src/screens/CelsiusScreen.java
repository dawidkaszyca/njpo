package screens;

import observer.ObserverIO;

public class CelsiusScreen implements ObserverIO {

    private double temperatureC;

    @Override
    public void update(double temperatureCelcius) {

        this.temperatureC = temperatureCelcius;
        printTemperature();
    }

    private void printTemperature(){
        System.out.printf("The temperature is: %-6.2f %1s \n" , temperatureC,"C");
    }
}
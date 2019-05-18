package screens;

import observer.ObserverIO;

public class FahrenheitScreen implements ObserverIO {

    private double temperatureF;

    @Override
    public void update(double temperatureCelcius) {

        this.temperatureF = temperatureCelcius*1.8 +32;
        printTemperature();
    }

    private void printTemperature(){
        System.out.printf("The temperature is: %-6.2f %1s \n" , temperatureF,"F");

    }
}


package screens;

import observer.ObserverIO;

public class KelvinScreen implements ObserverIO {

    private double temperatureK;


    @Override
    public void update(double temperatureCelcius) {

        this.temperatureK = temperatureCelcius+273.15;
        printTemperature();
    }

    private void printTemperature(){
        System.out.printf("The temperature is: %-6.2f %1s \n" , temperatureK,"K");
    }
}

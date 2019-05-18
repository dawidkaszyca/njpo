package sensor;

import observer.ObserverIO;
import observer.SubjectIO;

public class TemperatureSensor implements SubjectIO {
    private double temperature;

    private java.util.ArrayList<ObserverIO> observersList=new java.util.ArrayList<ObserverIO>();

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        System.out.println("Temperature changed");
        for(ObserverIO obs : observersList){
            obs.update(temperature);
        }
    }

    @Override
    public void setObserver(ObserverIO newObserver) {
        observersList.add(newObserver);
        System.out.print("Screen added. ");
        newObserver.update(temperature);
    }

    @Override
    public void removeObserver(ObserverIO newObserver) {
        observersList.remove(newObserver);
        System.out.println("Screen removed");
    }

    public TemperatureSensor(double temperature) {
        this.temperature = temperature;
    }


}

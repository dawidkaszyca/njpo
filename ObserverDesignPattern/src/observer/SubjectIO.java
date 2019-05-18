package observer;

public interface SubjectIO {
    public void setObserver(ObserverIO newObserverIO);
    public void removeObserver(ObserverIO newObserverIO);
    public void setTemperature(double temperature);
}

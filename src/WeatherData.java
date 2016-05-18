import java.util.ArrayList;


public class WeatherData implements Subject {
	
	private ArrayList observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);

	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int i = observers.indexOf(o);
		if(0 <= i) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for (int i = 0;observers.size()>i;i++) {
			Observer observer = (Observer) observers.get(i);
			observer.update(temperature,humidity,pressure);
		}
	}
	
	public void measurementsChanged() {
		notifyObserver();
	}
	
	public void setMeasurements(float temperature ,float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = 
		
		
	}

}

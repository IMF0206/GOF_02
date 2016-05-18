
public class StaticsDisplay implements DisplayElement, Observer {
	
	private float highTemperature = 28.5f;
	private float lowTemperature = 18.6f;
	private float curTemperature;
	private Subject weatherData;
	
	StaticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.curTemperature = temp;
		if(this.highTemperature < this.curTemperature) {
			this.highTemperature = curTemperature;
		}
		else if(lowTemperature>curTemperature) {
			this.lowTemperature = this.curTemperature;
		}
		display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current Temperature: "+this.curTemperature+" degrees");
		System.out.println("Low Temperature: "+this.lowTemperature+" degrees");
		System.out.println("High Temperature: "+this.highTemperature+" degrees");
	}

}

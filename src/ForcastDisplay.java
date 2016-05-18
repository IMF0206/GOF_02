
public class ForcastDisplay implements DisplayElement, Observer {
	
	private float currentPressure = 29.29f;
	private float lastPressure;
	private Subject weatherData;
	
	ForcastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.currentPressure = this.lastPressure;
		this.lastPressure = pressure;
		display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Forcast:");
		if(this.lastPressure>this.currentPressure) {
			System.out.println("The pressure becomes higher～");
		}
		else if(this.lastPressure == this.currentPressure) {
			System.out.println("More of the same");
		}
		else {
			System.out.println("It's going to rain!!");
		}
	}

}

/**
 * Contains the daycount, weather, and rent
 */
public class Day {
	private Weather weather;
	private int dayCount;
	private byte rent;

	/**
	 * Default constructor for Day
	 */
	public Day() {
		weather = new Weather();
		dayCount = 1;
		rent = 5;
	}

	/**
	 * Returns the rent
	 */
	public byte getRent() {
		return rent;
	}

	/**
	 * Returns the number of days that has elapsed
	 */
	public int getDayCount() {
		return dayCount;
	}

	/**
	 * Returns the current weather
	 */
	public Weather getWeather() {
		return weather;
	}

	/**
	 * Sets the current weather to the current forecast and generates a new forecast.
	 * It also increments the dayCount and sets the rent for each dayCount.
	 */
	public void nextDay() {
		weather.setWeather();
		dayCount++;
		switch (dayCount) {
			case 6:
				rent = 6;
				break;
			case 11:
				rent = 8;
				break;
			case 16:
				rent = 10;
				break;
			case 21:
				rent = 15;
				break;
			case 26:
				rent = 25;
				break;
		}
	}
}

package game.engine;

import java.util.Random;

/**
 * Provides the current weather and forecast for the day
 */
public class Weather {
	private Random rand;
	private String current,
			forecast;

	/**
	 * General constructor for Weather.
	 * Set current to sunny for Day 1
	 */
	public Weather() {
		rand = new Random();
		current = "sunny";
		setForecast();
	}

	/**
	 * Returns the current weather
	 */
	public String getCurrent() {
		return current;
	}

	/**
	 * Returns the forecast
	 */
	public String getForecast() {
		return forecast;
	}

	/**
	 * Sets the current weather to the forecast
	 */
	private void setCurrent() {
		current = forecast;
	}

	/**
	 * Generates a new forecast
	 */
	private void setForecast() {
		int generator = rand.nextInt(100) + 1;

		if (generator <= 80)
			forecast = "sunny";
		else if (generator <= 95)
			forecast = "rainy";
		else
			forecast = "stormy";
	}

	/**
	 * Used for Day's nextDay function.
	 * Sets the current weather and generates new forecast.
	 */
	public void setWeather() {
		setCurrent();
		setForecast();
	}
}

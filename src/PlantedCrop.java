/**
 * A class of a crop planted on the field;
 */
public class PlantedCrop {
	private String name;
	private int day,
			daysToGrow;
	private boolean watered;

	public PlantedCrop(String name) {
		day = 0;

		switch (name.toLowerCase()) {
			case "turnip":
				daysToGrow = 4;
				break;
			case "potato":
				daysToGrow = 6;
				break;
			case "kamote":
				daysToGrow = 8;
				break;
			case "magic grass":
				daysToGrow = 4;
				break;
		}
	}

	public boolean isWatered() {
		return watered;
	}

	public void setWatered(boolean watered) {
		this.watered = watered;
	}

	public void addDay() {
		if (day < daysToGrow && watered)
			day++;
		watered = false;
	}

	public int getDaysToGrow() {
		return daysToGrow;
	}

	public int getDay() {
		return day;
	}
}

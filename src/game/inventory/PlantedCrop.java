package game.inventory;

/**
 * A class of a crop planted on the field;
 */
public class PlantedCrop {
	private String name;
	private int day,
			daysToGrow,
			harvests,
			rebear;
	private boolean watered,
					magicGrassed,
					readyToHarvest,
					harvestedOnce;

	public PlantedCrop(SeedCrop seed) {
		day = 0;

		this.name = seed.getName();
		this.harvests = seed.getHarvests();
		this.rebear = seed.getRebear();
		this.daysToGrow = seed.getDaysToGrow();

		watered = harvestedOnce = magicGrassed = readyToHarvest = false;
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

	public void magicate() {
		magicGrassed = true;
		daysToGrow += 2;
	}

	public String getName() {
		return name;
	}
}

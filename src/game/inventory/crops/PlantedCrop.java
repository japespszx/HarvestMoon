package game.inventory.crops;

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

	/**
	 * Initializes a new PlantedCrop object
	 */
	public PlantedCrop(SeedCrop seed) {
		day = 0;

		this.name = seed.getName();
		this.harvests = seed.getHarvests();
		this.rebear = seed.getRebear();
		this.daysToGrow = seed.getDaysToGrow();

		watered = harvestedOnce = magicGrassed = readyToHarvest = false;
	}

	/**
	 * Checks if the plant is magic grassed
	 */
	public boolean isMagicGrassed() {
		return magicGrassed;
	}

	/**
	 * Checks if the plant is ready to harvest
	 */
	public boolean isReadyToHarvest() {
		return readyToHarvest;
	}

	/**
	 * Checks if the plant is watered
	 */
	public boolean isWatered() {
		return watered;
	}

	/**
	 * Sets the watered state of the plant
	 */
	public void setWatered(boolean watered) {
		this.watered = watered;
	}

	/**
	 * Adjusts the variables when sleep is done
	 */
	public void nextDay() {
		if (day < daysToGrow && watered) {
			day++;
		}

		if (day == daysToGrow) {
			readyToHarvest = true;
		}

		watered = false;
	}

	/**
	 * Gets days to grow for the plant
	 */
	public int getDaysToGrow() {
		return daysToGrow;
	}

	/**
	 * Gets days grown of the plant
	 */
	public int getDay() {
		return day;
	}

	/**
	 * Use magic grass on the plant
	 */
	public void magicate() {
		magicGrassed = true;
		daysToGrow += 2;
	}

	/**
	 * Gets the name of the plant
	 */
	public String getName() {
		return name;
	}

	/**
	 * Adjusts the variables when harvesting. If plant is a multiple harvesting type, it will go back to a non-harvestable state and be ready to grown again.
	 */
	public void harvest() {
		if (harvests > 1) {
			harvests--;
			magicGrassed = false;
			readyToHarvest = false;
			day = 0;
			daysToGrow = rebear;
			watered = false;
		} else {
			name = null;
		}
	}
}

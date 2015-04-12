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

	public PlantedCrop(SeedCrop seed) {
		day = 0;

		this.name = seed.getName();
		this.harvests = seed.getHarvests();
		this.rebear = seed.getRebear();
		this.daysToGrow = seed.getDaysToGrow();

		watered = harvestedOnce = magicGrassed = readyToHarvest = false;
	}

	public boolean isMagicGrassed() {
		return magicGrassed;
	}

	public boolean isReadyToHarvest() {
		return readyToHarvest;
	}

	public boolean isWatered() {
		return watered;
	}

	public void setWatered(boolean watered) {
		this.watered = watered;
	}

	public void addDay() {
		if (day < daysToGrow && watered) {
			day++;
		}

		if (day == daysToGrow) {
			readyToHarvest = true;
		}

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

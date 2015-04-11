package game.inventory.crops;

/**
 * The crop class used for inventory and store
 */
public class SeedCrop extends ItemCrop {
	private String type;
	private int seedPrice;
	private int daysToGrow,
			rebear,
			harvests;

	/**
	 * The constructor for creating a crop seed
	 */
	public SeedCrop(String name, String type, int daysToGrow, int rebear, int harvests, int seedPrice, int sellPrice, int restore) {
		super(name, sellPrice, restore);
		this.type = type;
		this.daysToGrow = daysToGrow;
		this.rebear = rebear;
		this.harvests = harvests;
		this.seedPrice = seedPrice;
	}

	/**
	 * Returns the type of the seed
	 */
	public String getType() {
		return type;
	}

	/**
	 * Returns the days a seed needs to grow to a full crop
	 */
	public int getDaysToGrow() {
		return daysToGrow;
	}

	/**
	 * Returns the number of days a multiple harvest crop needs to rebear. Returns 0 if single harvest crop.
	 */
	public int getRebear() {
		return rebear;
	}

	/**
	 * Returns the number of times one can harvest a multiple harvest crop
	 */
	public int getHarvests() {
		return harvests;
	}

	/**
	 * Returns the price of the seed on the store
	 */
	public int getSeedPrice() {
		return seedPrice;
	}
}
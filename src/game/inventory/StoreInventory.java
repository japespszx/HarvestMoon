package game.inventory;

/**
 * The class which contains all the items for the store
 */
public class StoreInventory {
	private SeedCrop[] sc;

	/**
	 * Default constructor
	 */
	public StoreInventory() {
		sc = new SeedCrop[7];

		/*instantiate crop seeds*/
		sc[0] = new SeedCrop("turnip", "Single Harvest", 4, 0, 1, 10, 15, 5);
		sc[1] = new SeedCrop("potato", "Single Harvest", 6, 0, 1, 15, 25, 10);
		sc[2] = new SeedCrop("corn", "Multiple Harvest", 7, 3, 3, 20, 20, 10);
		sc[3] = new SeedCrop("tomato", "Multiple Harvest", 6, 3, 2, 10, 15, 5);
		sc[4] = new SeedCrop("kamote", "Single Harvest", 8, 0, 1, 70, 120, 30);
		sc[5] = new SeedCrop("eggplant", "Multiple Harvest", 5, 2, 5, 60, 30, 20);
		sc[6] = new SeedCrop("magic grass", "Single Harvest", 4, 0, 1, 5, 6, 1);
	}

	/**
	 * Returns the turnip
	 */
	public SeedCrop getTurnip() {
		return sc[0];
	}

	/**
	 * Returns the potato
	 */
	public SeedCrop getPotato() {
		return sc[1];
	}

	/**
	 * Returns the corn
	 */
	public SeedCrop getCorn() {
		return sc[2];
	}

	/**
	 * Returns the tomato
	 */
	public SeedCrop getTomato() {
		return sc[3];
	}

	/**
	 * Returns the kamote
	 */
	public SeedCrop getKamote() {
		return sc[4];
	}

	/**
	 * Returns the turnip
	 */
	public SeedCrop getEggplant() {
		return sc[5];
	}

	/**
	 * Returns the magic grass
	 */
	public SeedCrop getMagicGrass() {
		return sc[6];
	}

	/**
	 * @return The SeedCrop array which contains all SeedCrops that are sold.
	 */
	public SeedCrop[] getSc() {
		return sc;
	}

}

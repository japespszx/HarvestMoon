package game.inventory;

/**
 * The class which contains all the items for the store
 */
public class StoreInventory {
	private SeedCrop
			turnip,
			potato,
			corn,
			tomato,
			kamote,
			eggplant,
			magicGrass;

	/**
	 * Default constructor
	 */
	public StoreInventory() {
		/*instantiate crop seeds*/
		turnip = new SeedCrop("turnip", "Single Harvest", 4, 0, 1, 10, 15, 5);
		potato = new SeedCrop("potato", "Single Harvest", 6, 0, 1, 15, 25, 10);
		corn = new SeedCrop("corn", "Multiple Harvest", 7, 3, 3, 20, 20, 10);
		tomato = new SeedCrop("tomato", "Multiple Harvest", 6, 3, 2, 10, 15, 5);
		kamote = new SeedCrop("kamote", "Single Harvest", 8, 0, 1, 70, 120, 30);
		eggplant = new SeedCrop("eggplant", "Multiple Harvest", 5, 2, 5, 60, 30, 20);
		magicGrass = new SeedCrop("magic grass", "Single Harvest", 4, 0, 1, 5, 6, 1);
	}

	/**
	 * Returns the turnip
	 */
	public SeedCrop getTurnip() {
		return turnip;
	}

	/**
	 * Returns the potato
	 */
	public SeedCrop getPotato() {
		return potato;
	}

	/**
	 * Returns the corn
	 */
	public SeedCrop getCorn() {
		return corn;
	}

	/**
	 * Returns the tomato
	 */
	public SeedCrop getTomato() {
		return tomato;
	}

	/**
	 * Returns the kamote
	 */
	public SeedCrop getKamote() {
		return kamote;
	}

	/**
	 * Returns the turnip
	 */
	public SeedCrop getEggplant() {
		return eggplant;
	}

	/**
	 * Returns the magic grass
	 */
	public SeedCrop getMagicGrass() {
		return magicGrass;
	}

}

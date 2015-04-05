import java.util.HashMap;

/**
 * Class which contains all the player's items
 */
public class PlayerInventory {
	private HashMap<String, Integer> seeds;
	private HashMap<String, Integer> crops;

	/**
	 * Assigns a value to the hashmaps and the arraylist and adds default values to them
	 */
	public PlayerInventory() {
		seeds = new HashMap<>();
		crops = new HashMap<>();

		seeds.put("turnip", 0);
		seeds.put("potato", 0);
		seeds.put("corn", 0);
		seeds.put("tomato", 0);
		seeds.put("kamote", 0);
		seeds.put("eggplant", 0);
		seeds.put("magic grass", 0);

		crops.put("turnip", 0);
		crops.put("potato", 0);
		crops.put("corn", 0);
		crops.put("tomato", 0);
		crops.put("kamote", 0);
		crops.put("eggplant", 0);
		crops.put("magic grass", 0);
	}

	/**
	 * @return number of seed s in inventory
	 * @param s - name of the seed
	 */
	public int getSeedCount(String s) {
		return seeds.get(s);
	}

	/**
	 * @return number of crop s in inventory
	 * @param s - name of the crop
	 */
	public int getCropCount(String s) {
		return crops.get(s);
	}

	public void addSeed(String s) {
		seeds.replace(s, seeds.get(s) + 1);
	}

	public void subtractSeed(String s) {
		seeds.replace(s, seeds.get(s) - 1);
	}

	public void addCrop(String s) {
		crops.replace(s, crops.get(s) + 1);
	}

	public void subtractCrop(String s) {
		crops.replace(s, crops.get(s) - 1);
	}

}

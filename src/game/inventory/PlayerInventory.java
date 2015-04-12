package game.inventory;

import game.inventory.crops.FullCrop;
import game.inventory.crops.SeedCrop;
import game.inventory.tools.*;

import java.util.HashMap;

/**
 * Class which contains all the player's items
 */
public class PlayerInventory {
	private HashMap<String, SeedCrop> seeds;
	private HashMap<String, FullCrop> crops;
	private HashMap<String, Tool> tools;

	/**
	 * Assigns a value to the hashmaps and the arraylist and adds default values to them
	 */
	public PlayerInventory() {
		seeds = new HashMap<>();
		crops = new HashMap<>();
		tools = new HashMap<>();

		seeds.put("turnip", new SeedCrop("turnip", "Single Harvest", 4, 0, 1, 10, 15, 5));
		seeds.put("potato", new SeedCrop("potato", "Single Harvest", 6, 0, 1, 15, 25, 10));
		seeds.put("corn", new SeedCrop("corn", "Multiple Harvest", 7, 3, 3, 20, 20, 10));
		seeds.put("tomato", new SeedCrop("tomato", "Multiple Harvest", 6, 3, 2, 10, 15, 5));
		seeds.put("kamote", new SeedCrop("kamote", "Single Harvest", 8, 0, 1, 70, 120, 30));
		seeds.put("eggplant", new SeedCrop("eggplant", "Multiple Harvest", 5, 2, 5, 60, 30, 20));
		seeds.put("magic grass", new SeedCrop("magic grass", "Single Harvest", 4, 0, 1, 5, 6, 1));

		crops.put("turnip", new FullCrop("turnip", 15, 5));
		crops.put("potato", new FullCrop("potato", 25, 10));
		crops.put("corn", new FullCrop("corn", 20, 10));
		crops.put("tomato", new FullCrop("tomato", 15, 5));
		crops.put("kamote", new FullCrop("kamote", 120, 30));
		crops.put("eggplant", new FullCrop("eggplant", 30, 20));
		crops.put("magic grass", new FullCrop("magic grass", 6, 1));

		tools.put("hoe", new Hoe());
		tools.put("watering can", new WateringCan());
		tools.put("hammer", new Hammer());
		tools.put("sickle", new Sickle());
		/*put the axe when player buys it from store*/

	}

	public HashMap<String, FullCrop> getCrops() {
		return crops;
	}

	public HashMap<String, SeedCrop> getSeeds() {
		return seeds;
	}

	public HashMap<String, Tool> getTools() {
		return tools;
	}

	/**
	 * @param s - name of the seed
	 * @return number of seed s in inventory
	 */
	public int getSeedCount(String s) {
		return seeds.get(s).getCount();
	}

	/**
	 * @param s - name of the crop
	 * @return number of crop s in inventory
	 */
	public int getCropCount(String s) {
		return crops.get(s).getCount();
	}

	public void addSeed(String s) {
		seeds.get(s).addCount();
	}

	public void subtractSeed(String s) {
		seeds.get(s).subtractCount();
	}

	public void addCrop(String s) {
		crops.get(s).addCount();
	}

	public void subtractCrop(String s) {
		crops.get(s).subtractCount();
	}

}

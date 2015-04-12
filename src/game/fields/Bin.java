package game.fields;

import game.inventory.crops.FullCrop;
import game.player.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * Is the field where you put the crops
 */
public class Bin extends Field {

	private ArrayList<FullCrop> cropsToSell;

	/**
	 * Initializes a newly created Bin object
	 */
	public Bin(int x, int y) {
		super(x, y, 'B');
		cropsToSell = new ArrayList<>();
	}

	/**
	 * This method is used to put items inside the bin.
	 *
	 * @param crops Contains the crops in the player's inventory
	 * @param scan  Passed scanner to conserve memory
	 */
	public void openBin(HashMap<String, FullCrop> crops, Scanner scan) {
		System.out.println("What would you like to sell?");
		System.out.println("|     Crop     | In Inventory |");
		for (Entry<String, FullCrop> e : crops.entrySet()) {
			System.out.printf("|%14s|      %3d     |\n", e.getValue().getName(), e.getValue().getCount());
		}
		System.out.println();

		String s = scan.nextLine();

		if (crops.containsKey(s)) {
			/*checker if count > 0 inside the subtractCount method*/
			crops.get(s).subtractCount();
			cropsToSell.add(crops.get(s));
		} else {
			System.out.println("Crop does not exist. Press enter to continue.");
			scan.nextLine();
		}
	}

	/**
	 * Returns the current profit to be gained from the bin
	 *
	 * @return the profit
	 */
	public int getProfit() {
		int ret = 0;

		for (FullCrop crop : cropsToSell) {
			ret += crop.getSellPrice();
		}

		return ret;
	}

	/**
	 * Used to give the profit to the player
	 */
	public void giveProfit(Player p) {
		p.addMoney(getProfit());
		cropsToSell.clear();
	}
}

package game.inventory.tools;

import game.fields.PlantField;

import java.util.Scanner;

/**
 * The hoe tool's class
 */
public class Hoe extends Tool {

	/**
	 * Initializes a newly created Hoe object
	 */
	public Hoe() {
		super("hoe");
	}

	/**
	 * Tills the untilled PlantFields
	 *
	 * @param pf   - used to modify the field
	 * @param scan - used to scan line in case of wrong input
	 */
	@Override
	public void use(PlantField pf, Scanner scan) {
		if (pf.hasCrop()) {
			System.out.println("You cannot till a tile that has a crop. Press enter to continue.");
			scan.nextLine();
		} else if (!pf.isTilled()) {
			pf.setTilled(true);
		} else {
			System.out.println("This tile is already tilled. Press enter to continue.");
			scan.nextLine();
		}
	}
}

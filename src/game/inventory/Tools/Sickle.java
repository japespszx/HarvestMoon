package game.inventory.tools;

import game.fields.PlantField;

import java.util.Scanner;

/**
 * The sickle tool's class
 */
public class Sickle extends Tool {

	/**
	 * Initializes a newly created Sickle object
	 */
	public Sickle() {
		super("sickle");
	}

	/**
	 * Reaps whatever valid object is on the field
	 * @param pf - used to modify the field
	 * @param scan - used to scan next line
	 */
	@Override
	public void use(PlantField pf, Scanner scan) {
		if (pf.hasCrop()) {
			pf.setCrop(null);
		} else {
			System.out.println("There is no object to reap here. Press enter to continue.");
			scan.nextLine();
		}
	}
}

package game.inventory.tools;

import game.fields.PlantField;

import java.util.Scanner;

/**
 * Created by John Paul San Pedro on 4/12/2015.
 */
public class WateringCan extends Tool {
	private int uses;

	/**
	 * Initializes a newly created WateringCan object
	 */
	public WateringCan() {
		super("watering can");
		uses = 10;
	}

	@Override
	public void use(PlantField pf, Scanner scan) {
		if (uses > 0 && pf.hasCrop()) {
			uses--;
			pf.getCrop().setWatered(true);
		} else if (pf.hasCrop()) {
			System.out.println("You don't have water anymore. Press enter to continue.");
			scan.nextLine();
		} else {
			System.out.println("There is no crop to be watered here. Press enter to continue.");
			scan.nextLine();
		}
	}

	private void fill() {
		uses = 10;
	}
}

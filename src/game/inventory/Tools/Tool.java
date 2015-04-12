package game.inventory.tools;

import game.fields.PlantField;

import java.util.Scanner;

/**
 * The class for tools
 */
public abstract class Tool {
	private String name;

	/**
	 * Initializes a newly created Tool object
	 */
	public Tool(String name) {
		this.name = name;
	}

	/**
	 * Returns the name of the tool
	 *
	 * @return name of the tool
	 */
	public String getName() {
		return name;
	}

	/**
	 * Uses the tool
	 *
	 * @param pf   - used to modify the field
	 * @param scan - used to scan line in case of wrong input
	 */
	public abstract void use(PlantField pf, Scanner scan);
}

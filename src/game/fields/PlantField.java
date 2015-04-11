package game.fields;

import game.inventory.PlantedCrop;
import game.player.Player;

/**
 * The field used for the plantable portion of the map
 */
public class PlantField extends Field {
	private PlantedCrop crop;
	private boolean tilled; /*checks if the field is tilled*/

	/**
	 * Default constructor
	 */
	public PlantField(int x, int y) {
		super(x, y, '-');

		crop = null;
		tilled = false;
	}

	/**
	 * Return whether there is a plant on the field or not
	 */
	public boolean hasPlant() {
		return crop != null;
	}

	/**
	 * Return the planted crop
	 */
	public PlantedCrop getCrop() {
		return crop;
	}

	/**
	 * Sets a crop on the field
	 */
	public void setCrop(PlantedCrop crop) {
		this.crop = crop;
	}

	/**
	 * Returns whether the unplanted field is tilled or not
	 */
	public boolean isTilled() {
		return tilled;
	}

	/**
	 * Sets the field to tilled or not
	 */
	public void setTilled(boolean tilled) {
		this.tilled = tilled;
	}

	/**
	 * Updates the field depending on the condition
	 */
	public void updateField(Player p) {
		/*if player is on the same coords as this field*/
		if (p.getX() == this.getX() && p.getY() == this.getY())
			setCurDisplay('v');
		else if (!tilled && !hasPlant())/*if player is not on this field*/
			setCurDisplay('-');
		else if (!hasPlant())
			setCurDisplay('~');
		else if (hasPlant()) {
			if (crop.getDay() == 0) {
				setCurDisplay(':');
			} else {
				if (crop.isWatered()) {
					switch (crop.getName()) {
						case "turnip":
							setCurDisplay('T');
							break;
						case "potato":
							setCurDisplay('P');
							break;
						case "corn":
							setCurDisplay('M');
							break;
						case "tomato":
							setCurDisplay('K');
							break;
						case "kamote":
							setCurDisplay('C');
							break;
						case "eggplant":
							setCurDisplay('M');
							break;
						case "magic grass":
							setCurDisplay('G');
							break;
					}
				} else {
					switch (crop.getName()) {
						case "turnip":
							setCurDisplay('t');
							break;
						case "potato":
							setCurDisplay('p');
							break;
						case "corn":
							setCurDisplay('m');
							break;
						case "tomato":
							setCurDisplay('k');
							break;
						case "kamote":
							setCurDisplay('c');
							break;
						case "eggplant":
							setCurDisplay('m');
							break;
						case "magic grass":
							setCurDisplay('g');
							break;
					}
				}
			}
		}
	}
}

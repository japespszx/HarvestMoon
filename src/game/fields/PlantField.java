package game.fields;

import game.inventory.PlantedCrop;
import game.player.Player;

/**
 * The field used for the plantable portion of the map
 */
public class PlantField extends Field {
	private PlantedCrop crop;
	private boolean tilled; /*checks if the field is tilled*/
	private boolean planted; /*checks if the field has a plant on it*/

	/**
	 * Default constructor
	 */
	public PlantField(int x, int y) {
		super(x, y, '-');

		crop = null;
		tilled = false;
		planted = false;
	}

	/**
	 * Return whether there is a plant on the field or not
	 */
	public boolean hasPlant() {
		return planted;
	}

	/**
	 * Sets the planted to true or false
	 */
	public void setPlanted(boolean planted) {
		this.planted = planted;
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
			setCurDisplay((char) 0x2202);
		else if (!tilled && !planted)/*if player is not on this field*/
			setCurDisplay('-');
		else if (!planted)
			setCurDisplay('~');
		else if (crop.isWatered()) {
			/*put something here*/
			;
		}
	}
}

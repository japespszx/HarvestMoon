package game.fields;

import game.player.*;

/**
 * The superclass of all fields
 */
public abstract class Field {
	private char defDisplay, curDisplay;
	private int x, y;

	/**
	 * @param x          x coord of the field
	 * @param y          y coord of the field
	 * @param defDisplay default display of the field
	 */
	public Field(int x, int y, char defDisplay) {
		this.x = x;
		this.y = y;
		this.defDisplay = this.curDisplay = defDisplay;
	}

	/**
	 * @return x coord of the field
	 */
	public int getX() {
		return x;
	}

	/**
	 * @return y coord of the field
	 */
	public int getY() {
		return y;
	}

	/**
	 * @return character to be displayed
	 */
	public char getCurDisplay() {
		return curDisplay;
	}

	/**
	 * @param curDisplay of the field
	 */
	public void setCurDisplay(char curDisplay) {
		this.curDisplay = curDisplay;
	}

	/**
	 * Updates the field elements depending on the player's location
	 */
	public void updateField(Player p) {
		/*if player is on the same coords as this field*/
		if (p.getX() == this.x && p.getY() == this.y)
			curDisplay = 'v';
		else /*if player is not on this field*/
			curDisplay = defDisplay;
	}
}

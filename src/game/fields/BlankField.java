package game.fields;

/**
 * Used for blank spaces in the displayed field
 */
public class BlankField extends Field {
	/**
	 * Only constructor for BlankField
	 */
	public BlankField(int x, int y) {
		super(x, y, ' ');
	}
}

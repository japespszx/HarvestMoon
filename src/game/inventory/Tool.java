package game.inventory;

/**
 * Created by John Paul San Pedro on 02/27/2015.
 */
public class Tool {
	private String name;
	private boolean equipped;

	/**
	 * General constructor
	 */
	public Tool(String name) {
		this.name = name;
		equipped = false;
	}

	/**
	 * Checker if tool is equipped or not
	 *
	 * @return equipped
	 */
	public boolean isEquipped() {
		return equipped;
	}

	/**
	 * sets any equipped weapon to false
	 *
	 * @param equipped - the value whether item is equipped or not
	 */
	public void setEquipped(boolean equipped) {
		this.equipped = equipped;
	}
}

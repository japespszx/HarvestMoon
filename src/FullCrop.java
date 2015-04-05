/**
 * Fully grown crop class.
 */
public class FullCrop {
	private String name;
	private int sellPrice;
	private int staminaRestored;
	private int has;

	public FullCrop(String name, int sellPrice, int staminaRestored) {
		this.name = name;
		this.sellPrice = sellPrice;
		this.staminaRestored = staminaRestored;
		has = 0;
	}

	public int getStaminaRestored() {
		return staminaRestored;
	}

	public int getSellPrice() {
		return sellPrice;
	}

	public int getHas() {
		return has;
	}

	public void addHas() {
		has++;
	}

	public void subtractHas() {
		if (has > 0)
			has--;
		else
			System.out.println("You have no more " + name + ".");
	}
}

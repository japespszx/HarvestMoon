package game.inventory.crops;

/**
 * Superclass for crops that can be put inside the inventory
 */
public abstract class ItemCrop {
	private String name;
	private int sellPrice;
	private int staminaRestored;
	private int count;

	public ItemCrop(String name, int sellPrice, int staminaRestored) {
		this.name = name;
		this.sellPrice = sellPrice;
		this.staminaRestored = staminaRestored;
		this.count = 0;
	}

	public ItemCrop(String name, int sellPrice, int staminaRestored, int count) {
		this.name = name;
		this.sellPrice = sellPrice;
		this.staminaRestored = staminaRestored;
		this.count = count;
	}

	public String getName() {
		return name;
	}

	public int getSellPrice() {
		return sellPrice;
	}

	public int getStaminaRestored() {
		return staminaRestored;
	}

	public int getCount() {
		return count;
	}

	public void addCount() {
		count++;
	}

	public void subtractCount() {
		count--;
	}
}

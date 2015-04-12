package game.fields;

import game.inventory.StoreInventory;

/**
 * Created by John Paul San Pedro on 3/1/2015.
 */
public class Store extends Field {
	private char display;
	private int x, y;
	private StoreInventory inventory;

	public Store(int x, int y) {
		super(x, y, 'S');
		inventory = new StoreInventory();
	}

	public StoreInventory getInventory() {
		return inventory;
	}


}

package game.player;

import game.engine.Day;
import game.fields.Field;
import game.fields.PlantField;
import game.inventory.PlantedCrop;
import game.inventory.PlayerInventory;

/**
 * The player class
 */
public class Player {
	private String name;
	private int curStamina,
			maxStamina,
			profit,
			money,
			x, y; /*coordinates*/
	private PlayerInventory inventory;
	private String curTool;
	private boolean hasAxe;


	/**
	 * The only constructor of this class.
	 * It needs a name to be instantiated
	 */
	public Player(String name) {
		this.name = name;
		curStamina = maxStamina = 25;
		money = 100;
		profit = 0;
		inventory = new PlayerInventory();
		hasAxe = false;

		/*coordinates just outside the house*/
		x = 8;
		y = 3;
	}

	/**
	 *
	 * @return name of tool equipped
	 */
	public String getCurTool() {
		return curTool;
	}

	/**
	 *
	 * @return if player does or does not have an axe
	 */
	public boolean hasAxe() {
		return hasAxe;
	}

	public void buyAxe() {
		money -= 40;
		hasAxe = true;
	}

	public void setCurTool(String s) {
		switch (s) {
			case "hoe":
			case "watering can":
			case "hammer":
			case "sickle":
				curTool = s;
				break;
			case "axe":
				if (hasAxe)
					curTool = s;
		}
	}

	/**
	 * Returns the value of name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the current stamina
	 */
	public int getCurStamina() {
		return curStamina;
	}

	/**
	 * Returns the inventory
	 */
	public PlayerInventory getInventory() {
		return inventory;
	}

	/**
	 * Returns the max stamina
	 */
	public int getMaxStamina() {
		return maxStamina;
	}

	/**
	 * Adds 10 to max stamina when buying vitamins
	 */
	public void addMaxStamina() {
		maxStamina += 10;
	}
	//
	//	public int setProfit() {
	//
	//	}

	/**
	 * If this returns false, the player cannot pay the rent anymore and the game will end
	 */
	public boolean canPayRent(Day day) {
		return money - day.getRent() >= 0;
	}

	/**
	 * Returns true if player is in the store
	 */
	public boolean isInStore() {
		return x >= 1 && x <= 3 && y >= 0 && y <= 2;
	}

	/**
	 * Returns true if player is in the house
	 */
	public boolean isInHouse() {
		return y >= 0 && y <= 2 && x >= 6 && x <= 9;
	}

	/**
	 * Returns true if player is in the bin
	 */
	public boolean isInBin() {
		return y >= 0 && y <= 2 && x == 11;
	}

	/**
	 * Returns true if player is in the pond
	 */
	public boolean isInPond() {
		return y >= 0 && y <= 2 && x >= 14 && x <= 18;
	}

	/**
	 * Returns true if player is in the farm
	 */
	public boolean isInFarm() {
		return y >= 5;
	}

	/**
	 * Returns the y coord of the player
	 */
	public int getY() {
		return y;
	}

	/**
	 * Sets the y coord of the player
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * Returns the x coord of the player
	 */
	public int getX() {
		return x;
	}

	/**
	 * Sets the x coord of the player
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * Returns the money that the player has
	 */
	public int getMoney() {
		return money;
	}

	/**
	 * Adds money to player
	 * @param x - amount of money to add
	 */
	public void addMoney(int x) {
		money += x;
	}

	/**
	 * Subtracts money from player
	 * @param x - amount of money to subtract
	 */
	public void subtractMoney(int x) {
		money -= x;
	}

	/**
	 * Returns the profit from the bin
	 */
	public int getProfit() {
		return profit;
	}

	/**
	 * Player plants a crop on the field he is standing on
	 */
	public void plantCrop(String plant, Field[][] field) {
		PlantField one = (PlantField) field[y][x];
		one.setPlanted(true);
		one.setCrop(new PlantedCrop(plant));
	}

	/**
	 * Uses whatever tool is equipped on the player
	 */
	public void useTool(Field[][] field) {

	}
}

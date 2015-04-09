package game.fields;

import game.inventory.StoreInventory;
import game.player.Player;

import java.util.Scanner;

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

	public void openStore(Player p, Scanner scan) {
		switch (scan.nextLine()) {
			case "turnip":
				if (p.getMoney() >= inventory.getTurnip().getSeedPrice()) {
					p.subtractMoney(inventory.getTurnip().getSeedPrice());
					p.getInventory().addSeed("turnip");
				} else
					System.out.println("Not enough money.");
				break;
			case "potato":
				if (p.getMoney() >= inventory.getPotato().getSeedPrice()) {
					p.subtractMoney(inventory.getPotato().getSeedPrice());
					p.getInventory().addSeed("potato");
				} else
					System.out.println("Not enough money.");
				break;
			case "corn":
				if (p.getMoney() >= inventory.getCorn().getSeedPrice()) {
					p.subtractMoney(inventory.getCorn().getSeedPrice());
					p.getInventory().addSeed("corn");
				} else
					System.out.println("Not enough money.");
				break;
			case "tomato":
				if (p.getMoney() >= inventory.getTomato().getSeedPrice()) {
					p.subtractMoney(inventory.getTomato().getSeedPrice());
					p.getInventory().addSeed("tomato");
				} else
					System.out.println("Not enough money.");
				break;
			case "kamote":
				if (p.getMoney() >= inventory.getKamote().getSeedPrice()) {
					p.subtractMoney(inventory.getKamote().getSeedPrice());
					p.getInventory().addSeed("kamote");
				} else
					System.out.println("Not enough money.");
				break;
			case "eggplant":
				if (p.getMoney() >= inventory.getEggplant().getSeedPrice()) {
					p.subtractMoney(inventory.getEggplant().getSeedPrice());
					p.getInventory().addSeed("eggplant");
				} else
					System.out.println("Not enough money.");
				break;
			case "magic grass":
				if (p.getMoney() >= inventory.getMagicGrass().getSeedPrice()) {
					p.subtractMoney(inventory.getMagicGrass().getSeedPrice());
					p.getInventory().addSeed("magic grass");
				} else
					System.out.println("Not enough money.");
				break;
			case "axe":
				if (!p.hasAxe()) {
					if (p.getMoney() >= 40) {
						p.buyAxe(); /*already includes money deduction*/
					} else {
						System.out.println("Not enough money.");
					}
				} else
					System.out.println("You already have an axe.");

				break;
			case "vitamins":
				if (p.getMoney() >= 30) {
					p.subtractMoney(30);
					p.addMaxStamina();
				}
			default:
				System.out.println("Invalid item.");
		}
	}
}

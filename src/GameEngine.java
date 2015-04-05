import java.io.IOException;
import java.util.Scanner;

/**
 * This is where the game runs.
 */
public class GameEngine {
	public void Begin() throws IOException {
		StringBuilder out = new StringBuilder();
		Scanner scan = new Scanner(System.in);
		Day day = new Day();
		DisplayMap map = new DisplayMap();
		Player p; /*uninstantiated*/

		System.out.print("Enter your name: ");
		p = new Player(scan.nextLine());

		for (; ; ) {
			out.append("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			map.updateField(p);

			for (int i = 0; i < 16; i++) {
				for (int j = 0; j < 20; j++) {
					out.append(map.getField()[i][j].getCurDisplay());
				}
				out.append("\n");
			}

			out.append("Stamina: " + p.getCurStamina() + "/" + p.getMaxStamina() + "\t" + "Money: " + p.getMoney() + '\t' + "Day: " + day.getDayCount());

			System.out.println(out);
			out.setLength(0);

			switch (scan.nextLine().toLowerCase()) {
				case "w":
					if (p.getY() - 1 >= 0)
						p.setY(p.getY() - 1);
					break;
				case "a":
					if (p.getX() - 1 >= 0)
						p.setX(p.getX() - 1);
					break;
				case "s":
					if (p.getY() + 1 <= 15)
						p.setY(p.getY() + 1);
					break;
				case "d":
					if (p.getX() + 1 <= 19)
						p.setX(p.getX() + 1);
					break;
				case "buy":
					if (p.isInStore()) {
						((Store)map.getField()[p.getX()][p.getY()]).openStore(p, scan);
					} else
						System.out.println("You are not in the store.");
					break;
//				case "turnip":
//					if (p.getMoney() >= 10 && p.isInStore()) {
//						p.setMoney(p.getMoney() - 10);
//						p.getInventory().getSeeds().replace("turnip", p.getInventory().getSeeds().get("turnip") + 1);
//					} else if (p.getMoney() < 10 && p.isInStore())
//						out.append("You have not enough money\n");
//					else if (!p.isInStore())
//						out.append("You are not in the store\n");
//					else if (p.isInFarm() && p.getInventory().getSeeds().get("turnip") > 0) {
//						p.getInventory().getSeeds().replace("turnip", p.getInventory().getSeeds().get("turnip") - 1);
//						p.plantCrop("turnip", tempMap);
//					} else if (p.isInFarm() && p.getInventory().getSeeds().get("turnip") == 0) {
//						out.append("You have no " + input + "in the inventory\n");
//					}
//					break;

				case "sleep":
					if (p.isInHouse()) {

					} else
						System.out.println("You are not inside the house.");
					break;
				default:
					out.append("Invalid command.\n");
			}
		}
	}
}

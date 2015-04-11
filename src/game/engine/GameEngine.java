package game.engine;

import game.fields.Store;
import game.player.Player;

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
						((Store) map.getField()[p.getY()][p.getX()]).openStore(p, scan);
					} else
						System.out.println("You are not in the store.");
					break;
				case "plant":
					if (p.isInPlantField()) {
						p.plantCrop(map.getField(), scan);
					}
					break;
				case "equip":
					p.equipTool(scan);
					break;
				case "sleep":
					if (p.isInHouse()) {

					} else
						System.out.println("You are not in the house.");
					break;
				default:
					out.append("Invalid command.\n");
			}
		}
	}
}

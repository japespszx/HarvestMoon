package game.engine;

import game.fields.*;
import game.player.Player;

import java.util.Scanner;

/**
 * Displays the map.
 */
public class DisplayMap {
	private Field[][] field;

	/**
	 * Constructs the map
	 */
	public DisplayMap() {
		Scanner sc = new Scanner(System.in);
		/*Instantiate map.
		* X and Y values are inverted in arrays hence the inverted placement in object instantiation*/
		field = new Field[16][20];
		for (int i = 0; i < 3; i++) {
			field[i][0] = new BlankField(0, i);

			for (int j = 1; j < 4; j++) {
				field[i][j] = new Store(j, i);
			}

			field[i][4] = new BlankField(4, i);
			field[i][5] = new BlankField(5, i);


			for (int j = 6; j < 10; j++) {
				field[i][j] = new House(j, i);
			}

			field[i][10] = new BlankField(10, i);

			field[i][11] = new Bin(11, i);

			field[i][12] = new BlankField(12, i);
			field[i][13] = new BlankField(13, i);

			for (int j = 14; j < 19; j++) {
				field[i][j] = new Pond(j, i);
			}

			field[i][19] = new BlankField(19, i);
		}

		for (int i = 3; i < 5; i++) {
			for (int j = 0; j < 20; j++) {
				field[i][j] = new BlankField(j, i);
			}
		}

		for (int i = 5; i < 16; i++) {
			for (int j = 0; j < 20; j++) {
				field[i][j] = new PlantField(j, i);
			}
		}
	}

	/**
	 * Returns the map
	 */
	public Field[][] getField() {
		return field;
	}

	/**
	 * Updates all fields in the map
	 */
	public void updateField(Player c) {
		for (int i = 0; i < 16; i++) {
			for (int j = 0; j < 20; j++) {
				field[i][j].updateField(c);
			}
		}
	}

	/**
	 * Updates all the crops in each plant field when the player sleeps
	 */
	public void nextDay() {
		for (int i = 5; i < 16; i++) {
			for (int j = 0; j < 20; j++) {
				((PlantField) field[i][j]).getCrop().nextDay();
			}
		}
	}
}

package game.fields;

/**
 * Created by John Paul San Pedro on 3/1/2015.
 */
public class Pond extends Field {
	private char display;
	private int x, y;

	public Pond(int x, int y) {
		super(x, y, 'P');
	}
}

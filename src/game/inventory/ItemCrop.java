package game.inventory;

/**
 * Created by student on 4/8/2015.
 */
public abstract class ItemCrop {
    private String name;
    private int sellPrice;
    private int staminaRestored;

    public ItemCrop(String name, int sellPrice, int staminaRestored) {
        this.name = name;
        this.sellPrice = sellPrice;
        this.staminaRestored = staminaRestored;
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
}

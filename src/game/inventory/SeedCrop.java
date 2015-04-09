package game.inventory;

/**
 * The crop class used for inventory and store
 */
public class SeedCrop {
    private String name;
    private String type;
    private int seedPrice;
    private int daysToGrow,
            rebear,
            harvests,
            sellPrice,
            restore,
            has; /*to see how many crops the player has*/
    /**
     * The constructor for creating a crop seed
     */
    public SeedCrop(String name, String type, int daysToGrow, int rebear, int harvests, int seedPrice, int sellPrice, int restore) {
        this.name = name;
        this.type = type;
        this.daysToGrow = daysToGrow;
        this.rebear = rebear;
        this.harvests = harvests;
        this.seedPrice = seedPrice;
        this.sellPrice = sellPrice;
        this.restore = restore;
        this.has = 0; /*set to 0 because the player doesn't have any initially and store doesn't really need this variable*/
    }

    /**
     * Returns the name of the seed
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the type of the seed
     */
    public String getType() {
        return type;
    }

    /**
     * Returns the days a seed needs to grow to a full crop
     */
    public int getDaysToGrow() {
        return daysToGrow;
    }

    /**
     * Returns the number of days a multiple harvest crop needs to rebear. Returns 0 if single harvest crop.
     */
    public int getRebear() {
        return rebear;
    }

    /**
     * Returns the number of times one can harvest a multiple harvest crop
     */
    public int getHarvests() {
        return harvests;
    }

    /**
     * Returns the price of the seed on the store
     */
    public int getSeedPrice() {
        return seedPrice;
    }

    /**
     * Returns the profit you get when you put it in the bin
     */
    public int getSellPrice() {
        return sellPrice;
    }

    /**
     * Returns the amount of stamina you get when you consume the fully grown crop
     */
    public int getRestore() {
        return restore;
    }

    /**
     * Returns the amount of the specific crop a player has. Store does not use this variable
     */
    public int getHas() {
        return has;
    }

    /**
     * Adds one of the crop to the inventory when buying
     */
    public void addHas() {
        has++;
    }

    /**
     * Subtracts a crop from the inventory when planting
     */
    public void subtractHas() {
        has--;
    }
}
public class GrandmaHouse extends House {
    protected Cupboard mCupboard = null;
    public Cupboard getCupboard() {
        return this.mCupboard;
    }
    
    // Public constructor for a concrete class
    public GrandmaHouse(String name) {
        super(name);
        this.mDoor = new Door(this.mName + "'s door");
        this.mBed = new Bed(this.mName + "'s bed");
        this.mCupboard = new Cupboard(this.mName + "'s cupboard");
        this.mRoof = new Roof(this.mName + "'s roof");
    }
}
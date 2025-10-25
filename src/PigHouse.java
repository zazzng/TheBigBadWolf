public class PigHouse extends House {
    public PigHouse(String name) {
        super(name);
        this.mDoor = new Door(this.mName + "'s door");
        this.mBed = new Bed(this.mName + "'s bed");
        this.mRoof = new Roof(this.mName + "'s roof");
    }
}

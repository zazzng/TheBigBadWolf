public class House extends Place {
    protected Door mDoor = null;
    public Door getDoor() {
        return this.mDoor;
    }
    
    protected Bed mBed = null;
    public Bed getBed() {
        return this.mBed;
    }

    public House(String name) {
        super(name);
    }
    
}

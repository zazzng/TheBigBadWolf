public class House extends PlayObject {
    protected Door mDoor = null;
    public Door getDoor() {
        return this.mDoor;
    }
    
    protected Bed mBed = null;
    public Bed getBed() {
        return this.mBed;
    }
    
    protected Roof mRoof = null;
    public Roof getRoof() {
        return this.mRoof;
    }
    
    // Protected constructor that is called by its child class
    protected House(String name) {
        super(name);
    }  
}

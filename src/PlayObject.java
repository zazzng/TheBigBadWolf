public abstract class PlayObject {
    // Fields
    protected String mName = null;
    public String getName() {
        return this.mName;
    }
    
    // Protected constructor that is called by its child class
    protected PlayObject(String name) {
        this.mName = name;
    }
}

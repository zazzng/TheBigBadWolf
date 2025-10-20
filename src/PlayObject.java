public abstract class PlayObject {
    //fields
    protected String mName = null;
    public String getName() {
        return this.mName;
    }
    
    //protected constructor that is called by its child class
    protected PlayObject(String name) {
        this.mName = name;
    }
}

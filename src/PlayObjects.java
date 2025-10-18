public abstract class PlayObjects {
    //fiels
    protected String mName = null;
    public String getName() {
        return this.mName;
    }
    
    //protected constructor that is called by its child class
    protected PlayObjects(String name) {
        this.mName = name;
    }
}

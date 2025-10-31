public class Woods extends PlayObject {
    //fields
    protected Tree mTree = null;
    public Tree getTree() {
        return this.mTree;
    }
    
    // Public constructor for a concrete class
    public Woods(String name) {
        super(name);
        this.mTree = new Tree("tree");
    }
}
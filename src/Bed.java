public class Bed extends PlayObject {
    protected Blanket mBlanket = null;
    public Blanket getBlanket() {
        return this.mBlanket;
    }
    
    // Public constructor for a concrete class
    public Bed(String name) {
        super(name);
        this.mBlanket = new Blanket("blanket");
    }
}

public class Bed extends PlayObject {
    protected Blanket mBlanket = null;
    public Blanket getBlanket() {
        return this.mBlanket;
    }
    
    public Bed(String name) {
        super(name);
        this.mBlanket = new Blanket("blanket");
    }
}

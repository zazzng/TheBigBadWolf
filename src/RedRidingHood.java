public class RedRidingHood extends Moveable{
    // Public constructor for a concrete class
    public RedRidingHood(String name) {
        super(name);
    }
    
    @Override
    public void playMusicalInstrument() {
        String s = this.mName + " plays the piano.";
        System.out.println(s);
    }

    public void surprise() {
        String s = this.mName + " surprise.";
        System.out.println(s);
    }
}

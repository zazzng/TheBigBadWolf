public class RedRidingHood extends CharactersWithInstruments {
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
        String s = this.mName + " is surprised.";
        System.out.println(s);
    }
}

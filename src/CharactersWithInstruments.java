public abstract class CharactersWithInstruments extends Moveable {
    // Protected constructor that is called by its child class
    protected CharactersWithInstruments(String name) {
        super(name);
    }
    
    // abtract method
    public abstract void playMusicalInstrument();
}

public class SecondPig extends Pig{
    // Public constructor for a concrete class
    public SecondPig(String name) {
        super(name);
    }

    @Override
    public void playMusicalInstrument() {
        String s = this.mName + " plays his fiddle.";
        System.out.println(s);
    }
}

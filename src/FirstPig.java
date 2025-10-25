public class FirstPig extends Pig{
    // Public constructor for a concrete class
    public FirstPig(String name) {
        super(name);
    }

    @Override
    public void playMusicalInstrument() {
        String s = this.mName + " plays his flute.";
        System.out.println(s);
    }
}

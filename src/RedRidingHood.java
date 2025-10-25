public class RedRidingHood extends Moveable{
    
    public RedRidingHood(String name) {
        super(name);
    }
    
    @Override
    public void playMusicalInstrument() {
        String s = this.mName + " plays the piano.";
        System.out.println(s);
    }
    
    public void surprised() {
        String s = this.mName + " is surprised.";
        System.out.println(s);
    }
}

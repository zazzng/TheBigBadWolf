public class RedRidingHood extends Moveable{
    
    public RedRidingHood(String name) {
        super(name);
    }
    
    public void playMusicalInstrument() {
        String s = this.mName + " plays the piano.";
        System.out.println(s);
    }
}

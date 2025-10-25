public class RedRidingHood extends Moveable{
    
    public RedRidingHood(String name) {
        super(name);
    }
    
    public void playMusicalInstrument() {
        String s = this.mName + " plays the piano.";
        System.out.println(s);
    }
    //can I do surprise and ask or divide it into surprise / ask
    public void surprise() {
        String s = this.mName + " surprise.";
        System.out.println(s);
    }
}

public class ThirdPig extends Pig{
    // Public constructor for a concrete class
    public ThirdPig(String name) {
        super(name);
    }
    
    @Override
    public void playMusicalInstrument() {
        String s = this.mName + " plays the piano.";
        System.out.println(s);
    }
    
    public void buildHouse() {
        String s = this.mName + " builds his house of stones and bricks.";
        System.out.println(s);
    }
    
    public void packEquipment() {
        String s = this.mName + " packs equipment into his bag.";
        System.out.println(s);
    }
    
    public void tiptoeTo(PlayObject po) {
        String s = this.mName + " tiptoes to " + po.getName();
        System.out.println(s);
    }
    
    public void putStuffs(PlayObject po1, PlayObject po2, Moveable subject) {
        String s = this.mName + " puts " + po1.getName() + " and " +
            po2.getName() + " into " + subject.getName() + "'s pants.";
        System.out.println(s);
    }
}

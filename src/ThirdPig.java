public class ThirdPig extends Pig{

    public ThirdPig(String name) {
        super(name);
    }
    
    @Override
    public void playMusicalInstrument() {
        String s = this.mName + " plays his piano.";
        System.out.println(s);
    }
    
    public void buildHouse() {
        String s = this.mName + " builds his house of stones and bricks.";
        System.out.println(s);
    }
    
    public void attack(PlayObject po) {
        String s = this.mName + " puts pop corn and hot coal into " + po + 
            "'s pants.";
        System.out.println(s);
    }
}

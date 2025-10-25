public abstract class Moveable extends PlayObject{
    // Protected constructor that is called by its child class
    protected Moveable(String name) {
        super(name);
    }
    
    public void walkTo(PlayObject po) {
        String s = this.mName + " walks to " + po.getName() + ".";
        System.out.println(s);
    }
    
    public void runAwayTo(PlayObject po, boolean towards){
        // prints the type of running the character po is doing
        String s;
        if (po == null) {
            s = this.mName + " runs away.";
        } else if (!towards) {
            s = this.mName + " runs around " + po.getName() + ".";
        } else {
            s = this.mName + " runs to " + po.getName() + ".";
        }
        System.out.println(s);
    }
    
    private void speak(String speechType, String something) {
        String s = this.mName + " " + speechType + ", \"" + something + "\"";
        System.out.println(s);
    }
    
    public void say(String something) {
        this.speak("says", something);
    }
    
    public void ask(String something) {
        this.speak("asks", something);
    }
    
    public void answer(String something) {
        this.speak("answers", something);
    }
    
    public void sing(String something) {
        this.speak("sings", something);
    }
    
    public void laugh() {
        String s = this.mName + " laughs.";
        System.out.println(s);
    }
    
    public void dance() {
        String s = this.mName + " dances.";
        System.out.println(s);
    }
    
    public void knock(PlayObject po) {
        String s = this.mName + " knocks on " + po.getName() + ".";
        System.out.println(s);
    }
    
    public void enter(PlayObject po) {
        String s = this.mName + " enters " + po.getName() + ".";
        System.out.println(s);
    }
    
    public void hide(String preposition, PlayObject po) {
        String s = this.mName + " hides " + preposition + " " + 
            po.getName() + ".";
        System.out.println(s);
    }
    
    // Abstract method for its subclass to override later
    public void playMusicalInstrument() {}
}

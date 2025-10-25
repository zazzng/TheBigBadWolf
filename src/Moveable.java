public abstract class Moveable extends PlayObject{
    
    public Moveable(String name) {
        super(name);
    }
    
    public void walkTo(PlayObject po) {
        String s = this.mName + " walks to " + po.getName() + ".";
        System.out.println(s);
    }
    
    public void runAwayTo(PlayObject po, boolean away){
        String s = null;
        if (po == null) {
            s = this.mName + " runs away.";
        } else if (!away) {
            s = this.mName + " runs around " + po.getName() + ".";
        } else {
            s = this.mName + " runs to " + po.getName() + ".";
        }
        
        System.out.println(s);
    }
    
    public void say(String something) {
        String s = this.mName + " says, \"" + something + "\"";
        System.out.println(s);
    }
    
    public void ask(String something) {
        String s = this.mName + " asks, \"" + something + "\"";
        System.out.println(s);
    }
    
    // Q: do we need this or can we just use say()
    public void answer(String something) {
        String s = this.mName + " answers, \"" + something + "\"";
        System.out.println(s);
    }
    
    public void laugh() {
        String s = this.mName + " laughs.";
        System.out.println(s);
    }
    
    public void dance() {
        String s = this.mName + " dances.";
        System.out.println(s);
    }
    
    public void sing(String something) {
        String s = this.mName + " sings, \"" + something + "\"";
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
    
    public void close(PlayObject po) {
        String s = this.mName + " closes " + po.getName() + ".";
        System.out.println(s);
    }
    
    public void hide(String preposition, PlayObject po) {
        String s = this.mName + " hides " + preposition + " " + 
            po.getName() + ".";
        System.out.println(s);
    }
    
    public void chase(PlayObject po) {
        String s = this.mName + " chases " + po.getName() + ".";
        System.out.println(s);
    }
    
    //dummy method for its subclass override later
    public void playMusicalInstrument(){
        
    }
}

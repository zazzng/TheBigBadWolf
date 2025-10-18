public abstract class Moveable extends PlayObjects{
    
    public Moveable(String name) {
        super(name);
    }
    
    public void walkTo(PlayObjects po) {
        String s = this.mName + " walk to " + po.getName();
        System.out.println(s);
    }
    
    public void visit(String something) {
        String s = this.mName + " visits " + something + ".";
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
    
    public void answer(String something) {
        String s = this.mName + " answers, \"" + something + "\"";
        System.out.println(s);
    }
    
    
    
    
}

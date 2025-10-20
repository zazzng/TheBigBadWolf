public class Grandma extends Moveable {
    
    public Grandma(String name) {
        super(name);
    }
    
    public void knit() {
        String s = this.mName + " knits.";
        System.out.println(s);
    }
    
    public void take(Moveable subject, PlayObject po) {
        String s = this.mName + " takes " + subject.getName() + " into " +
            po.getName() + ".";
        System.out.println(s);
    }
}

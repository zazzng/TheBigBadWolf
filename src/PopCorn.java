public class PopCorn extends PlayObject{
    
    public PopCorn(String name) {
        super(name);
    }
    
    public void pop() {
        String s = "The " + this.mName + " pops.";
        System.out.println(s);
    }
    
}

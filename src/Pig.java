public abstract class Pig extends Moveable{
     
    // protected constructor that is called by its child class
    public Pig(String name) {
        super(name);
    }
    
    public void shakeHandsWith(Pig pigName) {
        String s = this.mName + " shakes hand with " + pigName.getName() + ".";
        System.out.println(s);
    }
    
    
}


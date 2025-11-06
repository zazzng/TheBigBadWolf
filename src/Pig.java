public abstract class Pig extends CharactersWithInstruments {
    // Protected constructor that is called by its child class
    protected Pig(String name) {
        super(name);
    }
    
    public void shakeHandsWith(Pig pigName) {
        String s = this.mName + " shakes hand with " + pigName.getName() + ".";
        System.out.println(s);
    }  
}


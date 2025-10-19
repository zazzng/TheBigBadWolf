public class FirstPig extends Pig{
    // This is the first pig (to be deleted)

    public FirstPig(String name) {
        super(name);
    }

//    @Override
    public void playMusicalInstrument() {
        String s = this.mName + " plays his flute.";
        System.out.println(s);
    }
    
}

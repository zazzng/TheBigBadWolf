public class ThirdPig extends Pig{

    public ThirdPig(String name) {
        super(name);
    }
    
    public void buildHouse() {
        String s = this.mName + " builds his house of stones and bricks.";
        System.out.println(s);
    }
    
}

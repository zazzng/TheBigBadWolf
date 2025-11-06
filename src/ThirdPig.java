import java.util.ArrayList;

public class ThirdPig extends Pig {
    // Public constructor for a concrete class
    public ThirdPig(String name) {
        super(name);
    }
    
    @Override
    public void playMusicalInstrument() {
        String s = this.mName + " plays the piano.";
        System.out.println(s);
    }
    
    public void buildHouse() {
        String s = this.mName + " builds his house of stones and bricks.";
        System.out.println(s);
    }
    
    public void packEquipment() {
        String s = this.mName + " packs equipment into his bag.";
        System.out.println(s);
    }
    
    public void tiptoeTo(PlayObject po) {
        String s = this.mName + " tiptoes to " + po.getName();
        System.out.println(s);
    }
    
    public void putStuffsInto(ArrayList<PlayObject> items, PlayObject place) {
        // printing "ThirdPig put 'items' into place"
        StringBuffer sb = new StringBuffer();
        sb.append(this.mName).append(" puts ");
        
        for (int i = 0; i < items.size(); i++) {
            PlayObject item = items.get(i);
            sb.append(item.getName());
            if (i < (items.size() - 1)) {
                sb.append(" and ");
            }
        }
        
        sb.append(" into ").append(place.getName()).append(".");
        System.out.println(sb.toString());
    }
}

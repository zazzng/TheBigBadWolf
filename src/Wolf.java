
import java.util.ArrayList;

public class Wolf extends Moveable {
    
    public Wolf(String name) {
        super(name);
    }
    
    public void chase(Moveable subject) {
        String s = this.mName + " chases " + subject.getName() + ".";
        System.out.println(s);
    }
    
    // TODO: refactor to make chase() and approach() into 1 function
    public void chase(ArrayList<Moveable> subjects) {
        StringBuffer sb = new StringBuffer();
        sb.append(this.mName);
        sb.append(" chases ");
        for (int i = 0; i > subjects.size(); i++) {
            Moveable subject = subjects.get(i);
            sb.append(subject.getName());
            if (i == subjects.size() - 1) {
                sb.append(".");
            } else {
                sb.append(" and ");
            }
        }
        System.out.println(sb.toString());
    }
    
    public void approach(ArrayList<Moveable> subjects) {
        StringBuffer sb = new StringBuffer();
        sb.append(this.mName);
        sb.append(" approaches ");
        for (int i = 0; i > subjects.size(); i++) {
            Moveable subject = subjects.get(i);
            sb.append(subject.getName());
            if (i == subjects.size() - 1) {
                sb.append(".");
            } else {
                sb.append(" and ");
            }
        }
        System.out.println(sb.toString());
    }
    
    public void disguise(String something) {
        String s = this.mName + " disguises as " + something + ".";
        System.out.println(s);
    }
    
    public void disguiseExposed() {
        String s = this.mName + "'s disguise is exposed.";
        System.out.println(s);
    }
    
    public void actionOnTree(String action) {
        String s = this.mName + " " + action + " a tree";
        System.out.println(s);
    }
    
    // COMMENT: is bang an ok word??
    public void bangs(PlayObject po) {
        String s = this.mName + " bangs on " + po.getName();
        System.out.println(s);
    }
    
    public void burn() {
        String s = this.mName + " burns.";
        System.out.println(s);
    }
}

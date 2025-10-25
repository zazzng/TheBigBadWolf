import java.util.ArrayList;

public class Wolf extends Moveable {
    // Introduce Wolf's different roles
    public enum Role { WOLF, FAIRY, GRANDMA };
    private Role mRole = Role.WOLF;
    public Role getRole() {
        return this.mRole;
    }
    
    // Public constructor for a concrete class
    public Wolf(String name) {
        super(name);
    }
    
    private void moveToward(String action, ArrayList<Moveable> subjects) {
        StringBuffer sb = new StringBuffer();
        sb.append(this.mName);
        sb.append(" ").append(action).append(" ");
        for (int i = 0; i < subjects.size(); i++) {
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
        this.moveToward("approaches", subjects);
    }
    
    public void chase(ArrayList<Moveable> subjects) {
        this.moveToward("chases", subjects);
    }
    
    public void chase(Moveable subject) {
        String s = this.mName + " chases " + subject.getName() + ".";
        System.out.println(s);
    }
    
    public void disguiseAs(Role newRole) {
        if (newRole != Role.WOLF) {
            this.mRole = newRole;
            
            String roleName = this.mRole.name().substring(0, 1) +
                this.mRole.name().substring(1).toLowerCase();
            String s = this.mName + " disguises as " + roleName + ".";
            System.out.println(s);
        }
    }
    
    public void disguiseExposed() {
        if (this.mRole != Role.WOLF) {
            String roleName = this.mRole.name().substring(0, 1) +
                this.mRole.name().substring(1).toLowerCase();
            String s = this.mName + "'s disguise as " + roleName +
                " is exposed.";
            System.out.println(s);
            
            this.mRole = Role.WOLF;
        }
    }
    
    public void actionOnTree(String action) {
        String s = this.mName + " " + action + " a tree.";
        System.out.println(s);
    }
    
    public void bangs(PlayObject po) {
        String s = this.mName + " bangs on " + po.getName();
        System.out.println(s);
    }
    
    public void burn() {
        String s = this.mName + " burns.";
        System.out.println(s);
    }
    
    public void talkToHimself(String something) {
        String s = this.mName + " talks to himself, \"" + something + "\"";
        System.out.println(s);
    }
    
    public void moveHeadOutOf(PlayObject po) {
        String s = this.mName + " moves head out of " + po.getName() + ".";
        System.out.println(s);
    }
    
    public void fly(PlayObject po) {
        String s = this.mName + " flies off " + po.getName() + ".";
        System.out.println(s);
    }
    
    public void changeVoice(Role newRole) {
        this.mRole = newRole;
        switch (this.mRole) {
            case WOLF:
                String s = "(" + this.mName + " uses his own voice" + ".)";
                System.out.println(s);
                break;
            case GRANDMA:
                String ss = "(" + this.mName + " changes to Grandma's voice" + ".)";
                System.out.println(ss);
                break;
        }
    } 
}

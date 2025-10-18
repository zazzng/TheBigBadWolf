
import java.util.ArrayList;

//there are some parts that both pig1 and pig2 say same things
//how to make it into one line?
public class BBW {

    public static void display(String s) {
        System.out.println(s);
    }
    public static void main(String[] args) {
        FirstPig pig1 = new FirstPig("Adam");
        SecondPig pig2 = new SecondPig("Brian");
        ThirdPig pig3 = new ThirdPig("Charles");
        RedRidingHood redGirl = new RedRidingHood("Red Riding Hood");
        
        BBW.display("<<The Big Bad Wolf>>");
        
        BBW.display("=== Red Riding Hood meets Three Little Pigs ===");
        redGirl.visit("Three Little Pigs' house");
//        ArrayList<Pig> allPigs = new ArrayList<Pig>();
//        allPigs.add(pig1);
//        allPigs.add(pig2);
//        allPigs.add(pig3);
        
        ArrayList<Pig> pigsWithInstruments = new ArrayList<Pig>();
        pigsWithInstruments.add(pig1);
        pigsWithInstruments.add(pig2);
        
        for (Pig pig : pigsWithInstruments){
            pig.playMusicalInstrument();
        }
        
        pig3.buildHouse();
        
        for (Pig pig : pigsWithInstruments){
            pig.say("Good morning, Little Red Riding Hood.");
        }
       
        redGirl.say("Good morning, how do you do?");
        pig3.say("Good morning, Miss Riding Hood.");
        pig1.ask("Where are you going Red Riding Hood?");
        pig2.ask("What's in the basket, something good?");
        redGirl.answer("I'm bringing Grandma caks and wine. \nShe's awful awful sick. "
                + "I'm in a great big hurry too. \nI've got to get there quick.");
        for (Pig pig : pigsWithInstruments){
            pig.say("You get there quick Red Riding Hood. "
                    + "\nIf you take the shortcut through the wood.");
        }
        
    
    }
    
}

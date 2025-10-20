import java.util.ArrayList;

//there are some parts that both pig1 and pig2 say same things
//how to make it into one line?
public class BBW {

    public static void display(String s) {
        System.out.println(s);
    }
    
    public static void main(String[] args) {
        // declare characters
        FirstPig pig1 = new FirstPig("Adam");
        SecondPig pig2 = new SecondPig("Brian");
        ThirdPig pig3 = new ThirdPig("Charles");
        RedRidingHood redGirl = new RedRidingHood("Red Riding Hood");
        Grandma grandma = new Grandma("Grandma");
        Wolf wolf = new Wolf("Wilson");
        
        // declare places
        Woods woods = new Woods("woods");
        PigHouse pigHouse = new PigHouse("Three Little Pigs' House");
        GrandmaHouse grandmaHouse = new GrandmaHouse("Grandma's House");
        
        // declare groups
        ArrayList<Pig> pigsWithInstruments = new ArrayList<Pig>();
        pigsWithInstruments.add(pig1);
        pigsWithInstruments.add(pig2);
        
        ArrayList<Moveable> woodsTeam = new ArrayList<>();
        woodsTeam.add(pig1);
        woodsTeam.add(pig2);
        woodsTeam.add(redGirl);
        
        BBW.display("<<The Big Bad Wolf>>");
        
        BBW.display("=== Red Riding Hood meets Three Little Pigs ===");
        
        redGirl.walkTo(pigHouse);
        
        for (Pig pig : pigsWithInstruments){
            pig.playMusicalInstrument();
        }
        
        pig3.buildHouse();
        
        // QUESTION: should we make a method greet() to make this shorter
        for (Pig pig : pigsWithInstruments){
            pig.say("Good morning, Little Red Riding Hood.");
        }
       
        redGirl.say("Good morning, how do you do?");
        pig3.say("Good morning, Miss Riding Hood.");
        pig1.ask("Where are you going Red Riding Hood?");
        pig2.ask("What's in the basket, something good?");
        redGirl.answer("""
                       I'm bringing Grandma cakes and wine.
                       She's awful awful sick. I'm in a great big hurry too.
                       I've got to get there quick.""");
        
        for (Pig pig : pigsWithInstruments) {
            pig.say("""
                    You get there quick Red Riding Hood. 
                    If you take the shortcut through the woods.""");
        }
        pig3.say("There's danger in them woods. Be aware! " + wolf.getName() +
            " is lurking there!" + "\nBetter to be safe than sorry!" +
            "\nShortcuts are not always good. Take the long road around the " +
            "forest while " + wolf.getName() + " is in the woods.");
        
        for (Pig pig : pigsWithInstruments) {
            pig.laugh();
            pig.say("That old wolf is just a sissy.");
        }
        
        pig1.say("All he does is huff");
        pig2.say("and puff.");
        
        for (Pig pig : pigsWithInstruments) {
            pig.say("""
                    We'll go with you and protect you.
                    Come along! We'll call his bluff.""");
        }
        
        for (Pig pig : pigsWithInstruments) {
            pig.say("Who's afraid of the Big Bad Wolf?");
            pig.playMusicalInstrument();
        }
        
        BBW.display("=== Red Riding Hood goes to the woods ===");
        
        for (Moveable subject : woodsTeam) {
            subject.walkTo(woods);
        }
        
        wolf.actionOnTree("hides behind");
        wolf.disguise("Fairy Queen");
        
        for (Pig pig : pigsWithInstruments) {
            pig.playMusicalInstrument();
        }
        
        wolf.approach(woodsTeam);
        wolf.say("I'm Goldilox the Fairy Queen");
        wolf.sing();
        
        wolf.actionOnTree("fell off");
        wolf.disguiseExposed();
        
        for (Pig pig : pigsWithInstruments) {
            pig.runAwayTo(null, true);
        }
        
        wolf.chase(redGirl);
        wolf.actionOnTree("stucks on");
        redGirl.runAwayTo(null, true);
        
        BBW.display("=== Wolf goes to Grandma's House ===");
        
        wolf.walkTo(grandmaHouse);
        grandma.knit();
        wolf.knock(grandmaHouse.getDoor());
    
    }
    
}

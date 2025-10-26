import java.util.ArrayList;

public class BBW {
    public static void display(String s) {
        System.out.println(s);
    }
    
    public static void main(String[] args) {
        // Declare characters
        FirstPig pig1 = new FirstPig("Adam");
        SecondPig pig2 = new SecondPig("Brian");
        ThirdPig pig3 = new ThirdPig("Charles");
        RedRidingHood redGirl = new RedRidingHood("Red Riding Hood");
        Grandma grandma = new Grandma("Grandma");
        Wolf wolf = new Wolf("Wilson");
        
        // Declare places
        Woods woods = new Woods("woods");
        PigHouse pigHouse = new PigHouse("Three Little Pigs' house");
        GrandmaHouse grandmaHouse = new GrandmaHouse("Grandma's house");
        
        // Declare items
        PopCorn popCorn = new PopCorn("pop corn"); 
        Coal coal = new Coal("hot coal");
        
        // Declare groups
        ArrayList<Pig> notWorkingPigs = new ArrayList<Pig>();
        notWorkingPigs.add(pig1);
        notWorkingPigs.add(pig2);
        
        ArrayList<Moveable> charactersInWoodScene = new ArrayList<>();
        charactersInWoodScene.add(pig1);
        charactersInWoodScene.add(pig2);
        charactersInWoodScene.add(redGirl);
        
        ArrayList<Moveable> playingMusicalInstrumentTeam = new ArrayList<>();
        playingMusicalInstrumentTeam.add(pig1);
        playingMusicalInstrumentTeam.add(pig2);
        playingMusicalInstrumentTeam.add(pig3);
        playingMusicalInstrumentTeam.add(redGirl);
        
        // Introduce the title of the story
        BBW.display("<<The Big Bad Wolf>>");
        
        // Begin Story
        BBW.display("=== Red Riding Hood meets Three Little Pigs ===");
        redGirl.walkTo(pigHouse);
        
        for (Pig pig : notWorkingPigs){
            pig.playMusicalInstrument();
        }
        
        pig3.buildHouse();
        
        // Greeting section
        for (Pig pig : notWorkingPigs){
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
        
        for (Pig pig : notWorkingPigs) {
            pig.say("""
                You get there quick Red Riding Hood. 
                If you take the shortcut through the woods.""");
        }
        
        pig3.say("There's danger in the woods. Be aware! " + wolf.getName() +
            " is lurking there!" + "\nBetter to be safe than sorry!" +
            "\nShortcuts are not always good. Take the long road around the " +
            "forest while " + wolf.getName() + " is in the woods.");
        
        for (Pig pig : notWorkingPigs) {
            pig.laugh();
            pig.say("That old wolf is just a sissy.");
        }
        
        pig1.say("All he does is huff");
        pig2.say("and puff.");
        
        for (Pig pig : notWorkingPigs) {
            pig.say("We'll go with you and protect you." + 
                " Come along! We'll call his bluff.");
        }
        
        for (Pig pig : notWorkingPigs) {
            pig.sing("Who's afraid of the Big Bad Wolf?");
            pig.playMusicalInstrument();
        }
        
        // Woods Scene
        BBW.display("=== Red Riding Hood goes to the woods ===");
        
        for (Moveable subject : charactersInWoodScene) {
            subject.walkTo(woods);
        }
        
        wolf.actionOnTree("hides behind");
        wolf.disguiseAs(Wolf.Role.FAIRY);
        
        for (Pig pig : notWorkingPigs) {
            pig.playMusicalInstrument();
        }
        
        wolf.approach(charactersInWoodScene);
        wolf.actionOnTree("hangs on");
        wolf.sing("I'm Goldilox the Fairy Queen. "
            + "Spirit of the woods in my whoops. "
            + "\nYou better fly from tree to tree. "
            + "Come come my dear. You're safe with me.");
        
        wolf.actionOnTree("fell off");
        wolf.disguiseExposed();
        
        for (Pig pig : notWorkingPigs) {
            pig.runAwayTo(null, true);
        }
        
        wolf.chase(redGirl);
        wolf.actionOnTree("stucks on");
        redGirl.runAwayTo(null, true);
        
        // Grandma's House Scene
        BBW.display("=== Wolf goes to Grandma's House ===");
        
        // Conversation between Wolf and Grandma
        wolf.walkTo(grandmaHouse);
        grandma.knit();
        wolf.knock(grandmaHouse.getDoor());
        grandma.say("Come in!");
        wolf.enter(grandmaHouse);
        wolf.chase(grandma);
        grandma.hide("in", grandmaHouse.getCupboard());
        wolf.bangs(grandmaHouse.getCupboard());
        
        // Conversation between Wolf and RRH
        redGirl.walkTo(grandmaHouse);
        redGirl.knock(grandmaHouse.getDoor());    
        wolf.disguiseAs(Wolf.Role.GRANDMA);
        wolf.say("Come in!");
        redGirl.enter(grandmaHouse);
        
        redGirl.say("Good morning Grandma, how do you feel?");
        wolf.say("Terrible!");
        wolf.changeVoice(Wolf.Role.GRANDMA);
        wolf.say("Not so hot, deary");
        redGirl.surprised();
        redGirl.ask("Ooh grandma, what big eyes you’ve got!");
        wolf.say("All the better to look you over deary");
        redGirl.surprised();
        redGirl.ask("Ooh grandma, what a big nose you’ve got!");
        wolf.say("All the better to hachchchh");
        
        wolf.hide("under", grandmaHouse.getBed().getBlanket());
        wolf.changeVoice(Wolf.Role.WOLF);
        wolf.talkToHimself("How am I doing");
        wolf.laugh();
        wolf.moveHeadOutOf(grandmaHouse.getBed().getBlanket());
        
        redGirl.surprised();
        redGirl.ask("Ooh grandma, what a big mouth you’ve got!");
        wolf.changeVoice(Wolf.Role.WOLF);
        wolf.say("You ain’t seen enough of me deary?");
        wolf.laugh();
        wolf.chase(redGirl);
        redGirl.runAwayTo(grandmaHouse, false);
        
        // Pigs' House Scene
        BBW.display("=== Pigs' House ===");
        
        for (Pig pig : notWorkingPigs) {
            pig.runAwayTo(pigHouse, true);
        }
        
        for (Pig pig : notWorkingPigs) {
            pig.hide("under", pigHouse.getBed());
        }
        
        for (Pig pig : notWorkingPigs) {
            pig.say("The Wolf! He's got her!");
        }
        
        pig3.packEquipment();
        pig3.runAwayTo(grandmaHouse, true);
        
        // Grandma's House Finale
        BBW.display("=== Grandma's House ===");
        
        wolf.chase(redGirl);
        grandma.take(redGirl, grandmaHouse.getCupboard());
        redGirl.hide("inside", grandmaHouse.getCupboard());
        grandma.hide("inside", grandmaHouse.getCupboard());
        wolf.bangs(grandmaHouse.getCupboard());
        
        pig3.enter(grandmaHouse);
        wolf.say("Open the door and let me in!");
        pig3.tiptoeTo(wolf);
        pig3.putStuffs(popCorn, coal, wolf);
        wolf.burn();
        wolf.fly(grandmaHouse.getRoof());
        popCorn.pop();
        wolf.runAwayTo(null, true); 
        
        BBW.display("=== Grandma's House After Chasing The Wolf Away ===");
        
        grandma.knit();
        pig1.shakeHandsWith(pig2);
        
        for (Moveable pianoTeammates : playingMusicalInstrumentTeam){
            pianoTeammates.playMusicalInstrument();
        }
        
        for (Pig pig : notWorkingPigs){
            pig.sing("Who’s afraid of the big bad wolf. "
                + "He’s the biggest sissy");
            pig.dance();
        } 
    }
}
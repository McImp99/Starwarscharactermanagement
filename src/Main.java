import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Arraylist to store new and current characters
        List<Character> characters = new ArrayList<>();
        //adding 3 objects to our arraylist
        characters.add(new Jedi("Luke", 30));
        characters.add(new Sith("Vader", 55));
        characters.add(new Droid("R2", 10));

        //loop to check for what character the given character is.
        for (Character character : characters) {
            character.action();
            character.showInfo();

            if (character instanceof Jedi) {
                Jedi jedi = (Jedi) character;
                System.out.println("This is a Jedi!");
            } else if (character instanceof Sith) {
                Sith sith = (Sith) character;
                System.out.println("This is a Sith!");
            } else if (character instanceof Droid) {
                Droid droid = (Droid) character;
                System.out.println("This is a Droid!");
            }
        }


    }
}
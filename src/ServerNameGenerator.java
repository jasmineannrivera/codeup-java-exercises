import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {
        //arrays with 10 words
        String[] adjectives = {"cute", "fun", "sickening", "brave", "mysterious", "scary",
                "elegant", "zealous", "fierce", "happy"};
        String[] nouns = {"tiger", "doll", "queen", "table", "puppy", "kitten", "leachianus gecko", "villager", "mouse", "number"};
        //bring in random class
        Random randomWord = new Random();
        // choose a number between 0 and 10
        int n = randomWord.nextInt(10);
        System.out.println("Here is your server name: " + adjectives[n] + "-" + nouns[n]);
    }


}

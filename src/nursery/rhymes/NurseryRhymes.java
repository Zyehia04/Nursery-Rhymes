/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nursery.rhymes;

/**
 *
 * @author mlarrubia
 */
public class NurseryRhymes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        farm("cow", "moo");
        farm("duck", "quack");
        farm("Angry Bird", "Squaa");
        // TODO: add another animal to the farm here
        
        monkeys(10);
        monkeys(9);
        
        
        hickory_dickory(1);
        hickory_dickory(2);
        hickory_dickory(3);
        
        // TODO: make the clock strike three here
        bruhmode("Medina");
        bruhmode("Angry");
              
    }

    public static void farm(String animal, String sound) {
        // TODO: write your code here
        System.out.println("Old MacDonald had a farm\n"
                + "e-i-e-i-o\n"
                + "And on that farm he had a " + animal + "\n"
                + "e-i-e-i-o\n"
                + "With a " + sound + " " + sound + " here\n"
                + "");
    }

    public static void monkeys(int number) {
        // TODO: write your code here
        System.out.println(number + " ​little​ ​monkeys​ ​jumping​ ​on​ ​the​ ​bed\n"
                + "One​ ​fell​ ​off​ ​and​ ​bumped​ ​his​ ​head\n"
                + "Mama​ ​called​ ​the​ ​doctor,​ ​and​ ​the​ ​doctor​ ​said\n"
        + "\"No​ ​more​ ​monkeys​ ​jumping​ ​on​ ​the​ ​bed!\"\n");
    }

    public static void hickory_dickory(int time) {
        // TODO: write your code here
        System.out.println("\nHickory​ ​dickory​ ​dock\n"
                + "The​ ​mouse​ ​ran​ ​up​ ​the​ ​clock\n"
                + "The​ ​clock​ ​struck​ " + time + "\n"
                + "The​ ​mouse​ ​ran​ ​down\n"
                + "Hickory​ ​dickory​ ​dock ");
    }

    // TODO add your new methods here
    public static void bruhmode(String person){
        System.out.println("\n" + person + " cant do a pullup\n"
                + "ay yuh\n");
    }
}   

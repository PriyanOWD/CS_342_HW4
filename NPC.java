/* CS342 Term Project Part IV: Combination and Extension
 * Name:   Shyam Patel
 * NetID:  spate54
 * Date:   Nov 14, 2018
 */

/* CS342 Term Project Part IV: Combination and Extension
 * Name:   Joey Voorhees
 * NetID:  svoorh2
 * Date:   Nov 14, 2018
 */

/* CS342 Term Project Part IV: Combination and Extension
 * Name:   Priyan Sureshkumar
 * NetID:  psures5
 * Date:   Nov 14, 2018
 */
import java.util.Scanner;


// NPC subclass inherits from Character class and encapsulates
// attributes and methods for NPC objects
public class NPC extends Character {
    // constructor for NPC class
    public NPC(Scanner sc, int version) {
        super(sc, version);   // call superclass constructor
        dm = new AI();        // allocate AI decision maker
    }//end class constructor


    // for now, NPCs simply utilize the GO command in random directions
    public boolean makeMove() {
        Move m = dm.getMove(this,currPlace); // get move
        return m.execute();        // execute move
    }//end makeMove()
}//end NPC class

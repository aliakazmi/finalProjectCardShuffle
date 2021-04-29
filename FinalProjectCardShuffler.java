
package finalprojectcardshuffler;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author aliakazmi
 */
public class FinalProjectCardShuffler(int card[], int n) {
    
    ArrayList<String>game = new ArrayList<>(4);
    
    Random rand = new Random();
    for(int i = 0; i < n; i++){
        int suit = rand.nextInt(4+1);
        int face = rand.nextInt(13+1); 
       
    }
    Scanner scnr = new Scanner(System.in);
    
    String card = String.valueOf(suit) + String.valueOf(face);
    game.add(card);
    
    System.out.println("Random Cards: " + card);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
      for(int i = 0; i < 52; i++){
          
        }

// TODO code application logic here
    }
    
}

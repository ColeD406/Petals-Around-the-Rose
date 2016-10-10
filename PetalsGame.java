/**
 * Petals Around The Rose
 * 
 * @author (Cole Doty) 
 * @version (10/10/16)
 */
public class PetalsGame {
	//instance variables
	private int die1;
	private int die2;
	private int die3;
	private int die4;
	private int die5;
	
	/**
     * Constructor for objects of class PetalsGame
     */
	public PetalsGame()
	{
		
	}
	
	//method designed to randomize the dice.
	
	public  void rollDice() {
	
		die1 = (int)(6 * Math.random()) + 1;
        die2 = (int)(6 * Math.random()) + 1; 
        die3 = (int)(6 * Math.random()) + 1; 
        die4 = (int)(6 * Math.random()) + 1;
        die5 = (int)(6 * Math.random()) + 1;

	}
	//method for seeing how many petals
	public int petalsOnDice(int die)
	{
        if (die == 3) // there are 2 petals (dots) around the rose (center)
        {
            return 2;
        } else if (die == 5) { // there are 4 petals (dots) around the rose (center)
            return 4;
        } else { // there are 0 petals (dots) around the rose (center)
            return 0;
        }
	}
	//method for printing
	public void printDice() {
		 System.out.println(die1 + ", " + die2 + ", " + die3 + ", " + die4 + ", " + die5);
		}

	//method to count the total petals(This took me forever to figure out!)
	public int calculateAllPetals() {
		int value = 0;
    
    value += petalsOnDice(die1);
    value += petalsOnDice(die2);
    value += petalsOnDice(die3);
    value += petalsOnDice(die4);
    value += petalsOnDice(die5);
    
    return value;
	
	

}
}

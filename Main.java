/**
 * This class runs the program Petals Around the Rose.
 * 
 * @author Cole Doty
 * @version 11/5/2016
 */
import java.util.Scanner;

public class Main {
	// instance variables
	private int die1;
	private int die2;
	private int die3;
	private int die4;
	private int die5;

	// method designed to randomize the dice.
	public void rollDice() {

		die1 = (int) (6 * Math.random()) + 1;
		die2 = (int) (6 * Math.random()) + 1;
		die3 = (int) (6 * Math.random()) + 1;
		die4 = (int) (6 * Math.random()) + 1;
		die5 = (int) (6 * Math.random()) + 1;

	}

	// method for seeing how many petals
	public int petalsOnDice(int die) {
		if (die == 3) // there are 2 petals (dots) around the rose (center)
		{
			return 2;
		} else if (die == 5) { // there are 4 petals (dots) around the rose
								// (center)
			return 4;
		} else { // there are 0 petals (dots) around the rose (center)
			return 0;
		}
	}

	// method for printing
	public void printDice() {
		System.out.println(die1 + ", " + die2 + ", " + die3 + ", " + die4 + ", " + die5);
	}

	// method to count the total petals(This took me forever to figure out!)
	public int calculateAllPetals() {
		int value = 0;

		value += petalsOnDice(die1);
		value += petalsOnDice(die2);
		value += petalsOnDice(die3);
		value += petalsOnDice(die4);
		value += petalsOnDice(die5);

		return value;
	}

	//method to play the game
	public static void playGame() {
		Scanner in = new Scanner(System.in); // used to read in user input

		Main game = new Main(); // create new instance of PetalsGame

		int choice = 2; // the player's menu choice, initially 2
		int guess; // the player's guess for number of petals

		while (choice != 1) // while loop to play multiple times
		{
			System.out.println();
			System.out.println("Type '1' to play, '2' to quit, or '3' for a tutorial.");
			System.out.println();
			// read in user's menu choice and store in variable choice.
			System.out.println("Please enter your choice below:");
			choice = in.nextInt();
			System.out.println();

			// program actions depending on user's choice
			switch (choice) {
			case 1: // if player chose "1. Play."
				game.rollDice(); // roll all five dice
				game.printDice(); // print out values of the dice
				System.out.println("How many petals are around the rose?");
				guess = in.nextInt();
				System.out.println();
				if (guess == game.calculateAllPetals()) // this if or if the
														// answer is correct
				{
					System.out.println("Correct" + "\n");
					System.out.println("----------------------");
					playGame();
				} else {
					System.out.println("Incorrect! The right answer is " + game.calculateAllPetals() + "\n");
					System.out.println("----------------------");
					playGame();
				}
				return;
			case 2: // if player chose "2. Quit."
				System.out.println("Thank you for playing.");
				return;
			case 3:
				System.out.println("The game goes as follows:");
				System.out.println();
				System.out.println("The name 'PetalsAround the Rose' is important. In this game I will roll five dice"
						+ "\nand will tell you how many petals appear." + "\nFor example: 5,3,1,6,2 "
						+ "will result in 6.");
				System.out.println("Once you unlock the secret, you"
						+ "\nwill be declared a 'Potentate of the Rose'.\n");
				System.out.println();
				System.out.println("Hint: answers are always even.");
				break;

			default:
				System.out.println("That is an invalid choice.  Please try again.\n");
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Petals Around the Rose");
		System.out.println();
		System.out.println("If you have never played before or want to see an example, type '3'");
		System.out.println("----------------------");
		//plays the game
		playGame();
	}
}

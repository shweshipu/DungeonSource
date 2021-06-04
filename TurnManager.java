
/*
 * 
 * class used to manage the turns, as well as prompt the player for choices.
 * 
 * functions as both View and Controller in the MVC pattern?
 */
import java.util.ArrayList;

public class TurnManager {
	static Hero hero;
	static Monster monster;
	
	static int numTurns;
	
	static protected void battleChoices(Hero hero, Monster monster) {
		    numTurns = hero.getAttackSpeed()/monster.getAttackSpeed();

			if (numTurns == 0)
				numTurns++;
			
			System.out.println("Number of turns this round is: " + numTurns);
			
			
			
			
			int choice;

			Attack[] heroAttacks = (Attack[]) hero.getAttacks().toArray();
			
			do
			{
				//list all attacks the player can do
				for(int i = 0; i<heroAttacks.length; i++)
					System.out.println("1. " + heroAttacks[i]);
			    System.out.print("Choose an option: ");
			    choice = Keyboard.readInt();
			    
			    
			    
			    //do the player's response
			    try
			    {
			    	//call the attack they chose
			    	heroAttacks[choice-1].doAttack(monster);
			    	
			    	numTurns--;
					if (numTurns > 0)
					    System.out.println("Number of turns remaining is: " + numTurns);
					
			    }
			    //catch an option that wasnt listed
			    catch(IndexOutOfBoundsException e)
			    {
			    	System.out.println("invalid choice!");
			    }
			    
			    
			    /*
			    switch (choice)
			    {
				    case 1: attack(opponent);
				        break;
				    case 2: surpriseAttack(opponent);
				        break;
				    default:
				        System.out.println("invalid choice!");
			    }//end switch
			    */

			} while(numTurns > 0);
	}
	 
}

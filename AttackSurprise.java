
public class AttackSurprise extends Attack{
	String name = "Surprise attack";
	AttackDefault defaultAttack;
	//@Override
	Hero attacker;
	AttackSurprise(Hero attacker, double chanceToHit, int damageMin, int damageMax){
		super(attacker,  chanceToHit, damageMin, damageMax);
		defaultAttack = new AttackDefault(attacker,  chanceToHit, damageMin, damageMax);
		this.setName("Surprise attack");
	}
	
	@Override
	public void doAttack(DungeonCharacter opponent)
	{
		double surprise = Math.random();
		if (surprise <= .4)
		{
			System.out.println("Surprise attack was successful!\n" +
								attacker.getName() + " gets an additional turn.");
			//add a turn
			TurnManager.numTurns++;  //this is a reallly bad way to do it but i just want it to run
			defaultAttack.doAttack(opponent);
		}//end surprise
		else if (surprise >= .9)
		{
			System.out.println("Uh oh! " + opponent.getName() + " saw you and" +
								" blocked your attack!");
		}
		else
		    defaultAttack.doAttack(opponent);


	}//end attack method
}

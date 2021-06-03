
public class SurpriseAttack extends Attack{
	
	DefaultAttack defaultAttack;
	
	SurpriseAttack(Hero attacker, double chanceToHit, int damageMin, int damageMax){
		super(attacker,  chanceToHit, damageMin, damageMax);
		defaultAttack = new DefaultAttack(attacker,  chanceToHit, damageMin, damageMax);
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
			attacker.changeNumTurns(1);  ///what should I do here????
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

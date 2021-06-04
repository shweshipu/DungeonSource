
public class DefaultAttack extends Attack{
	DefaultAttack(DungeonCharacter attacker, double chanceToHit, int damageMin, int damageMax){
		super(attacker,  chanceToHit, damageMin, damageMax);
	}
	
	@Override
	public void doAttack(DungeonCharacter opponent)
	{
		boolean canAttack;
		int damage;

		canAttack = Math.random() <= chanceToHit;

		if (canAttack)
		{
			damage = (int)(Math.random() * (damageMax - damageMin + 1))
						+ damageMin ;
			opponent.subtractHitPoints(damage);



			System.out.println();
		}//end if can attack
		else
		{
			
			System.out.println(attacker.getName() + "'s attack on " + opponent.getName() +
								" failed!");
			System.out.println();
		}//end else

	}//end attack method
}

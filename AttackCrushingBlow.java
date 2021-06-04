
public class AttackCrushingBlow extends AttackDefault{
	
	AttackCrushingBlow(DungeonCharacter attacker, double chanceToHit, int damageMin, int damageMax){
		super(attacker,  chanceToHit, damageMin, damageMax);
	}
	@Override
	public void doAttack(DungeonCharacter opponent)
	{
		if (Math.random() <= .4)
		{
			int blowPoints = (int)(Math.random() * 76) + 100;
			System.out.println(name + " lands a CRUSHING BLOW for " + blowPoints
								+ " damage!");
			opponent.subtractHitPoints(blowPoints);
		}//end blow succeeded
		else
		{
			System.out.println(name + " failed to land a crushing blow");
			System.out.println();
		}//blow failed

	}//end override of attack method
}

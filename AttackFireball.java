
public class AttackFireball extends AttackDefault{
	
	AttackFireball(DungeonCharacter attacker, double chanceToHit, int damageMin, int damageMax){
		super(attacker,  chanceToHit, damageMin, damageMax);
	}
	@Override
	public void doAttack(DungeonCharacter opponent)
	{
		System.out.println(name + " casts a spell of fireball at " +
							opponent.getName() + ":");
		super.doAttack(opponent);
	}//end override of attack method
}

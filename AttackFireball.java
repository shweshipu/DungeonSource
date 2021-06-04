
public class AttackFireball extends AttackDefault{
	String name = "Fireball";
	AttackFireball(DungeonCharacter attacker, double chanceToHit, int damageMin, int damageMax){
		super(attacker,  chanceToHit, damageMin, damageMax);
		this.setName("Fireball");
	}
	@Override
	public void doAttack(DungeonCharacter opponent)
	{
		System.out.println(attacker.name + " casts a spell of fireball at " +
							opponent.getName() + ":");
		super.doAttack(opponent);
	}//end override of attack method
}


public abstract class Attack {
	//identifier name for the DungeonMaster Class
	String name;
	
	//variables for the attack calculations
	protected boolean canAttack;
	protected int damage;
	protected double chanceToHit;
	protected int damageMin, damageMax;
	
	// class that calls this object
	DungeonCharacter attacker;
	
	//get our stuff to use, presumably from a Hero extending class
	Attack(DungeonCharacter attacker, double chanceToHit, int damageMin, int damageMax)
	{
		this.attacker = attacker;
		this.chanceToHit = chanceToHit;
		this.damageMin = damageMin;
		this.damageMax = damageMax;
	}
	
	//the attack. return success
	abstract void doAttack(DungeonCharacter target);
	
	
	
}

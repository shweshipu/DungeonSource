
public class AttackDefault extends Attack{
	String name = "Attack Opponent";
	String message = "";

	AttackDefault(DungeonCharacter attacker, double chanceToHit, int damageMin, int damageMax){
		super(attacker,  chanceToHit, damageMin, damageMax);
	}
	AttackDefault(DungeonCharacter attacker, double chanceToHit, int damageMin, int damageMax, String message){
		super(attacker,  chanceToHit, damageMin, damageMax);
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
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

			//no special combat message
			if(message.equals("")){
				System.out.println();
			}
			else
				System.out.println(name + message + opponent.getName() + ":");
		}//end if can attack
		else
		{
			
			System.out.println(attacker.getName() + "'s attack on " + opponent.getName() +
								" failed!");
			System.out.println();
		}//end else

	}//end attack method
}

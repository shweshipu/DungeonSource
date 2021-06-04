
public class AttackSelfHeal extends AttackDefault{
	String name = "Heal";
	private final int MIN_ADD = 25;
	private final int MAX_ADD = 50;
	
	AttackSelfHeal(DungeonCharacter attacker, double chanceToHit, int damageMin, int damageMax){
		super(attacker,  chanceToHit, damageMin, damageMax);
		this.setName("Heal");
	}
	@Override
	public void doAttack(DungeonCharacter notNeeded)//this could also be refactored better
    {
	    int hPoints;

		hPoints = (int)(Math.random() * (MAX_ADD - MIN_ADD + 1)) + MIN_ADD;
		attacker.addHitPoints(hPoints);
		System.out.println(name + " added [" + hPoints + "] points.\n"
							+ "Total hit points remaining are: "
							+ attacker.hitPoints);
		 System.out.println();

    }//end increaseHitPoints method
}


public class Potion
{
	@Override
	public String toString( )
	{
		return "["+ name + ", Heals for:" + healPoints + " Points, Total Potions=" + potionCount + "]";
	}
	String name = "Health Potion"; 
	int healPoints = 7;
	int potionCount = 1;
	public Potion(String name, int healPoints, int potionCount)
	{
		super ( );
		this.name = name;
		this.healPoints = healPoints;
		this.potionCount = potionCount;
	}
	 public Potion()
	{
		
	}
	public int getPotionCount( )
	{
		return potionCount;
	}
	public void setPotionCount( int potionCount )
	{
		this.potionCount = potionCount;
	}
	
}

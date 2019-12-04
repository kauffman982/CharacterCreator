
public class Weapon
{
	String name;
	int damage;
	public Weapon(String name, int damage)
	{
		super ( );
		this.name = name;
		this.damage = damage;
	}
	@Override
	public String toString( )
	{
		return "Name: " + name + ", damage: " + damage + "]";
	}
	public Weapon()
	{
		
	}
	public String getName( )
	{
		return name;
	}
	public void setName( String name )
	{
		this.name = name;
	}
	public int getDamage( )
	{
		return damage;
	}
	public void setDamage( int damage )
	{
		this.damage = damage;
	}
}

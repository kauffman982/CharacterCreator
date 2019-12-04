import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Characters
{
	String name;
	String classType;
	String weaponName;
	int weaponDamage;
	int strength;
	int vitality;
	int dexterity;
	int wisdom;
	int dmg;
	LinkedList<Object> playerInventory = new LinkedList<Object>();
	LinkedList<String> playerWeapsName = new LinkedList<String>();
	LinkedList<Integer> playerWeapsDmg = new LinkedList<Integer>(); 
	
	
	
	
	public static void addPotion() {
		
	}
	
	public int getDmg() {
		return dmg;
	}
	public void setDmg(int dmg) {
		this.dmg = dmg;
	}	
	@Override
	public String toString( )
	{
		return "Character [Name: " + name +", Class Type: " + classType + ", Strength: "
				+ strength + ", Vitality: " + vitality + ", Dexterity: " + dexterity + ", Wisdom: " + wisdom +", "
				+", Weapon Name: "+weaponName+", Weapon Damage: "+weaponDamage+ "\n" +"]";
	}
	public String getWeaponName( )
	{
		return weaponName;
	}

	public void setWeaponName( String weaponName )
	{
		this.weaponName = weaponName;
	}

	public int getWeaponDamage( )
	{
		return weaponDamage;
	}

	public void setWeaponDamage( int weaponDamage )
	{
		this.weaponDamage = weaponDamage;
	}

	public void printCharacters()
	{
		System.out.println ( toString() );
	}
	public String getClassType( )
	{
		return classType;
	}
	public void setClassType( String classType )
	{
		this.classType = classType;
	}
	public LinkedList<Object> getPlayerInventory( )
	{
		return playerInventory;
	}
	public void setPlayerInventory( LinkedList<Object> playerInventory )
	{
		this.playerInventory = playerInventory;
	}
	public String getName( )// Getter for Name
	{
		return name;
	}
	public void setName( String name ) // Setter for Name
	{
		this.name = name;
	}
	public int getStrength( ) // Getter for  
	{
		return strength;
	}
	public void setStrength( int stredngth ) // Setter for strength
	{
		this.strength = stredngth;
	}
	public int getVitality( ) // Getter for Vitality
	{
		return vitality;
	}
	public void setVitality( int vitality ) // Setter for Vitality
	{
		this.vitality = vitality;
	}
	public int getDexterity( ) // Getter for Dexterity 
	{
		return dexterity;
	}
	public void setDexterity( int dexterity ) // Setter for Dexterity
	{
		this.dexterity = dexterity;
	}
	public int getWisdom( ) // Getter for Wisdom
	{
		return wisdom;
	}
	public void setWisdom( int wisdom ) // Setter for Wisdom
	{
		this.wisdom = wisdom;
	}

}

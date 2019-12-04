import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class CharacterCreator
{

	public static void main( String[ ] args )
	{
		Scanner input = new Scanner(System.in);
		int classType =0; // variable to call the proper class attributes for represented class
		Characters chad =  new Characters(); //new Characters(); // creates the character object
		CharacterCreator jim = new CharacterCreator(); // character Creator object
		Weapon brzDagger = new Weapon();
		brzDagger.setName ("Bronze Dagger");
		brzDagger.setDamage ( 2 );
		Weapon enchBltSwrd = new Weapon();
		enchBltSwrd.setName ( "Enchanted Blunt Sword" );
		enchBltSwrd.setDamage ( 5 );
		Weapon brzSwrd = new Weapon();
		brzSwrd.setName ( "Bronze Sword" );
		brzSwrd.setDamage ( 3 );
		Weapon bnDag = new Weapon();
		bnDag.setName ( "Bone Dagger" );
		bnDag.setDamage ( 2 );
		Weapon irLngSwrd = new Weapon();
		irLngSwrd.setName ( "Iron Long Sword" );
		irLngSwrd.setDamage ( 6 );
		Weapon irDag = new Weapon();
		irDag.setName ( "Iron Dagger" );
		irDag.setDamage ( 4 );
		Weapon irFl = new Weapon();
		irFl.setName ( "Iron Flail" );
		irFl.setDamage ( 5 );
		Weapon bltIrSwrd = new Weapon();
		bltIrSwrd.setName ( "Blunt iron Sword" );
		bltIrSwrd.setDamage ( 4 );
		Weapon enchStlBrdSwrd = new Weapon();
		enchStlBrdSwrd.setName ( "Enchanted Steel Broad Sword" );
		enchStlBrdSwrd.setDamage ( 9 );
		Weapon stlLnc = new Weapon();
		stlLnc.setName ( "Steel Lance" );
		stlLnc.setDamage ( 6 );
		jim.characterMethod1(input, chad, classType); // call to the character creation method
		chad.printCharacters ( ); 
		Potion hPot = new Potion();
		foundPotion(chad, hPot);
		addPotion(hPot);
		addWeapon(chad, brzDagger, enchBltSwrd, brzSwrd, bnDag, irLngSwrd, irDag, irFl, bltIrSwrd, enchStlBrdSwrd, stlLnc);
		addWeapon(chad, brzDagger, enchBltSwrd, brzSwrd, bnDag, irLngSwrd, irDag, irFl, bltIrSwrd, enchStlBrdSwrd, stlLnc);
		System.out.println ( chad.playerInventory );
		equipWeapon(input, chad, brzDagger, enchBltSwrd, brzSwrd, bnDag, irLngSwrd, irDag, irFl, bltIrSwrd, enchStlBrdSwrd, stlLnc);
		chad.toString ( );
		System.out.println ( "Program End" );
		
		
	}
	
	public  void characterMethod1(Scanner input, Characters chad, int classType) 
	{
		int freePoints = 5;
		int pointsUse;
		System.out.println ( "Welcome to character creation" );
		System.out.println ( "Enter your characters name" );
		chad.name = input.nextLine ();
		System.out.println ( "Choose your characters class, *Type character class*" );
		System.out.println ( "1. Knight 2. Mage 3. Thief" );
		chad.classType= input.next ();
		if(chad.classType.equalsIgnoreCase ( "Knight" ) || chad.classType.equalsIgnoreCase ( "Mage" ) || chad.classType.equalsIgnoreCase ("Thief") ) 
		{
		
			if (chad.classType.equalsIgnoreCase( "Knight" ))
			{
				chad.setStrength (6);
				chad.setVitality (6);
				chad.setDexterity(4);
				chad.setWisdom   (2);
				
			}
			else if (chad.classType.contentEquals ( "Mage" ))
			{
				
				chad.setStrength (3);
				chad.setVitality (3);
				chad.setDexterity(5);
				chad.setWisdom   (6);
			}
			else if (chad.classType.contentEquals ( "Thief" ))
			{
				
				chad.setStrength (4);
				chad.setVitality (5);
				chad.setDexterity(6);
				chad.setWisdom   (3);
			}
			System.out.println ("Your character has free attribute points that need assigned");
			while (freePoints >0)
			{
				System.out.println ( "You have:"+freePoints+ " left. How many points will you assign to Strength" );
				pointsUse = input.nextInt ( );
				while (pointsUse > freePoints || pointsUse <=0 && freePoints >0 )
				{
					System.out.println ( "Entera a number between 0 and "+freePoints );
					pointsUse = input.nextInt ( );
				}
				freePoints = freePoints - pointsUse;
				chad.setStrength( chad.getStrength() + pointsUse);
				if(freePoints > 0)
				{
					System.out.println ( "You have:"+freePoints+ " left. How many points will you assign to Vitality (Health)" );
					pointsUse = input.nextInt ( );
			
					while (pointsUse > freePoints|| pointsUse <=0 && freePoints >0 )
					{
						System.out.println ( "Enter a number between 0 and "+freePoints );
						pointsUse = input.nextInt ( );
					}
				freePoints = freePoints - pointsUse;
				chad.setVitality(chad.getVitality() + pointsUse);
				}	
				
				if(freePoints>0)
				{		
					System.out.println ( "You have: "+freePoints+ " left. How many points will you assign to Dexterity" );
					pointsUse = input.nextInt();

					while (pointsUse > freePoints || pointsUse <=0 && freePoints >0 )
					{
						System.out.println ( "Entera a number between 0 and "+freePoints );
						pointsUse = input.nextInt ( );
					}
					freePoints = freePoints - pointsUse;
					chad.dexterity = chad.dexterity + pointsUse;
				}
			
				
				if(freePoints>0)
				{
					System.out.println ( "You have:"+freePoints+ " left. How many points will you assign to Wisdom" );
					pointsUse = input.nextInt ( );
					while (pointsUse > freePoints || pointsUse <=0 )
					{
						System.out.println ( "Entera a number between 0 and "+freePoints );
						pointsUse = input.nextInt ( );
					}
				freePoints = freePoints - pointsUse;
				chad.wisdom = chad.wisdom + pointsUse;
				}
				if(chad.getWeaponName ( ) == null) {
					chad.setDmg (( chad.getStrength() + chad.getDexterity()+ chad.getWisdom()) /3);
				}
				else {
					chad.setDmg((chad.getStrength() + chad.getDexterity()+ chad.getWisdom() + chad.getWeaponDamage ( ))/4);
				}
			}
		}
		else
			{
				System.out.println ( "Invalid class entered please enter Knight, Mage or Thief" );
				chad.classType= input.next ();
			}
		System.out.println ( "All free attribute points are assigned" );
		System.out.println ( "Your characters Attributes are: " );
		System.out.println ( "Strength:"+chad.strength );
		System.out.println ( "Vitality: "+chad.vitality);
		System.out.println ( "Dexterity: "+chad.dexterity);
		System.out.println ( "Wisdom: "+chad.wisdom );
		
	}
	
	public static void addPotion( Potion hPot) {
		int countHold = hPot.getPotionCount ( );
		hPot.setPotionCount (countHold +1 );
		countHold = hPot.getPotionCount ( );
		System.out.println ( "You now have:"+countHold+ " potions ");
	}
	
	public static void usePotion(Potion hPot, Characters chad) {
		int countHold = hPot.getPotionCount ( );
		hPot.setPotionCount ( countHold -1);
		countHold = hPot.getPotionCount ( );
		chad.setVitality ( chad.vitality + hPot.healPoints);
		System.out.println ( "You used a health potion, "+chad.getName ( )+"'s health is now "+chad.getVitality ( ) );
	}
	
	public static void foundPotion(Characters chad, Potion hPot) {
		chad.playerInventory.add (0, hPot);
	}
	
	public static void equipWeapon(Scanner input, Characters chad, Weapon brzDagger, Weapon enchBltSwrd, Weapon brzSwrd, Weapon bnDag, Weapon irLngSwrd, Weapon irDag, Weapon irFl, Weapon bltIrSwrd, Weapon enchStlBrdSwrd, Weapon stlLnc) {
		if(chad.getWeaponName ( )==null) {
			System.out.println ( "No current Weapon" );
		}
		else {
			System.out.println ( "Your Current  Weapon is: "+chad.getWeaponName ( ));
		}
		System.out.println ( chad.getName()+"'s Inventory: "+chad.getPlayerInventory ( ) );
		System.out.println ( "Change Current Equip Weapon to one in your Inventory, enter Y for yes or N for no" );
		String equipCh = input.next ( );
		if(equipCh.equalsIgnoreCase ( "y")|| equipCh.equalsIgnoreCase ( "yes" )) {
			for(int i =0;i<chad.playerInventory.size ( );i++) {
				int c = i+1;
				System.out.print (c+": "+chad.playerInventory.get ( i )+"  "  );
			}
			System.out.println ( "Enter the number of the Weapon you wish to equip" );
			int weaponChoice = input.nextInt ( );
			
			chad.setWeaponName ((String) chad.playerInventory.get(weaponChoice-1));
			chad.toString ( );
	
		}
	}
	
	public static void addWeapon(Characters chad, Weapon brzDagger, Weapon enchBltSwrd, Weapon brzSwrd, Weapon bnDag, Weapon irLngSwrd, Weapon irDag, Weapon irFl, Weapon bltIrSwrd, Weapon enchStlBrdSwrd, Weapon stlLnc ) {
		int randWeap = (int)(Math.random ()*10+1);
		switch(randWeap) {
			case 1:
				chad.playerInventory.add ( brzDagger );
				break;
			case 2:
				chad.playerInventory.add ( enchBltSwrd );
				break;
			case 3:
				chad.playerInventory.add ( brzSwrd );
				break;
			case 4:
				chad.playerInventory.add ( bnDag );
				break;
			case 5:
				chad.playerInventory.add ( irLngSwrd );
				break;
			case 6:
				chad.playerInventory.add ( irDag );
				break;
			case 7:
				chad.playerInventory.add ( irFl );
				break;
			case 8:
				chad.playerInventory.add ( bltIrSwrd );
				break;
			case 9:
				chad.playerInventory.add ( enchStlBrdSwrd );
				break;
			case 10:
				chad.playerInventory.add ( stlLnc );
				break;
				
		
		}
	}
}

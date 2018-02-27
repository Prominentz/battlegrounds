//Giant vs Ogre fight 
//Ralph Perricelli
//CSC 111 Spring 2014
//Implements operations of ogre and giant classes

public class BattleTester {

	public static void main(String[] args) {
		
		//instance variables
		int round = 1;
		
		//Create new giants and ogres
		Giant myGiant = new Giant(100.0, 15.0);
		Ogre myOgre = new Ogre(60.0, 25.0);
		
		//makes it pretty
		System.out.println("Battle Log:");
		
		
		//starts battle and continues while both are alive
		while ((myGiant.getHealth() > 0 && myOgre.getHealth() > 0))
		{   
			myGiant.attack(myOgre);//attacks
			myOgre.attack(myGiant);//attacks
			
			//pretty output format
			System.out.println(round + ".  Ogre Health: " + myOgre.getHealth() + "  Giant Health: " + myGiant.getHealth());
			round++; //adds + 1 to round number
		}
		
		//checks and determines outcome of the battle
		if(myGiant.isAlive() == false && myOgre.isAlive() == true)
		{
			//checks to see if ogre has beaten the giant
			System.out.println("\nThe Ogre has won!!!");
			
		}
		else if(myGiant.isAlive()== true && myOgre.isAlive() == false)
		{
			//checks to see if ogre has lost to the giant
			System.out.println("\nThe Giant has won!!!");
		}
		else if(myGiant.isAlive()==false && myOgre.isAlive() == false) 
		{
			//lets us know they both died at the same time
			System.out.println("\nThey were both lost in combat :(");
			
		}else System.out.println("\nCheck Code for bug");//used for testing purposes only
	
		

	}

	
		
}

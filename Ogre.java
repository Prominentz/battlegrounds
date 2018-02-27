//Ralph Perricelli
//Ogre Class
//CSC 111 - Spring 2014
//Implements basic operations of a Giant

public class Ogre {
	
	//instance variables
	private double strength = 25.0;
	private double health = 60.0;
	
	//constructor
	public Ogre(double myHealth, double myStrength)
	{
		health = myHealth;
		strength = myStrength;
	}
	
	//instance methods for Giant
	//is alive method returns a boolean 
	public boolean isAlive()
	{
		//checks to see if the giant is alive by utilizing health var
		if(health < 0)
		{
			return false;//no longer alive return false
			
		}else return true;//default return var
	}
	
	//take damage method takes in a double and subtracts from health
	public void takeDamage(double damage)
	{
		health = (health - damage); //subtracts damage from health 
	}
	
	//attack method takes in a ogre and generates attack value to be used
	public void attack(Giant g)
	{
		//generates number between 0 and 1
		double temp = Math.random();
		double attackVal = (temp * strength);//calculates strength
		g.takeDamage(attackVal);//damages opponent
		
	}
	
	//getHealth used for returning health val as a double
	public double getHealth()
	{
		return health;//returns health as a double
	}
	
}
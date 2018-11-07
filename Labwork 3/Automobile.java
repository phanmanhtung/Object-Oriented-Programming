class Automobile 
{
	private double fuel;

	private double speed;
	private static String license;

        public double getFuel()  
        { 
		return fuel; 
	} 
   
	public double getSpeed()  
	{ 
		return speed; 
	} 
      
	public String getLicense()  
	{ 
		return license; 
	}

	public void init(double f, double s, String l) {
		fuel = f;
		speed = s;
		license = l;
	}
	public void accelerate(double v) {
		if (fuel > 0) speed += v;
	}

	public void decelerate(double v) {
		if (fuel <= 0) speed -= v;
	}
}

class AutomobileTest
{
	public static void main(String args[]) {
		Automobile LX = new Automobile();
		LX.init(4.5, 34 , "29JAD");
		LX.accelerate(4); // fuel > 0 -> speed + 4
		LX.decelerate(5); // fuel > 0 -> doesn't change
		System.out.println("LX's fuel: " + LX.getFuel());
		System.out.println("LX's current speed: " + LX.getSpeed());
		System.out.println("LX's license: " + LX.getLicense());
	}
}

public class CarTestDrive
{     
    public static void main (String[] args)  
    {
        Car newcar = new Car(); 
          
        // setting values of the variables  
        newcar.setstartMiles(34); 
        newcar.setendMiles(80); 
        newcar.setgallons(4); 
          
        // Displaying values of the variables
        System.out.println("car's startMiles: " + newcar.getstartMiles()); 
        System.out.println("car's endMiles: " + newcar.getendMiles()); 
        System.out.println("car's gallons: " + newcar.getgallons());  

	System.out.println("car's mile per gallon: " + newcar.calculateMilesPerGallon());    
    } 
} 

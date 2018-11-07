public class CowTestDrive
{     
    public static void main (String[] args)  
    { 
        Cow baby = new Cow(); 
          
        // setting values of the variables  
        baby.setName("BabyMonster"); 
        baby.setAge(1); 
        baby.setBreed("Australian"); 
          
        // Displaying values of the variables 
        System.out.println("cow's name: " + baby.getName()); 
        System.out.println("cow's age: " + baby.getAge()); 
        System.out.println("cow's breed: " + baby.getBreed()); 
        
	baby.moo();
        // Direct access of geekRoll is not possible 
        // due to encapsulation 
        // System.out.println("Geek's roll: " + obj.geekName);         
    } 
} 


public class Car 
{ 
    private double startMiles; 
    private double endMiles; 
    private double gallons; 
  
    public double getstartMiles()  
    { 
      return startMiles; 
    } 
   
    public double getendMiles()  
    { 
      return endMiles; 
    } 
       
    public double getgallons()  
    { 
       return gallons; 
    } 
   
    public void setstartMiles(double newstartMiles) 
    { 
      this.startMiles = newstartMiles; 
    }

    public void setendMiles(double newendMiles) 
    { 
      this.endMiles = newendMiles; 
    } 
 
    public void setgallons(double newgallons) 
    { 
      this.gallons = newgallons; 
    }

    public double calculateMilesPerGallon(){ return (endMiles - startMiles)/gallons; }
}
 
 

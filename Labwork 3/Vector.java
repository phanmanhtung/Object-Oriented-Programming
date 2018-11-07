public class Vector 
{ 
    private int x; 
    private int y;  
  
    public int getX()  
    { 
      return x; 
    } 
   
    public int getY()  
    { 
      return y; 
    } 
       
    public void setX(int newX) 
    { 
      x = newX; 
    } 
 
    public void setY(int newY) 
    { 
      y = newY; 
    } 
 
    public void add(Vector other)  
    { 
      x = x + other.x;
      y = y + other.y; 
    }
    public void subtract(Vector other)  
    { 
      x = x - other.x;
      y = y - other.y; 
    }
    public float dot(Vector other)  
    { 
      return x * other.x + y * other.y; 
    }

}

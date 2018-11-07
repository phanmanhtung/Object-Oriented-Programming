public class VectorTestDrive
{     
    public static void main (String[] args)  
    { 
        Vector A = new Vector();  // (3,6)
	Vector B = new Vector();  // (2,4)
          
        // setting values of the variables  
        A.setX(3); 
        A.setY(6); 
	B.setX(2); 
        B.setY(4);
          
        // Displaying values of the variables 
        System.out.println("x'A = " + A.getX()); 
        System.out.println("y'A = " + A.getY()); 
        System.out.println("x'B = " + B.getX()); 
        System.out.println("y'B = " + B.getY());    

	A.add(B);  // (5,10)
	System.out.println("New vector A = A + B");
        System.out.println("x'A = " + A.getX());
        System.out.println("y'A = " + A.getY());

        System.out.println("Dot product: A.B = " + A.dot(B)); // 2*5+4*10 = 50

    } 
} 


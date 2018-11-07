/* Exercise 1: Write a Java program to find min and max of an array of doubles:
• Size of the array is entered from the keyboard
• Values of elements of array are entered from the keyboard
• Print out min and max to the screen
• Use Scanner wrapper and nextDouble() method to get data from
keyboard */
import java.util.*; 
import java.util.Collections; 

class MinMax
{
   static Scanner userInput = new Scanner(System.in);
   public static void main(String[] args)
	{   System.out.println("Size of the array is entered from the keyboard");
	    System.out.print("Enter size: ");
	    double size = userInput.nextDouble();

	    ArrayList<Double> list = new ArrayList<Double>(); // ArrayList structure ( viết hoa type Int, Double, String )
	    for(int i=0; i<size; i++){
		 System.out.print("Enter an element: ");
	         double element = userInput.nextDouble();
		 list.add(element);
	    }

	    System.out.println("Min: " + Collections.min(list)); // Collections.min(list) -> function to find min, max
	    System.out.println("Max: " + Collections.max(list)); 

	}
}

/* Exercise 2: Write a Java program to find the middle element (median) of an
array of integers:
• Size of array is entered randomly from the keyboard
o
If the size is an odd number, then median is the middle
element
o
If the size is an even number, then median is the mean of the
two middle element
• Values of elements of array are entered from the keyboard
• Print out the middle element (median) to the screen
• Use Scanner wrapper and nextDouble() method to get data from
keyboard */

class Median
{
   static Scanner userInput = new Scanner(System.in);
   public static void main(String[] args)
	{   System.out.println("Size of the array is entered from the keyboard");
	    System.out.print("Enter size: ");
	    double size = userInput.nextDouble();

	    ArrayList<Double> numArray = new ArrayList<Double>(); // ArrayList structure ( viết hoa type Int, Double, String )
	    for(int i=0; i<size; i++){
		 System.out.print("Enter an element: ");
	         double element = userInput.nextDouble();
		 numArray.add(element); }

	    Collections.sort(numArray); // use Collenctions.method to sort, max, min

	    double median;
	    if (numArray.size() % 2 == 0)
   	 	median = ( (double)numArray.get(numArray.size()/2) + (double) numArray.get(numArray.size()/2 - 1) )/2;  // mainList.get(list_index)


	    else
    		median = (double) numArray.get(numArray.size()/2);
	    System.out.printf("Median: %.1f", median); // printf method is used for print number
	    System.out.println();
	}
}

import java.util.*;

public class Ex1
{
   static Scanner userInput = new Scanner(System.in);
   public static void main(String[] args)
   {
	double sequence_a[];
	double sequence_b[];
	double distance = 0;
	System.out.print("How many components in the vectors? ");
	int n = userInput.nextInt();
	userInput.nextLine();
	sequence_a = new double[n];

	System.out.print("Enter the sequence of numbers in vector X: ");
	for(int i=0; i<n; i++)
	      {
	        double a = userInput.nextDouble();
	        userInput.nextLine();
		sequence_a[i] = a;
	      }

	System.out.print("Enter the sequence of numbers in vector Y: ");
	sequence_b = new double[n];
	for(int i=0; i<n; i++){
	        double b = userInput.nextDouble();
	        userInput.nextLine();
		sequence_b[i] = b;
	}

	System.out.print("Vector X: ");
	for(int i=0; i<n; i++){
		System.out.print(sequence_a[i] + "   ");
	
	}
	System.out.println();

	System.out.print("Vector Y: ");
	for(int i=0; i<n; i++){
		System.out.print(sequence_b[i] + "   ");	
	}
	System.out.println();

	// Euclidean distance
	for(int i=0; i<n; i++){
		distance += (double) Math.pow( sequence_a[i] - sequence_b[i], 2);
	}
	System.out.printf("Euclidean distance: %.2f", Math.sqrt(distance));
	System.out.println();
	
   }
}

// Please use terminal to run the code -> java Filename

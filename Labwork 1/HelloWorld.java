import java.util.Scanner; 

class HelloWorld
{
    public static void main(String[] args)
     {
	for(int i=0; i<10; i++){ System.out.println("Hello World"); }
     }
}

/*Exercise 3: Write a Java program that reads 3 command-line arguments and prints them to the screen
in reverse order. These three command-line arguments present your personal information, including
your full name, your student ID and your email address.*/

class Ex3
{
   static Scanner userInput = new Scanner(System.in);

   public static void main(String[] args)
	{
	   System.out.print("Enter your Name: "); // println auto add 1 line more
	   String name = userInput.nextLine(); 

	   System.out.print("Your ID: ");
	   int id = userInput.nextInt();
// the Scanner.nextInt method does not consume the last newline character of your input
// and thus that newline is consumed in the next call to Scanner.nextLine
	   userInput.nextLine();  // Consume newline left-over

	   System.out.print("Email Address: ");
	   String address = userInput.nextLine();
	
	   System.out.println();
	   System.out.println("Email Address: "+address);
	   System.out.println("ID: "+id);
	   System.out.println("Name: "+name);
	}
}

/*Exercise 4: Write a Java program that reads an integer command-line argument n and prints a
“random” integer between 0 and n-1. Use Math.random() and Integer.parseInt() functions.*/

class Ex4
{
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
	{  
	   System.out.print("Enter a number: ");
	   String number = userInput.nextLine();

	   // Integer.parseInt(myString) -> convert a string into an int
	   int n = Integer.parseInt(number);
	   
	   // Math.random() returns a number from 0 to 1
	   // (int)(Math.random() * ((upperbound - lowerbound) + 1) + lowerbound)
	   // where lowerbound is inclusive and upperbound exclusive

	   for(int i=0; i<10; i++){ 
		int k = (int)(Math.random() * (n+1));			
		System.out.println(k);
	   }
	}
}


/*Exercise 5: Write a Java program that prints to the screen the following 19 lines:
9 bottles of beer we are going to drink, 9 bottles of beer.
Now try to drink one, drink one,
8 bottles of beer we are going to drink, 8 bottles of beer.
Now try to drink one, drink one,
...
1 bottle of beer we are going to drink, 1 bottle of beer.
Now try to drink one, drink one,
Oh no, no bottles of beer to drink now.*/

class Ex5
{
    public static void main(String[] args)
	{  
	   int bottles = 9;
	   while(bottles!=0)
		{
		    System.out.println(bottles+ " bottles of beer we are going to drink, " + bottles + " bottles of beer.");
		    System.out.println("Now try to drink one, drink one,");
		    bottles--;
		}
	   System.out.println("Oh no, no bottles of beer to drink now.");
	}
}

/*Exercise 6: Write a Java program to solve the following linear equation:
ax + b = 0
where the coefficients a, b are the real numbers from command-line argument. The program should
print to the screen to the root/roots of the linear equation.*/

class Ex6
{
   static Scanner userInput = new Scanner(System.in);
   public static void main(String[] args)
	{
	    System.out.println("This is the program solving ax + b = 0");
	    System.out.print("Enter a: ");
	    double a = userInput.nextDouble();
	    userInput.nextLine();

	    System.out.print("Enter b: ");
	    double b = userInput.nextDouble();
	    userInput.nextLine();
	    
   	    if(a==0){ System.out.println("There is no solution!"); }
	    else{ System.out.printf("Root: %.2f", (-b/a) ); } // printf - print_float
	}
}

/*Exercise 7: Write a Java program to solve the following quadratic equation:
ax 2 + bx + c = 0
where the coefficients a, b, c are the real numbers from command-line argument. The program
should print to the screen to the root/roots of the quadratic equation.*/

class Ex7
{
   static Scanner userInput = new Scanner(System.in);
   public static void main(String[] args)
	{
	    System.out.println("This is the program solving quadratic ax^2 + bx + c = 0");
	    System.out.print("Enter a: ");
	    double a = userInput.nextDouble();
	    userInput.nextLine();

	    System.out.print("Enter b: ");
	    double b = userInput.nextDouble();
	    userInput.nextLine();

	    System.out.print("Enter c: ");
	    double c = userInput.nextDouble();
	    userInput.nextLine();

	    double delta = Math.pow(b, 2) - 4*a*c;
	    if(delta<0) { System.out.println("There is no solution!"); }
	    else if(delta==0) { System.out.printf("There is only 1 solution: %.2f", -b/(2*a)); }
	    else{ System.out.printf("There is 2 solutions: %.2f and %.2f", (-b+Math.sqrt(delta))/(2*a), (-b-Math.sqrt(delta))/(2*a) ); }
	    System.out.println();
	}
}

/*Exercise 8: Write a Java program to calculate a leap year. The positive integer number n is read from
command-line argument. The program will print to the screen the message “n is a leap year” if n is
divisible by 4 and not divisible by 100, or n is divisible by 400. Otherwise, print to the screen the
message “n is not a leap year”. Use operator % to check the remainder.*/

class Ex8
{
   static Scanner userInput = new Scanner(System.in);
   public static void main(String[] args)
	{
	    System.out.print("Enter the year: ");
	    int year = userInput.nextInt();
	    userInput.nextLine();

	    if(((year%4==0)&(year%100!=0) || (year%400==0))){ System.out.println(year + " is a leap year"); }
	    else{ System.out.println(year + " is not a leap year"); }
	}
}

/*Exercise 9: Write a Java program that reads a sequence of n real numbers from command-line
argument, and prints to the screen their mean (average value) and sample standard deviation (square
root of the sum of the squares of their differences from the average, divided by n−1).*/

class Ex9
{
   static Scanner userInput = new Scanner(System.in);
   public static void main(String[] args)
	{
	   double sum=0, mean=0, std=0, sum_mean_sqr=0;
	   double sequence[];
	   System.out.print("How many real numbers in the sequence? ");
	   int n = userInput.nextInt();
	   userInput.nextLine();

	   System.out.print("Enter the sequence of numbers: ");
	   sequence = new double[n];
	   for(int i=0; i<n; i++)
	      {
	        double a = userInput.nextDouble();
	        userInput.nextLine();
		sequence[i] = a;
	      }

	   for(int i=0; i<sequence.length; i++)
	      {
		sum = sum + sequence[i];
	      }
	   mean = sum/n;
	   for(int i=0; i<sequence.length; i++)
	      {
		sum_mean_sqr = sum_mean_sqr + Math.pow(sequence[i]-mean, 2);
	      }
	   std = Math.sqrt(sum_mean_sqr/(n-1));
	   System.out.printf("The Mean is: %.2f\n", mean);
	   System.out.printf("The Standard Deviation: %.2f\n", std);
	}
}

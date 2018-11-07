import java.util.*;
import java.io.*;

public class Company
{
	static Scanner userInput = new Scanner(System.in);
	public static void main(String args[]) throws IOException{

	   System.out.print("Enter number of employees: ");
	   int n = userInput.nextInt();
	   userInput.nextLine();
	   Employee newGuy = new Employee();

	   File file = new File("Employees.txt");
	   file.createNewFile();
	   FileWriter writer = new FileWriter(file);
	   FileReader fr = new FileReader(file); 

 	   int order = 1;
	
	   for(int i=0; i<n; i++){	
	   	System.out.print("Enter employee's id: ");
		newGuy.setID(userInput.nextLine());
	   	System.out.print("Enter employee's full name: ");
		newGuy.setFullname(userInput.nextLine());
	   	System.out.print("Enter employee's birth date: ");
		newGuy.setBirthDate(userInput.nextLine());
	   	System.out.print("Enter employee's SC: ");
		newGuy.setSC(userInput.nextDouble());
	   	System.out.print("Enter employee's MC: ");
		newGuy.setMC(userInput.nextDouble());
	   	System.out.print("Enter employee's minimum salary: ");
		newGuy.setminimum_salary(userInput.nextDouble());
		System.out.println();

		System.out.println("Employee's Name: " + newGuy.getFullname());
		System.out.println("Employee's ID: " + newGuy.getID());
		System.out.println("Employee's Birth Date: " + newGuy.getBirthDate());
		System.out.println("Employee's Basic Salary: " + newGuy.getbasic_salary());
		System.out.println("Employee's Extra Salary: " + newGuy.getextra_salary());
		System.out.println("Employee's Minimum Salary: " + newGuy.getminimum_salary());
		System.out.println("Employee's SC: " + newGuy.getSC());
		System.out.println("Employee's MC: " + newGuy.getMC());

		writer.write("========================\n");
		writer.write("Order: " + order + "\n"); 
		writer.write("Employee's Name: " + newGuy.getFullname() + "\n");
		writer.write("Employee's ID: " + newGuy.getID() + "\n"); 
		writer.write("Employee's Birth Date: " + newGuy.getBirthDate() + "\n"); 
		writer.write("Employee's Basic Salary: " + newGuy.getbasic_salary() + "\n"); 
		writer.write("Employee's Extra Salary: " + newGuy.getextra_salary() + "\n"); 
		writer.write("Employee's Minimum Salary: " + newGuy.getminimum_salary() + "\n"); 
		writer.write("Employee's MC: " + newGuy.getMC() + "\n");
		writer.write("========================\n");
		order = order + 1;

		char[] a = new char[50];
		fr.read(a);
		for(char c : a){ System.out.print(c); }
		System.out.println();
		userInput.nextLine(); // cách tránh dòng input tiếp theo bị nuốt mất

	    }
	    writer.close();
	    fr.close();
	}
}

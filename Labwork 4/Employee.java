/* Exercise 3: Write a Java program to manage the employees of a company as
follows:
• Number of employees (n) is entered from keyboard
• Information of each employee is entered from keyboard, including:
o ID
o Full name
o Date of birth
o Department
o Working position
o Start working date
o Seniority coefficient
o Monthly performance evaluation coefficient
• Information of n employees are saved in a text file named: employees.txt
• Read information of employees from saved employees.txt file and print
out to the screen the information of n employees as follows:
(a) Two consecutive employees are separated by the following block:
=================================
Order: 1
Employee ID: 34586
=================================
(b) For each block, the following information of the employee is
displayed:
o Employee full name
o Employee date of birth
o Employee department
o Employee working position
o Number of months of working
o Basic salary = seniority_coefficient * minimum_salary
o Extra salary = monthly_performance_evaluation_coefficient *
basic_salary
o Salary = basic_salary + extra_salary
Note: minimum_salary is entered from keyboard */

import java.util.*;

public class Employee
{
	private static String ID;
	private static String Fullname;
	private static String BirthDate;
	private String Department;
	private String Position;
	private static String StartDate ;
	private double SC; // Seniority coefficient
	private double MC; // Monthly performance evaluation coefficient
	private double minimum_salary;
	private double basic_salary;
	private double extra_salary;

	public String getID(){ return ID; }
	public String getFullname(){ return Fullname; }
	public String getBirthDate(){ return BirthDate; }
	public String getDepartment(){ return Department; }
	public String getPosition(){ return Position; }
	public String getStartDate(){ return StartDate; }
	public double getSC(){ return SC; }
	public double getMC(){ return MC; }
	public double getminimum_salary(){ return minimum_salary; }
	public double getbasic_salary(){ basic_salary = SC * (double) minimum_salary; return basic_salary; }
	public double getextra_salary(){ extra_salary = MC * (double) basic_salary; return extra_salary; }

	public void setID(String newID){ ID = newID; }
	public void setFullname(String newFullname){ Fullname = newFullname; }
	public void setBirthDate(String newBirthDate){ BirthDate = newBirthDate; }
	public void setDepartment(String newDepartment){ Department = newDepartment; }
	public void setPosition(String newPosition){ Position = newPosition; }
	public void setStartDate(String newStartDate){ ID = newStartDate; }
	public void setSC(double newSC){ SC = newSC; }
	public void setMC(double newMC){ MC = newMC; }
	public void setminimum_salary(double newminimum_salary){ minimum_salary = newminimum_salary; }

}

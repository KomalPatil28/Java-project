/*Design an Employee Payroll System using java,implementinjg multiple inheritance with  
classes for Employee,Salary,and TaxCalculator .The Systemshouls manage employee details
salary calculations and tax deduction*/
package chapter6;
import java.util.Scanner;
interface Employee {
	void employeeDetails();
}
interface Salary
{
	void salaryDetails();
	double Netsalary();
}
interface TaxCalculator
{
	double  calculateTax();
}
class EmployeePayroll implements Employee,Salary,TaxCalculator
{
	private String name;
	private int employID;
	private double BasicSalary;
	private double grossSalary;
	private double netSalary;
	
	public EmployeePayroll(String name,int employID,double BasicSalary)
	{
		this.name=name;
		this.employID=employID;
		this.BasicSalary=BasicSalary;
	}
	@Override
	public void employeeDetails()
	{
		System.out.println("Employee Name:"+name);
		System.out.println("Employee ID:"+employID);
	}
	public void salaryDetails()
	{
		
	    this.grossSalary=BasicSalary;
	}
	@Override
	public double Netsalary()
	{
		double taxAmount=calculateTax();
        netSalary=grossSalary-taxAmount;
        return netSalary;
	}
	@Override
	public double calculateTax()
	{
		if(BasicSalary<=50000)
		{
			return 0.05*BasicSalary;
		}
		else
		{
			return 0.1*BasicSalary;
		}
	}
}
public class Assignment6_2
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Employee Name:");
		String name=scan.nextLine();
		System.out.println("Enter Employee ID:");
		int employID=scan.nextInt();
		System.out.println("Enter Basic Salary:");
		double BasicSalary=scan.nextDouble();
		
		EmployeePayroll emp=new EmployeePayroll(name,employID,BasicSalary);
		System.out.println("\nEmployee Details:");
		emp.employeeDetails();
		System.out.println("\nSalary Details:");
		emp.salaryDetails();
		System.out.println("Net Salary:Rs."+emp.Netsalary());
		System.out.println("Tax Deducted:Rs."+emp.calculateTax());
		scan.close();
	}
}

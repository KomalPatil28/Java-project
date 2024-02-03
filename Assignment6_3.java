/*Create a hierarchy of employees using multilevel inheritance.Start with a base class 
 * "Employee"having attributes such as name and employee ID.then,derive two classes 
 * "Manager" and "Engineer"from the base class.Additionally create a class "TeamLead"
 * that inherits from the "Manmager" class.Implement method in each class to display 
 * information about the rrspective type of employee.*/
#In this code we had gone through the multilevel inheritance.
package chapter6;
class emp
{
	protected String name;
	protected int employID;
	protected String designation;
	
	emp(String name,int employID,String designation)
	{
		this.name=name;
		this.employID=employID;
		this.designation=designation;
	}
	void infoDisplay()
	{
		System.out.println("Employee Name:"+name);
		System.out.println("Employee ID:"+employID);
		System.out.println("designation:"+designation+"\n");
	}
}
class Manager extends emp
{
	Manager(String name,int employID,String designation)
	{
		super(name,employID,designation);
	}
}
class Engineer extends emp
{
	Engineer(String name,int employID,String designation)
	{
		super(name,employID,designation);
	}
}
class TeamLead extends Manager
{
	TeamLead(String name,int employID,String designation)
	{
		super(name,employID,designation);
	}
}
public class Assignment6_3
{
	public static void main(String[]args)
	{		
		Manager manager=new Manager("Komal Patil",1234,"Manager");
		manager.infoDisplay();
		Engineer engineer=new Engineer("Sanika Raut",2341,"Engineer");
		engineer.infoDisplay();
		TeamLead teamlead=new TeamLead("Samiksha Pawar",3421,"Team Leader");
		teamlead.infoDisplay();
	}
}

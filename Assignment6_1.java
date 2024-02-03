/*Write a java program to calculate the average of 4 semesters.Display the average of 
Sem1,sem2,sem3 and sem4 and the total average of all 4 semesters using single inhertance*/
#In this code we had used single inheritance to find the average of the semester.
	
package chapter6;
import java.util.Scanner;
class Semester  {
	public double sem1,sem2,sem3,sem4;
	public String studentname;
	public Semester(String studentname,double sem1,double sem2,double sem3,double sem4)
	{
		this.studentname=studentname;
		this.sem1=sem1;
		this.sem2=sem2;
		this.sem3=sem3;
		this.sem4=sem4;
	}
	public void displayAvg()
	{
		System.out.println("\nName of the Student:"+studentname);
		System.out.println("\nAverage of Semester 1:"+sem1);
		System.out.println("Average of Semester 2:"+sem2);
		System.out.println("Average of Semester 3:"+sem3);
		System.out.println("Average of Semester 4:"+sem4);
	}
	public double avgCalculation()
	{
		return (sem1+sem2+sem3+sem4)/4;
	}
}
class TotalAvg extends Semester
{
	public TotalAvg(String studentname,double sem1,double sem2,double sem3,double sem4)
	{
		super(studentname,sem1,sem2,sem3,sem4);
	}
	public void TotalAvgCal()
	{
		double totalAvgerage=avgCalculation();
		System.out.println("\nThe total average of 4 Semester:"+totalAvgerage);
	}	
}
public class Assignment6_1
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Name of the Student:");
		String studentname=scan.nextLine();
		System.out.println("Enter Average of Sem 1:");
		double sem1=scan.nextDouble();
		System.out.println("Enter Average of Sem 2:");
		double sem2=scan.nextDouble();
		System.out.println("Enter Average of Sem 3:");
		double sem3=scan.nextDouble();
		System.out.println("Enter Average of Sem 4:");
		double sem4=scan.nextDouble();
		
		TotalAvg avg=new TotalAvg(studentname,sem1,sem2,sem3,sem4);
		avg.displayAvg();
		avg.TotalAvgCal();
		scan.close();
		
	} 
}

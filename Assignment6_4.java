/*Create a hierarchy of library items using hierarchical inheritance.Define a class 
"LibraryItem" with attributes like title and item ID.Derive two classes "Book" and "DVD"
from the base class.Implement methods to display information about each type of library
item*/
package chapter6;
class LibraryItem {
	public String title;
	public int itemID;
	
	public LibraryItem(String title,int itemID)
	{
		this.title=title;
		this.itemID=itemID;
	}
	public void displayInfo()
	{
		System.out.println("Title:"+title);
		System.out.println("Item ID:"+itemID);
	}
}
class Book extends LibraryItem
{
	public String author;
	public Book(String title,int itemID,String author)
	{
		super(title,itemID);
		this.author=author;
	}
	@Override
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("Author:"+author+"\n");
	}
}
class DVD extends LibraryItem
{
	public String director;
	public DVD(String title,int itemID,String director)
	{
		super(title,itemID);
		this.director=director;
	}
	@Override
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("Director:"+director+"\n");
	}
}
public class Assignment6_4
{
	public static void main(String[]args)
	{
		Book book=new Book("End With Us",001,"Collen Hoover");
		book.displayInfo();
		DVD dvd=new DVD("Conjuring 1",001,"James Wan");
		dvd.displayInfo();
	}
}


package com.sj;

import java.util.Scanner;

public class Admin {
	public static void main(String args[])
	{
		int c;
		Scanner s=new Scanner(System.in);
		database d=new database();
		do
		{
			System.out.println("press 1 to show all books");
			System.out.println("press 2 to search for books by title");
			System.out.println("press 3 to insert book");
			System.out.println("press 4 to delete book");
			System.out.println("press 5 to update book");
			System.out.println("press 6 to exit");
			c=s.nextInt();
			switch(c)
			{
			case 1:
				d.showdetails();
				break;
			case 2:
				System.out.println("enter title name");
				String name=s.next();
				d.viewByname(name);
				break;
			case 3:
				System.out.println("enter book id");
				int id1=s.nextInt();
				System.out.println("enter book name");
				String name1=s.next();
				System.out.println("enter author name");
				String author=s.next();
				System.out.println("enter price of book");
				int price=s.nextInt();
				Book b=new Book(id1,name1,author,price);
				System.out.println("Inserted successfully");
				break;
			case 4:
				System.out.println("enter the id of book to delete");
				int id2=s.nextInt();
				d.delete(id2);
				System.out.println("deleted successfully");
				break;
			case 5:
				System.out.println("Enter book id to update");
				int id3=s.nextInt();
				System.out.println("enter price");
				int p1=s.nextInt();
				d.update(id3,p1);
				System.out.println("updated successfully");
				break;
			case 6:
				default:System.out.println("thankyou");
				break;
				
				
				
				
				
				
			}
			
		}
		while(c!=6);
		
	}

}

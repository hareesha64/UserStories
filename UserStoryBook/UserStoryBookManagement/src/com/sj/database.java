package com.sj;

import java.util.Iterator;
import java.util.TreeSet;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class database {
	TreeSet<Book> set=new TreeSet<Book>();
	public database()
	{
		Book b1=new Book(1,"java","james",30000);
		Book b2=new Book(2,"c","dennis",20000);
		Book b3=new Book(3,"C++","gosling",40000);
		set.add(b1);
		set.add(b2);
		set.add(b3);
		
	}
	public void showdetails()
	{
		Iterator<Book> itr=set.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	public void viewByname(String name)
	{
		for(Book b:set)
		{
			if(b.Title.contentEquals(name))
			{
				System.out.println(b);
			}
		}
	}
	public void insert(Book b)
	{
		set.add(b);
	}
	public void delete(int id2)
	{
		Iterator<Book>itr1=set.iterator();
		if(id2==itr1.hasNext().bookId)
		{
			itr1.remove();
		}
		else
			System.out.println("no book found");
		
		
	}
	public void update(int id,int price)
	{
		TreeSet<Book> bookSet=new TreeSet<Book>();
		Iterator<Book> itr=set.iterator();
		while(itr.hasNext())
		{
			
			Book temp=itr.next();
			if(temp.bookId==id)
			{
				String title=temp.Title;
				String author=temp.Author;
				
				itr.remove();
				Book b=new Book(id,title,author,price);
				bookSet.add(b);
				System.out.println("details updated");
			}
}
		
	}
	

}

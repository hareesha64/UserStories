package com.sj.DAO;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sj.service.Book;

public interface BookDAO {
	
	

	public Book createBook(Book book) ;
		// TODO Auto-generated method stub
	public List<Book> showAll();
		
	

}

package com.sj;

public class Book implements Comparable<Book>{
	int bookId;
	String Title;
	String Author;
	int price;
	

	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public String getTitle() {
		return Title;
	}


	public void setTitle(String title) {
		Title = title;
	}


	public String getAuthor() {
		return Author;
	}


	public void setAuthor(String author) {
		Author = author;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Author == null) ? 0 : Author.hashCode());
		result = prime * result + ((Title == null) ? 0 : Title.hashCode());
		result = prime * result + bookId;
		result = prime * result + price;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (Author == null) {
			if (other.Author != null)
				return false;
		} else if (!Author.equals(other.Author))
			return false;
		if (Title == null) {
			if (other.Title != null)
				return false;
		} else if (!Title.equals(other.Title))
			return false;
		if (bookId != other.bookId)
			return false;
		if (price != other.price)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", Title=" + Title + ", Author=" + Author + ", price=" + price + "]";
	}


	public Book(int bookId, String title, String author, int price) {
		super();
		this.bookId = bookId;
		Title = title;
		Author = author;
		this.price = price;
	}
	public Book()
	{
		
	}
	
	

}

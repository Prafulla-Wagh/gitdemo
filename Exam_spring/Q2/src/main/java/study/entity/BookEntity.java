package study.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class BookEntity {

	@Id
	@Column
	private int bookId;
	
	@Column
	private int bookCost;
	
	@Column
	private String bookName;

	
	
	public BookEntity() {
		// TODO Auto-generated constructor stub
	}



	public BookEntity(int bookId, int bookCost, String bookName) {
		super();
		this.bookId = bookId;
		this.bookCost = bookCost;
		this.bookName = bookName;
	}



	public int getBookId() {
		return bookId;
	}



	public void setBookId(int bookId) {
		this.bookId = bookId;
	}



	public int getBookCost() {
		return bookCost;
	}



	public void setBookCost(int bookCost) {
		this.bookCost = bookCost;
	}



	public String getBookName() {
		return bookName;
	}



	public void setBookName(String bookName) {
		this.bookName = bookName;
	}



	@Override
	public String toString() {
		return "Book Id=" + bookId + ", Book Cost=" + bookCost + ", Book Name=" + bookName;
	}
	

	
	
	
	
	
	
}

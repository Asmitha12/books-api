package com.cg.books.learn.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Books")
public class Books {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ID;
	private double Amount;
	private String BookName;
	private String BookAouther;
		
	public Books() {
	}
	
	public Books(int iD, double amount, String bookName, String bookAouther) {
		ID = iD;
		Amount = amount;
		BookName = bookName;
		BookAouther = bookAouther;
	}

	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public double getAmount() {
		return Amount;
	}
	public void setAmount(double amount) {
		Amount = amount;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getBookAouther() {
		return BookAouther;
	}
	public void setBookAouther(String bookAouther) {
		BookAouther = bookAouther;
	}
	
	@Override
	public String toString() {
		return "Books [ID=" + ID + ", Amount=" + Amount + ", BookName=" + BookName + ", BookAouther=" + BookAouther
				+ "]";
	}
	
	
}

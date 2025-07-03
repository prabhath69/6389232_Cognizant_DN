package com.library.service;

import com.library.repository.*;

public class BookService {
	private BookRepository repo=new BookRepository();
	
	public void data(String name) {
		System.out.println("The book "+name+" is present in the library");
		repo.addBook(name);
	}
}

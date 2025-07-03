package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
	private BookRepository repo;
	
	public void setBookRepository(BookRepository repo) {
		this.repo = repo;
	}
	
	public void data(String name) {
		System.out.println("The book "+name+" is present in the library");
		repo.addBook(name);
	}
}

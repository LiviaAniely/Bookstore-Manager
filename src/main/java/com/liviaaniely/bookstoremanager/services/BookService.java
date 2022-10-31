package com.liviaaniely.bookstoremanager.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liviaaniely.bookstoremanager.entities.Book;
import com.liviaaniely.bookstoremanager.repositories.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;


	public String create(Book book) {
		Book savedBook = bookRepository.save(book);
		return "Book created with ID " + savedBook.getId();
	}

}

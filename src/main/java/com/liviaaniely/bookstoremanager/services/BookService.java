package com.liviaaniely.bookstoremanager.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liviaaniely.bookstoremanager.dto.BookDTO;
import com.liviaaniely.bookstoremanager.entities.Book;
import com.liviaaniely.bookstoremanager.repositories.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;


	public String create(BookDTO bookDTO) {
		
		Book bookToSave = new Book(bookDTO.getName(),bookDTO.getPages(),bookDTO.getChapters(),bookDTO.getIsbn(),bookDTO.getPublisherName(),bookDTO.getAuthor());
		
		Book savedBook = bookRepository.save(bookToSave);
		
		return "Book created with ID " + savedBook.getId();
	}

	public BookDTO findById(Long id) {
		Book book = this.bookRepository.findById(id).get();
		
		BookDTO bookDTO = new BookDTO(book.getName(),book.getPages(),book.getChapters(),book.getIsbn(),book.getPublisherName(),book.getAuthor());
		
		return bookDTO;
	}
}

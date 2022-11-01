package com.liviaaniely.bookstoremanager.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liviaaniely.bookstoremanager.dto.BookDTO;
import com.liviaaniely.bookstoremanager.services.BookService;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

	@Autowired
	private BookService bookService;
	
	@PostMapping
	public String create(@RequestBody @Valid BookDTO bookDTO) {
		return this.bookService.create(bookDTO);
	}
	
}

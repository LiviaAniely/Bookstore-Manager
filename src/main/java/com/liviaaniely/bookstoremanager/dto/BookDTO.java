package com.liviaaniely.bookstoremanager.dto;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.liviaaniely.bookstoremanager.entities.Author;

public class BookDTO {

	private Long id;

	@NotBlank
	@Size(max = 250)
	private String name;

	@NotNull
	private Integer pages;

	@NotNull
	private Integer chapters;

	@NotBlank
	@Size(max = 100)
	private String isbn;

	@NotBlank
	@Size(max = 250)
	private String publisherName;

	@Valid
	@NotNull
	private Author author;

	public BookDTO(String name, Integer pages, Integer chapters, String isbn, String publisherName,
			Author author) {
		this.name = name;
		this.pages = pages;
		this.chapters = chapters;
		this.isbn = isbn;
		this.publisherName = publisherName;
		this.author = author;
	}

	public BookDTO() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public Integer getChapters() {
		return chapters;
	}

	public void setChapters(Integer chapters) {
		this.chapters = chapters;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
}

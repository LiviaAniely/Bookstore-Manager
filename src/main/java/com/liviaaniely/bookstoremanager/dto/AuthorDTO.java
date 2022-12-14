package com.liviaaniely.bookstoremanager.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AuthorDTO {

	private Long id;

	@NotBlank
	@Size(max = 250)
	private String name;

	@NotNull
	@Size(max = 100)
	private Integer age;

	public AuthorDTO(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public AuthorDTO() {
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}

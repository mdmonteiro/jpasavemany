package com.devsuperior.aula.dtos;

import com.devsuperior.aula.entities.Category;

public class CategoryDTO {

	private Long id;

	private String name;

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

	public CategoryDTO() {

	}

	public CategoryDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public CategoryDTO(Category category) {
		id = category.getId();
		name = category.getName();
	}

}

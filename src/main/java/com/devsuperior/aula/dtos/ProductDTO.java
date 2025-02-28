package com.devsuperior.aula.dtos;

import java.util.ArrayList;
import java.util.List;

import com.devsuperior.aula.entities.Product;

public class ProductDTO {

	private Long id;

	private String name;

	private Double price;

	private List<CategoryDTO> categories = new ArrayList<>();

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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public List<CategoryDTO> getCategories() {
		return categories;
	}

	public void setCategories(List<CategoryDTO> categories) {
		this.categories = categories;
	}
	
	public ProductDTO() {
		
	}

	public ProductDTO(Long id, String name, Double price, List<CategoryDTO> categories) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.categories = categories;
	}

	public ProductDTO(Product product) {
		id = product.getId();
		name = product.getName();
		price = product.getPrice();
		product.getCategories().stream().forEach(c -> categories.add(new CategoryDTO(c)));

	}

}

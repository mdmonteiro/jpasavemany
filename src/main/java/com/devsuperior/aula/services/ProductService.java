package com.devsuperior.aula.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.aula.dtos.ProductDTO;
import com.devsuperior.aula.entities.Product;
import com.devsuperior.aula.repositories.CategoryRepository;
import com.devsuperior.aula.repositories.ProductRepository;

import jakarta.transaction.Transactional;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Transactional
	public ProductDTO insert(ProductDTO dto) {
		Product product = new Product(dto.getId(), dto.getName(), dto.getPrice());
		dto.getCategories().stream()
				.forEach(c -> product.getCategories().add(categoryRepository.getReferenceById(c.getId())));

		productRepository.save(product);

		return new ProductDTO(product);
	}

}

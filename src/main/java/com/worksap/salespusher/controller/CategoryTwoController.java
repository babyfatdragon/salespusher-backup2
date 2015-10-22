package com.worksap.salespusher.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.worksap.salespusher.entity.CategoryTwoEntity;
import com.worksap.salespusher.repository.CategoryTwoRepository;

@RestController
public class CategoryTwoController {
	private final CategoryTwoRepository categoryTwoRepository;
	
	@Autowired
	public CategoryTwoController(CategoryTwoRepository categoryTwoRepository){
		this.categoryTwoRepository = categoryTwoRepository;
	}
	
	@RequestMapping(value = "/categorytwos", method = RequestMethod.GET)
	@PreAuthorize("isAuthenticated()")
	public List<CategoryTwoEntity> getCategoryTwos(){
		return this.categoryTwoRepository.findAll();
	}
}

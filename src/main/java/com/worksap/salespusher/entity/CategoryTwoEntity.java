package com.worksap.salespusher.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="categorytwo")
public class CategoryTwoEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="categorytwo_name")
	private String categoryTwoName;
	
	protected CategoryTwoEntity() {}
	
	public CategoryTwoEntity(String categoryTwoName) {
		this.categoryTwoName = categoryTwoName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategoryTwoName() {
		return categoryTwoName;
	}

	public void setCategoryTwoName(String categoryTwoName) {
		this.categoryTwoName = categoryTwoName;
	}
	
	
	
	
}

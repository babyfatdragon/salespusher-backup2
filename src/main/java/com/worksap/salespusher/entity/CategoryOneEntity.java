package com.worksap.salespusher.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="categoryone")
public class CategoryOneEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="categoryone_name")
	private String categoryOneName;
	
	protected CategoryOneEntity(){}

	public CategoryOneEntity(String categoryOneName) {
		this.categoryOneName = categoryOneName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategoryOneName() {
		return categoryOneName;
	}

	public void setCategoryOneName(String categoryOneName) {
		this.categoryOneName = categoryOneName;
	}

	
	
	
}

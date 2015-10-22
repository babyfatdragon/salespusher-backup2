package com.worksap.salespusher.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class ProductEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="product_name")
	private String productName;
	@Column(name="first_category")
	private Integer firstCategory;
	@Column(name="second_category")
	private Integer secondCategory;
	private String overview;
	private String technology;
	private String specification;
	private int price;
	
	protected ProductEntity() {}

	public ProductEntity(String productName,int firstCategory,int secondCategory, String overview, String technology, String specification, int price){
		this.productName = productName;
		this.firstCategory = firstCategory;
		this.secondCategory = secondCategory;
		this.overview = overview;
		this.technology = technology;
		this.specification = specification;
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getFirstCategory() {
		return firstCategory;
	}

	public void setFirstCategory(Integer firstCategory) {
		this.firstCategory = firstCategory;
	}

	public Integer getSecondCategory() {
		return secondCategory;
	}

	public void setSecondCategory(Integer secondCategory) {
		this.secondCategory = secondCategory;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public String getSpecification() {
		return specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}

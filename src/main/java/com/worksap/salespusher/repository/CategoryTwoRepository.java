package com.worksap.salespusher.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.worksap.salespusher.entity.CategoryTwoEntity;

public interface CategoryTwoRepository extends JpaRepository<CategoryTwoEntity,Long>{
	CategoryTwoEntity findById(long id);
}

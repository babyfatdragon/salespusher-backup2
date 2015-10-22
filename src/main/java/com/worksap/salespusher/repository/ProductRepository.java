package com.worksap.salespusher.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.worksap.salespusher.entity.ProductEntity;
import com.worksap.salespusher.entity.UserEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
    ProductEntity findById(long id);
}

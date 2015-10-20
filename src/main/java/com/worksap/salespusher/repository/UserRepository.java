package com.worksap.salespusher.repository;

import org.springframework.data.repository.CrudRepository;

import com.worksap.salespusher.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Long> {

    UserEntity findByusername(String username);
}


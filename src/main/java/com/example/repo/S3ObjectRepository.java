package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.S3Object;

@Repository
public interface S3ObjectRepository extends  JpaRepository<S3Object, Long> {
	
	
	
	
	
}

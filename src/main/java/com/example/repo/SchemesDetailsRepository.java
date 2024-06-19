package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.SchemesDetails;

@Repository
public interface SchemesDetailsRepository extends JpaRepository<SchemesDetails, Long> {

	boolean existsBySchemeCode(String schemeCode);

	boolean existsBySchemeName(String encString);

}

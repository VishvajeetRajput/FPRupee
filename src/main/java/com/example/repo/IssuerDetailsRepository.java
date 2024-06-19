package com.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entity.IssuerDetails;

@Repository
public interface IssuerDetailsRepository extends JpaRepository<IssuerDetails, Long> {

	boolean existsByIssuerId(Long issuerId);

	boolean existsByIssuerPhone(String encString);

	boolean existsByIssuerEmail(String encString);

	boolean existsByIssuerPhoneAndIssuerEmail(String encString, String encString2);


	
	@Query(value = "SELECT * FROM ISSUER_DETAILS bd ORDER BY bd.CREATION_DATE DESC", nativeQuery = true)

	List<IssuerDetails> findAllIssuer(org.springframework.data.domain.Pageable pageable);
	

	@Query(value = "SELECT  count(*) FROM ISSUER_DETAILS", nativeQuery = true)
	int totalIssueriesRecords();

	@Query(value = "SELECT * FROM fperupi.issuer_details where creation_date between ?1 AND ?2", nativeQuery = true)
	List<IssuerDetails> issuerDATAWithDate(String from ,String to);
	
}


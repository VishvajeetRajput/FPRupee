package com.example.repo;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entity.BenificieryDetails;

@Repository
public interface BenificieryDetailsRepository extends JpaRepository<BenificieryDetails, Long> {

	boolean existsByBenificieryMobileNo(String benificieryMobileNo);

	boolean existsByBenificieryEmail(String benificieryEmail);

	boolean existsByBenificieryMobileNoAndBenificieryEmail(String benificieryMobileNo, String benificieryEmail);

	boolean existsByBenificieryId(Long benificieryId);

	@Query(value = "SELECT * FROM BENIFICIERY_DETAILS bd ORDER BY bd.CREATION_DATE DESC", nativeQuery = true)
	List<BenificieryDetails> findAllBenificieries(Pageable pageable);

	@Query(value = "SELECT  count(*) FROM BENIFICIERY_DETAILS", nativeQuery = true)
	int totalBenificieriesRecords();

}

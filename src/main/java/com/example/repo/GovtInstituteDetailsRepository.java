package com.example.repo;

import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entity.GovtInstituteDetails;

@Repository
public interface GovtInstituteDetailsRepository extends JpaRepository<GovtInstituteDetails, Long> {
	
	boolean existsByDeapartmentContactNo(String deapartmentContactNo);

	boolean existsByDeapartmentEmail(String deapartmentEmail);

	boolean existsByDeapartmentContactNoAndDeapartmentEmail(String deapartmentContactNo, String deapartmentEmail);
	
	boolean existsByGovtInstituteId(Long deapartmentId);
	
	@Query(value = "SELECT * FROM GOVT_INSTITUTE_DETAILS md ORDER BY md.CREATION_DATE DESC", nativeQuery = true)
	List<GovtInstituteDetails> findAllInstitute(Pageable pageable);
	
	
}

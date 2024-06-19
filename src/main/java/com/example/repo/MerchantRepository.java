package com.example.repo;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entity.Merchant;

@Repository
public interface MerchantRepository extends JpaRepository<Merchant, Long> {

	boolean existsByMerchantMobile(String merchantMobile);

	boolean existsByMerchantEmail(String merchantEmail);

	boolean existsByMerchantMobileAndMerchantEmail(String merchantMobile, String merchantEmail);
	
	boolean existsByMerchantId(Long merchantId);
	@Query(value = "SELECT * FROM MERCHANTS_DETAILS md ORDER BY md.MERCHANT_CREATIONDATE DESC", nativeQuery = true)
	List<Merchant> findAllMerchant(Pageable pageable);

	
	
}

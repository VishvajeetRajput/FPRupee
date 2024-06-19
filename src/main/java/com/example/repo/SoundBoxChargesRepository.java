package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.SoundBoxCharges;

@Repository
public interface SoundBoxChargesRepository extends JpaRepository<SoundBoxCharges, Long> {

	
}
